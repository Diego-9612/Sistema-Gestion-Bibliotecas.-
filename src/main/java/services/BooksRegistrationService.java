package services;

import ImplDAO.BooksImpl;
import interfacesDAO.BooksInterface;
import java.awt.Component;
import javax.swing.JOptionPane;
import models.Books;

/**
 *
 * @author Diego Guerrero
 */
public class BooksRegistrationService {

    public String saveUpdateBook(Component parentComponent, Books book) throws Exception {
        try {
            if (!validateFields(book)) {
                JOptionPane.showMessageDialog(parentComponent, "Debe Completar Todos los Campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                return book.getTitle();
            }

            BooksInterface books = new BooksImpl();

            if (book.getBooksID() == 0) {
                // Usuario nuevo
                books.registerBook(book);
                JOptionPane.showMessageDialog(parentComponent, "Libro Registrado con EXITO", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Usuario existente
                books.modifyBook(book);
                JOptionPane.showMessageDialog(parentComponent, "Libro Modificado con EXITO", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentComponent, "Ocurrió un ERROR al Guardar el Libro\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return null;
    }

    private boolean validateFields(Books book) {
        return !book.getTitle().isEmpty()
                && book.getPublicationDate() != null
                && !book.getAuthor().isEmpty()
                && !book.getCategory().isEmpty()
                && !book.getDescription().isEmpty()
                && book.getEdition() > 0
                && !book.getLanguage().isEmpty()
                && book.getPages() > 0
                && book.getSpecimens() > 0
                && book.getStock() > 0;
    }

}
