package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.util.DatabaseConnection;

public class BookDAO {

//ADDING BOOK
    
    public boolean addBook(Book book) {

        String sql = "INSERT INTO books(book_id, title, author, isbn, genre, status) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setString(4, book.getIsbn());
            pstmt.setString(5, book.getGenre());
            pstmt.setString(6, book.getStatus());

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }
    }

// LIST ALL BOOKS

    public List<Book> getAllBooks() {

        List<Book> books = new ArrayList<>();

            String sql = "SELECT * FROM books";

            try {

                Connection conn = DatabaseConnection.getConnection();

                PreparedStatement pstmt = conn.prepareStatement(sql);

                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {

                    Book book = new Book();

                    book.setBookId(rs.getInt("book_id"));
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    book.setIsbn(rs.getString("isbn"));
                    book.setGenre(rs.getString("genre"));
                    book.setStatus(rs.getString("status"));

                    books.add(book);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return books;
        }

// GET BOOK BY ID

    public Book getBookById(int bookId) {

        String sql = "SELECT * FROM books WHERE book_id = ?";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, bookId);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                Book book = new Book();

                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setIsbn(rs.getString("isbn"));
                book.setGenre(rs.getString("genre"));
                book.setStatus(rs.getString("status"));

                return book;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

// UPDATE BOOK 

    public boolean updateBook(Book book) {

        String sql = "UPDATE books SET title=?, author=?, isbn=?, genre=?, status=? WHERE book_id=?";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setString(3, book.getIsbn());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getStatus());
            pstmt.setInt(6, book.getBookId());

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

//DELETE BOOK

    public boolean deleteBook(int bookId) {

        String sql = "DELETE FROM books WHERE book_id = ?";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, bookId);

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
    
}
