package Q4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default

    public Transaction(String isbn, String patronId, String checkoutDate) {
        this.isbn = isbn;
        this.patronId = patronId;
        this.checkoutDate = checkoutDate;
        returnDate = null;
    }
    // TODO: Implement getters and setters
    public void setReturn(String date) {returnDate = date;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public void setPatronId(String patron) {patronId = patron;}
    public void setcheckout(String check) {checkoutDate = check;}

    public String getIsbn() {return isbn;}
    public String getPatronId() {return patronId;}
    public String getCheckoutDate() {return checkoutDate;}
    public String getReturnDate() {return returnDate;}
    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
