package models;

import java.util.Date;

/**
 *
 * @author Diego Guerrero
 */
public class Books {

    private int booksID;
    private String title;
    private Date publicationDate;
    private String author;
    private String category;
    private int edition;
    private String language;
    private int pages;
    private String description;
    private int specimens;
    private int stock;
    private boolean available;

    public int getBooksID() {
        return this.booksID;
    }

    public void setBooksID(int booksID) {
        this.booksID = booksID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpecimens() {
        return this.specimens;
    }

    public void setSpecimens(int specimens) {
        this.specimens = specimens;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
