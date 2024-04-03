package Q4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)

    public Media(String tle, String isn) {
        title = tle;
        isbn = isn;
    }
    // TODO: Implement getter methods
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
    public String getTitle() {return title;}
    public String getIsbn() {return isbn;}
}
