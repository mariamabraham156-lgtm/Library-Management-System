package com.library.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DashboardFrame extends JFrame {

    public DashboardFrame(){

        setTitle("Library Management System");

        setSize(400,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton updateBookBtn = new JButton("Update Book");

        JButton addBookBtn = new JButton("Add Book");

        JButton addUserBtn = new JButton("Add User");

        JButton borrowBookBtn = new JButton("Borrow Book");

        JButton returnBookBtn = new JButton("Return Book");

        JButton transactionBtn = new JButton("View Transaction");

        
        panel.add(addBookBtn);
        panel.add(updateBookBtn);
        panel.add(addUserBtn);
        panel.add(borrowBookBtn);
        panel.add(returnBookBtn);
        panel.add(transactionBtn);
        

        add(panel);

        addBookBtn.addActionListener(e -> {
            new AddBookFrame();
        });

        updateBookBtn.addActionListener(e ->{
            new UpdateBookFrame();
        });

        setVisible(true);
    }
    
}
