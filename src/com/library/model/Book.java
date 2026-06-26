package com.library.model;


// Book class representing a book in the library
public class Book {

    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private String status;
    
    
// Constructor
    public Book(){
        
    }
    public Book(int bookId, String title, String author, String isbn, String genre, String status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.status = status;
    }


//  Getters and Setters
        public int getBookId() {
            return bookId;
        }

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }


// toString method
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                '}';
                
                
}
}
