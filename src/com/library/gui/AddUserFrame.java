
package com.library.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.library.dao.UserDAO;
import com.library.model.User;

public class AddUserFrame extends JFrame {

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtPhone;

    public AddUserFrame() {

        setTitle("Add User");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        panel.add(new JLabel("User ID"));
        txtId = new JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Email"));
        txtEmail = new JTextField();
        panel.add(txtEmail);

        panel.add(new JLabel("Phone"));
        txtPhone = new JTextField();
        panel.add(txtPhone);

        JButton btnAdd = new JButton("Add User");
        JButton btnClear = new JButton("Clear");

        panel.add(btnAdd);
        panel.add(btnClear);

        add(panel);

        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int id = Integer.parseInt(txtId.getText());

                    String name = txtName.getText();

                    String email = txtEmail.getText();

                    String phone = txtPhone.getText();

                    User user = new User(id, name, email, phone);

                    UserDAO dao = new UserDAO();

                    boolean success = dao.addUser(user);

                    if(success){
                        JOptionPane.showMessageDialog(null,
                                "User Added Successfully");
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "Failed to Add User");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }

            }

        });

        btnClear.addActionListener(e -> {

            txtId.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txtPhone.setText("");

        });

        setVisible(true);

    }
}