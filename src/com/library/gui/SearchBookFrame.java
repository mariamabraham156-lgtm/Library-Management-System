package com.library.gui;

import com.library.dao.BookDAO;
import com.library.model.Book;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class SearchBookFrame extends JFrame {

    private JComboBox<String> cmbField;
    private JTextField txtSearch;
    private JButton btnSearch, btnBack;

    private JTable table;
    private DefaultTableModel model;

    private BookDAO bookDAO = new BookDAO();

    public SearchBookFrame() {

        setTitle("Search Book");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245,239,224));

        //================ TITLE ===================

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(92,64,51));

        JLabel title = new JLabel("Search Book");
        title.setFont(new Font("Segoe Script", Font.BOLD, 30));
        title.setForeground(new Color(255,248,220));

        titlePanel.add(title);

        //================ SEARCH PANEL ===================

        JPanel searchPanel = new JPanel(new FlowLayout());

        searchPanel.setBackground(new Color(245,239,224));

        cmbField = new JComboBox<>(new String[]{
                "title",
                "author",
                "genre",
                "isbn"
        });

        txtSearch = new JTextField(20);

        btnSearch = new JButton("Search");

        btnSearch.setBackground(new Color(133,94,66));
        btnSearch.setForeground(Color.WHITE);

        searchPanel.add(new JLabel("Search By"));
        searchPanel.add(cmbField);
        searchPanel.add(txtSearch);
        searchPanel.add(btnSearch);

        //================ TABLE ===================

        model = new DefaultTableModel();

        model.addColumn("Book ID");
        model.addColumn("Title");
        model.addColumn("Author");
        model.addColumn("Genre");
        model.addColumn("ISBN");

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        //================ BACK BUTTON ===================

        JPanel bottomPanel = new JPanel();

        bottomPanel.setBackground(new Color(245,239,224));

        btnBack = new JButton("Back");

        btnBack.setBackground(new Color(92,64,51));
        btnBack.setForeground(Color.WHITE);

        bottomPanel.add(btnBack);

        //================ ADD COMPONENTS ===================

        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(searchPanel, BorderLayout.BEFORE_FIRST_LINE);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);

        //================ SEARCH ACTION ===================

        btnSearch.addActionListener(e -> {

            String field = cmbField.getSelectedItem().toString();
            String value = txtSearch.getText().trim();

            List<Book> books = bookDAO.searchBooks(field, value);

            model.setRowCount(0);

            for(Book b : books){

                model.addRow(new Object[]{
                        b.getBookId(),
                        b.getTitle(),
                        b.getAuthor(),
                        b.getGenre(),
                        b.getIsbn()
                });
            }

            if(books.isEmpty()){

                JOptionPane.showMessageDialog(this,"No Book Found!");

            }

        });

        //================ BACK ===================

        btnBack.addActionListener(e -> {

            dispose();

        });

        setVisible(true);
    }
}