package com.library.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

import com.library.dao.LoginDAO;

public class LoginFrame extends JFrame {

    JTextField txtUsername;
    JPasswordField txtPassword;

    public LoginFrame() {

        setTitle("Library Management System");
        setSize(700,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Header

        JPanel header = new JPanel();
        header.setBackground(new Color(44,62,80));

        JLabel title = new JLabel("LIBRARY MANAGEMENT SYSTEM");
        title.setFont(new Font("Arial",Font.BOLD,26));
        title.setForeground(Color.WHITE);

        header.add(title);

        // Center

        JPanel center = new JPanel();
        center.setBorder(new EmptyBorder(30,50,30,50));
        center.setLayout(new GridBagLayout());

        JPanel loginPanel = new JPanel();
        loginPanel.setPreferredSize(new Dimension(320,220));
        loginPanel.setBackground(Color.WHITE);

        loginPanel.setBorder(BorderFactory.createTitledBorder("Admin Login"));

        loginPanel.setLayout(null);

        JLabel lblUser = new JLabel("Username");
        lblUser.setBounds(40,40,100,25);

        txtUsername = new JTextField();
        txtUsername.setBounds(40,65,230,30);

        JLabel lblPass = new JLabel("Password");
        lblPass.setBounds(40,105,100,25);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(40,130,230,30);

        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(80,175,150,35);

        btnLogin.setBackground(new Color(52,152,219));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);

        loginPanel.add(lblUser);
        loginPanel.add(txtUsername);
        loginPanel.add(lblPass);
        loginPanel.add(txtPassword);
        loginPanel.add(btnLogin);

        center.add(loginPanel);

        mainPanel.add(header,BorderLayout.NORTH);
        mainPanel.add(center,BorderLayout.CENTER);

        add(mainPanel);

        btnLogin.addActionListener(e->login());

    }

    private void login() {

        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        LoginDAO dao = new LoginDAO();

        if(dao.validateLogin(username,password)) {

            JOptionPane.showMessageDialog(this,"Login Successful!");

            new DashboardFrame();

            dispose();

        }

        else {

            JOptionPane.showMessageDialog(this,
                    "Invalid Username or Password");

        }

    }

}