class Book {
    constructor(title, publicationYear, publisher) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    // Getter methods for read-only access
    getTitle() {
        return this.title;
    }

    getPublicationYear() {
        return this.publicationYear;
    }

    getPublisher() {
        return this.publisher;
    }

    // Setter methods for read-write access
    setTitle(title) {
        this.title = title;
    }

    setPublicationYear(publicationYear) {
        this.publicationYear = publicationYear;
    }

    setPublisher(publisher) {
        this.publisher = publisher;
    }
}

module.exports = Book;