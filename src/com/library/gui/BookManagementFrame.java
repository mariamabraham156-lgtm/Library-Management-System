// package com.library.gui;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class BookManagementFrame extends JFrame {

//     private JButton addButton;
//     private JButton updateButton;
//     private JButton deleteButton;
//     private JButton listButton;
//     private JButton backButton;

//     public BookManagementFrame() {

//         setTitle("Book Management");

//         setSize(700, 500);

//         setLocationRelativeTo(null);

//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         setLayout(new BorderLayout());

//         JLabel title = new JLabel("BOOK MANAGEMENT");

//         title.setHorizontalAlignment(SwingConstants.CENTER);

//         title.setFont(new Font("Arial", Font.BOLD, 26));

//         title.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));

//         add(title, BorderLayout.NORTH);

//         JPanel panel = new JPanel();

//         panel.setLayout(new GridLayout(2,2,20,20));

//         panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));

//         addButton = new JButton("ADD BOOK");
//         updateButton = new JButton("UPDATE BOOK");
//         deleteButton = new JButton("DELETE BOOK");
//         listButton = new JButton("LIST ALL BOOKS");

//         Font buttonFont = new Font("Arial", Font.BOLD, 18);

//         addButton.setFont(buttonFont);
//         updateButton.setFont(buttonFont);
//         deleteButton.setFont(buttonFont);
//         listButton.setFont(buttonFont);

//         panel.add(addButton);
//         panel.add(updateButton);
//         panel.add(deleteButton);
//         panel.add(listButton);

//         add(panel, BorderLayout.CENTER);

//         backButton = new JButton("Back");

//         JPanel bottomPanel = new JPanel();

//         bottomPanel.add(backButton);

//         add(bottomPanel, BorderLayout.SOUTH);

//         // Add Book
//         addButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {

//                 new AddBookFrame();

//             }
//         });

//         // Update Book
//         updateButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {

//                 new UpdateBookFrame();

//             }
//         });

//         // Delete Book
//         deleteButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {

//                 new DeleteBookFrame();

//             }
//         });

//         // List Books
//         listButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {

//                 new ListBookFrame();

//             }
//         });

//         // Back
//         backButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {

//                 new DashboardFrame();
//                 dispose();

//             }
//         });

//         setVisible(true);

//     }

// }


package com.library.gui;

import javax.swing.*;
import java.awt.*;

public class BookManagementFrame extends JFrame {

    public BookManagementFrame() {

        setTitle("Book Management");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245,239,224));

        // ================= TITLE =================

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(92,64,51));

        JLabel title = new JLabel("Book Management");

        title.setFont(new Font("Segoe Script", Font.BOLD, 34));
        title.setForeground(new Color(255,248,220));

        titlePanel.add(title);

        // ================= SUBTITLE =================

        JLabel subtitle = new JLabel("Select an Operation");

        subtitle.setHorizontalAlignment(SwingConstants.CENTER);
        subtitle.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));
        subtitle.setForeground(new Color(92,64,51));

        JPanel subtitlePanel = new JPanel();
        subtitlePanel.setBackground(new Color(245,239,224));
        subtitlePanel.add(subtitle);

        // ================= BUTTONS =================

        JPanel buttonPanel = new JPanel(new GridLayout(2,2,40,40));
        buttonPanel.setBackground(new Color(245,239,224));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50,80,50,80));

        Font btnFont = new Font("Georgia", Font.BOLD,20);

        JButton addBtn = new JButton("Add Book");
        JButton updateBtn = new JButton("Update Book");
        JButton deleteBtn = new JButton("Delete Book");
        JButton listBtn = new JButton("List Books");
        JButton searchBtn = new JButton("Search Book");

        JButton[] buttons = {addBtn, updateBtn, deleteBtn, listBtn, searchBtn};

        for(JButton btn : buttons){

            btn.setFont(btnFont);
            btn.setBackground(new Color(133,94,66));
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createLineBorder(
                    new Color(92,64,51),3,true));

            buttonPanel.add(btn);
        }

        // ================= BACK BUTTON =================

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(245,239,224));

        JButton backBtn = new JButton("← Back");

        backBtn.setFont(new Font("Georgia",Font.BOLD,18));
        backBtn.setBackground(new Color(92,64,51));
        backBtn.setForeground(Color.WHITE);

        bottomPanel.add(backBtn);

        // ================= ADD COMPONENTS =================

        JPanel center = new JPanel(new BorderLayout());
        center.setBackground(new Color(245,239,224));

        center.add(subtitlePanel,BorderLayout.NORTH);
        center.add(buttonPanel,BorderLayout.CENTER);

        mainPanel.add(titlePanel,BorderLayout.NORTH);
        mainPanel.add(center,BorderLayout.CENTER);
        mainPanel.add(bottomPanel,BorderLayout.SOUTH);

        add(mainPanel);

        // ================= ACTIONS =================

        addBtn.addActionListener(e -> new AddBookFrame());

        updateBtn.addActionListener(e -> new UpdateBookFrame());

        deleteBtn.addActionListener(e -> new DeleteBookFrame());

        listBtn.addActionListener(e -> new ListBookFrame());

        searchBtn.addActionListener(e -> new SearchBookFrame());

        backBtn.addActionListener(e -> {

            new DashboardFrame();
            dispose();

        });

        setVisible(true);


    }
}