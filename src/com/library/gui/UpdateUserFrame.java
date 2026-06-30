package com.library.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.library.dao.UserDAO;
import com.library.model.User;

public class UpdateUserFrame extends JFrame {

    private JTextField txtUserId;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtPhone;

    public UpdateUserFrame() {

        setTitle("Update User");
        setSize(450, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("User ID"));
        txtUserId = new JTextField();
        panel.add(txtUserId);

        panel.add(new JLabel("Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Email"));
        txtEmail = new JTextField();
        panel.add(txtEmail);

        panel.add(new JLabel("Phone"));
        txtPhone = new JTextField();
        panel.add(txtPhone);

        JButton btnUpdate = new JButton("Update");
        JButton btnClear = new JButton("Clear");

        panel.add(btnUpdate);
        panel.add(btnClear);

        add(panel);

        btnUpdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int id = Integer.parseInt(txtUserId.getText());

                    String name = txtName.getText();
                    String email = txtEmail.getText();
                    String phone = txtPhone.getText();

                    User user = new User(id, name, email, phone);

                    UserDAO dao = new UserDAO();

                    boolean success = dao.updateUser(user);

                    if (success) {

                        JOptionPane.showMessageDialog(null,
                                "User Updated Successfully");

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "User Not Found");

                    }

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,
                            "Please enter a valid User ID.");

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());

                }

            }

        });

        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                txtUserId.setText("");
                txtName.setText("");
                txtEmail.setText("");
                txtPhone.setText("");

            }

        });

        setVisible(true);

    }
}