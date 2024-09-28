package interfacesDAO;

import java.util.List;
import models.Books;

/**
 *
 * @author Diego Guerrero
 */
public interface BooksInterface {
    
    public void registerBook(Books book) throws Exception;

    public void modifyBook(Books book) throws Exception;

    public void deleteBook(int bookId) throws Exception;

    public List<Books> listBooks(String title) throws Exception;
    
     public Books getBooksByID(int bookId) throws Exception;
    
}
