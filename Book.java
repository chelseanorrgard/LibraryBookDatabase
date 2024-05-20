public class Book {
    // Instance variables
    private String title;
    private int publicationYear;
    private String publisher;

    // Constructor
    public Book(String title, int publicationYear, String publisher) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    // Getter methods for read-only access
    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setter methods for read-write access
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
