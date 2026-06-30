package com.library.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.library.dao.UserDAO;

public class DeleteUserFrame extends JFrame {

    private JTextField txtUserId;

    public DeleteUserFrame() {

        setTitle("Delete User");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        panel.add(new JLabel("Enter User ID"));

        txtUserId = new JTextField();
        panel.add(txtUserId);

        JButton btnDelete = new JButton("Delete User");
        JButton btnCancel = new JButton("Cancel");

        panel.add(btnDelete);
        panel.add(btnCancel);

        add(panel);

        btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int id = Integer.parseInt(txtUserId.getText());

                    UserDAO dao = new UserDAO();

                    boolean success = dao.deleteUser(id);

                    if(success){

                        JOptionPane.showMessageDialog(null,
                                "User Deleted Successfully");

                        txtUserId.setText("");

                    }else{

                        JOptionPane.showMessageDialog(null,
                                "User Not Found");

                    }

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Please enter a valid User ID.");

                }

            }

        });

        btnCancel.addActionListener(e -> dispose());

        setVisible(true);
    }
}