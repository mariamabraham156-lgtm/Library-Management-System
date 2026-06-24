package com.library.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.library.dao.BookDAO;

public class DeleteBookFrame extends JFrame {
    
    private JTextField bookIdField;
    

    private JButton deleteButton;

    public DeleteBookFrame(){

        setTitle("Delete Book");

        setSize(400, 350);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(null);


        JLabel bookIdLabel = new JLabel("Book ID: ");

        bookIdLabel.setBounds(30,30,100,25);

        add(bookIdLabel);

        bookIdField = new JTextField();

        bookIdField.setBounds(150,30,180,25);

        bookIdField.setEditable(true);

        add(bookIdField);


        

        deleteButton = new JButton("Delete");

        deleteButton.setBounds(140,240,100,30);

        add(deleteButton);

        deleteButton.addActionListener(
            new ActionListener() {
                
            @Override
                public void actionPerformed(ActionEvent e){

                    try{

                        int bookId = Integer.parseInt(bookIdField.getText());

                        
                        

                        BookDAO dao = new BookDAO();

                        boolean result = dao.deleteBook(bookId);

                        if(result){
                            
                            JOptionPane.showMessageDialog(null,"Deleted Successfully");

                        } else{

                            JOptionPane.showMessageDialog(null,"Deletion Failed");

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


