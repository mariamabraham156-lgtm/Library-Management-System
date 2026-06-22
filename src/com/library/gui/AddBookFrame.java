package com.library.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.library.dao.BookDAO;
import com.library.model.Book;

public class AddBookFrame extends JFrame{

    private JTextField bookIdField;
    private JTextField titleField;
    private JTextField authorField;
    private JTextField isbnField;
    private JTextField genreField;

    private JButton saveButton;

    public AddBookFrame(){

        setTitle("Add Book");

        setSize(400,350);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(null);


        JLabel bookIdLabel = new JLabel("Book ID: ");

        bookIdLabel.setBounds(30,30,100,25);

        add(bookIdLabel);

        bookIdField = new JTextField();

        bookIdField.setBounds(150,30,180,25);

        add(bookIdField);


        JLabel titleLabel = new JLabel("Title: ");

        titleLabel.setBounds(30,70,100,25);

        add(titleLabel);

        titleField = new JTextField();

        titleField.setBounds(150,70,180,25);

        add(titleField);


        JLabel authorLabel = new JLabel("Author");
        
        authorLabel.setBounds(30,110,100,25);

        add(authorLabel);

        authorField = new JTextField();

        authorField.setBounds(150,110,180,25);

        add(authorField);


        JLabel isbnLabel = new JLabel("ISBN");

        isbnLabel.setBounds(30,150,100,25);

        add(isbnLabel);

        isbnField = new JTextField();

        isbnField.setBounds(150,150,180,25);

        add(isbnField);


        JLabel genreLabel = new JLabel("Genre");

        genreLabel.setBounds(30,190,100,25);

        add(genreLabel);

        genreField = new JTextField();

        genreField.setBounds(150,190,180,25);

        add(genreField);


        saveButton = new JButton("Save");

        saveButton.setBounds(140,240,100,30);

        add(saveButton);

        saveButton.addActionListener(
            new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e){

                    try{

                        int bookId = Integer.parseInt(bookIdField.getText());

                        String title = titleField.getText();

                        String author = authorField.getText();

                        String isbn = isbnField.getText();

                        String genre = genreField.getText();


                        Book book = new Book(bookId,
                                            title,
                                            author,
                                            isbn,
                                            genre,
                                            "Available");

                        BookDAO dao = new BookDAO();

                        boolean result = dao.addBook(book);

                        if(result){
                            
                            JOptionPane.showMessageDialog(null,"Book Added Successfully");

                        } else{

                            JOptionPane.showMessageDialog(null,"Book Not Added");

                        }

                    }catch(Exception ex){

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }

                }
                


            }
        );

        setVisible(true);

    }
    
}
