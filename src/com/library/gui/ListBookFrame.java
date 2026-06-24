package com.library.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.util.List;

import com.library.dao.BookDAO;
import com.library.model.Book;

public class ListBookFrame extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    

    public ListBookFrame() {

        setTitle("List of Books");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columns = {
                "Book ID",
                "Title",
                "Author",
                "ISBN",
                "Genre",
                "Status"
        };

        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        loadBooks();

        setVisible(true);
    }

    private void loadBooks() {

        BookDAO dao = new BookDAO();

        List<Book> books = dao.getAllBooks();

        for (Book book : books) {

            Object[] row = {
                    book.getBookId(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getIsbn(),
                    book.getGenre(),
                    book.getStatus()
            };

            model.addRow(row);
        }
    }
}
