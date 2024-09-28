package ImplDAO;

import dataBase.DataBase;
import interfacesDAO.BooksInterface;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Books;

/**
 *
 * @author Diego Guerrero
 */
public class BooksImpl extends DataBase implements BooksInterface {

    @Override
    public void registerBook(Books book) throws Exception {

        try {
            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("INSERT INTO books(title, publicationDate, author, category, edition, language, pages, description, specimens, stock, available) VALUES (?,?,?,?,?,?,?,?,?,?,?);")) {
                st.setString(1, book.getTitle());
                st.setDate(2, (Date) book.getPublicationDate());
                st.setString(3, book.getAuthor());
                st.setString(4, book.getCategory());
                st.setInt(5, book.getEdition());
                st.setString(6, book.getLanguage());
                st.setInt(7, book.getPages());
                st.setString(8, book.getDescription());
                st.setInt(9, book.getSpecimens());
                st.setInt(10, book.getStock());
                st.setBoolean(11, book.isAvailable());
                st.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }

    }

    @Override
    public void modifyBook(Books book) throws Exception {

        try {
            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("UPDATE books SET title = ?, publicationDate = ?, author = ?, category = ?, edition = ?, language = ?, pages = ?, description = ?, specimens = ?, stock = ?, available = ?) WHERE booksID = ?;")) {
                st.setString(1, book.getTitle());
                st.setDate(2, (Date) book.getPublicationDate());
                st.setString(3, book.getAuthor());
                st.setString(4, book.getCategory());
                st.setInt(5, book.getEdition());
                st.setString(6, book.getLanguage());
                st.setInt(7, book.getPages());
                st.setString(8, book.getDescription());
                st.setInt(9, book.getSpecimens());
                st.setInt(10, book.getStock());
                st.setBoolean(11, book.isAvailable());
                st.setInt(12, book.getBooksID());
                st.executeUpdate();
                st.close();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }

    }

    @Override
    public void deleteBook(int bookId) throws Exception {

        try {
            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("DELETE FROM books WHERE booksID = ?;")) {
                st.setInt(1, bookId);
                st.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
    }

    @Override
    public List<Books> listBooks(String title) throws Exception {

        List<Books> listaBooks = null;
        try {

            this.connect();
            String Query = title.isEmpty() ? "SELECT * FROM books;" : "SELECT * FROM books WHERE names LIKE '%" + title + "%';";

            try (PreparedStatement st = this.conexion.prepareStatement(Query)) {
                listaBooks = new ArrayList();
                try (ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {
                        Books book = new Books();
                        book.setBooksID(rs.getInt("booksID"));
                        book.setTitle(rs.getString("title"));
                        book.setPublicationDate(rs.getDate("publicationDate"));
                        book.setAuthor(rs.getString("author"));
                        book.setCategory(rs.getString("category"));
                        book.setEdition(rs.getInt("edition"));
                        book.setLanguage(rs.getString("lenguage"));
                        book.setPages(rs.getInt("pages"));
                        book.setDescription(rs.getString("description"));
                        book.setSpecimens(rs.getInt("specimens"));
                        book.setStock(rs.getInt("stock"));
                        book.setAvailable(rs.getBoolean("available"));
                        listaBooks.add(book);
                    }
                }
            }
        } catch (SQLException e) {
            throw e;

        } finally {
            this.disconnect();
        }
        return listaBooks;
    }

    @Override
    public Books getBooksByID(int bookId) throws Exception {
        Books book = new Books();

        try {

            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM books WHERE booksID = ? LIMIT 1;")) {
                st.setInt(1, bookId);
                try (ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {
                        book.setBooksID(rs.getInt("booksID"));
                        book.setTitle(rs.getString("title"));
                        book.setPublicationDate(rs.getDate("publicationDate"));
                        book.setAuthor(rs.getString("author"));
                        book.setCategory(rs.getString("category"));
                        book.setEdition(rs.getInt("edition"));
                        book.setLanguage(rs.getString("lenguage"));
                        book.setPages(rs.getInt("pages"));
                        book.setDescription(rs.getString("description"));
                        book.setSpecimens(rs.getInt("specimens"));
                        book.setStock(rs.getInt("stock"));
                        book.setAvailable(rs.getBoolean("available"));

                    }
                    rs.close();
                    st.close();
                }
            }

        } catch (SQLException e) {
            throw e;

        } finally {
            this.disconnect();
        }
        return book;

    }

}
