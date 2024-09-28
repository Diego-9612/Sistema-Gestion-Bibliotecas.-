package models;

import java.util.Date;

/**
 *
 * @author Diego Guerrero
 */
public class Reports {

    private int reportID;

    private Users userID;

    private Books booksID;

    private Date dateOut;

    private Date dateReturn;

    public int getReportID() {
        return this.reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public Users getUserID() {
        return this.userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    public Books getBooksID() {
        return this.booksID;
    }

    public void setBooksID(Books booksID) {
        this.booksID = booksID;
    }

    public Date getDateOut() {
        return this.dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateReturn() {
        return this.dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

}
