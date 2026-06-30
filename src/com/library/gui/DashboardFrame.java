// package com.library.gui;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class DashboardFrame extends JFrame {

//     public DashboardFrame(){

//         setTitle("Library Management System");

//         setSize(400,300);

//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JPanel panel = new JPanel();

//         JButton updateBookBtn = new JButton("Update Book");

//         JButton addBookBtn = new JButton("Add Book");

//         JButton addUserBtn = new JButton("Add User");

//         JButton borrowBookBtn = new JButton("Borrow Book");

//         JButton returnBookBtn = new JButton("Return Book");

//         JButton transactionBtn = new JButton("View Transaction");

//         JButton deleteBookBtn = new JButton("Delete Book");

//         JButton listBooksBtn = new JButton("List Books");

//         JButton deleteUserBtn = new JButton("Delete User");

//         JButton updateUserBtn = new JButton("Update User");

//         JButton listUsersBtn = new JButton("List Users");

//         panel.add(listBooksBtn);
//         panel.add(addBookBtn);
//         panel.add(deleteBookBtn);
//         panel.add(updateBookBtn);
//         panel.add(addUserBtn);
//         panel.add(deleteUserBtn);
//         panel.add(updateUserBtn);
//         panel.add(listUsersBtn);
//         panel.add(borrowBookBtn);
//         panel.add(returnBookBtn);
//         panel.add(transactionBtn);
        

//         add(panel);

//         addBookBtn.addActionListener(e -> {
//             new AddBookFrame();
//         });

//         updateBookBtn.addActionListener(e ->{
//             new UpdateBookFrame();
//         });

//         deleteBookBtn.addActionListener(e ->{
//             new DeleteBookFrame();
//         });

//         listBooksBtn.addActionListener(e -> {
//             new ListBookFrame();
//         });

//         addUserBtn.addActionListener(e ->{
//             new AddUserFrame();
//         });

//         deleteUserBtn.addActionListener(e ->{
//             new DeleteUserFrame();
//         });

//         updateUserBtn.addActionListener(e ->{
//             new UpdateUserFrame();
//         });

//         listUsersBtn.addActionListener(e->{
//             new ListUsersFrame();
//         });

//         setVisible(true);
//     }
    
// }


package com.library.gui;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        setTitle("Library Management System");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Background
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(245, 239, 224)); // Cream
        mainPanel.setLayout(new BorderLayout());

        // ===========================
        // Title Panel
        // ===========================

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(92, 64, 51));

        JLabel title = new JLabel("Library Management System");

        title.setFont(new Font("Segoe Script", Font.BOLD, 38));
        title.setForeground(new Color(255, 248, 220));

        titlePanel.add(title);

        // ===========================
        // Subtitle
        // ===========================

        JLabel subtitle = new JLabel("Choose a Module");

        subtitle.setHorizontalAlignment(SwingConstants.CENTER);

        subtitle.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));

        subtitle.setForeground(new Color(92,64,51));

        JPanel subtitlePanel = new JPanel();
        subtitlePanel.setBackground(new Color(245,239,224));
        subtitlePanel.add(subtitle);

        // ===========================
        // Buttons
        // ===========================

        JPanel buttonPanel = new JPanel();

        buttonPanel.setBackground(new Color(245,239,224));

        buttonPanel.setLayout(new GridLayout(1,2,60,20));

        buttonPanel.setBorder(BorderFactory.createEmptyBorder(80,80,80,80));

        JButton bookButton = new JButton("📚  BOOK MANAGEMENT");
        JButton userButton = new JButton("👤  USER MANAGEMENT");

        Font buttonFont = new Font("Georgia", Font.BOLD, 20);

        bookButton.setFont(buttonFont);
        userButton.setFont(buttonFont);

        bookButton.setBackground(new Color(133,94,66));
        userButton.setBackground(new Color(133,94,66));

        bookButton.setForeground(Color.WHITE);
        userButton.setForeground(Color.WHITE);

        bookButton.setFocusPainted(false);
        userButton.setFocusPainted(false);

        bookButton.setBorder(BorderFactory.createLineBorder(
                new Color(92,64,51),3,true));

        userButton.setBorder(BorderFactory.createLineBorder(
                new Color(92,64,51),3,true));

        buttonPanel.add(bookButton);
        buttonPanel.add(userButton);

        // ===========================
        // Footer
        // ===========================

        JLabel footer = new JLabel(
                "Welcome to the Digital Library",
                SwingConstants.CENTER);

        footer.setFont(new Font("Lucida Handwriting", Font.PLAIN,18));

        footer.setForeground(new Color(92,64,51));

        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(245,239,224));
        footerPanel.add(footer);

        // ===========================
        // Add Panels
        // ===========================

        mainPanel.add(titlePanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(new Color(245,239,224));

        centerPanel.add(subtitlePanel, BorderLayout.NORTH);
        centerPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        add(mainPanel);

        // ===========================
        // Button Actions
        // ===========================

        bookButton.addActionListener(e -> {
            new BookManagementFrame();
            dispose();
        });

        userButton.addActionListener(e -> {
            new UserManagementFrame();
            dispose();
        });

        setVisible(true);
    }
}