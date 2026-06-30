package com.library.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

import com.library.dao.UserDAO;
import com.library.model.User;

public class ListUsersFrame extends JFrame {

    JTable table;
    DefaultTableModel model;

    public ListUsersFrame() {

        setTitle("List of Users");
        setSize(650,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        model = new DefaultTableModel();

        model.addColumn("User ID");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

        loadUsers();

        setVisible(true);
    }

    private void loadUsers() {

        UserDAO dao = new UserDAO();

        List<User> users = dao.getAllUsers();

        for(User user : users){

            model.addRow(new Object[]{

                    user.getuserId(),
                    user.getname(),
                    user.getemail(),
                    user.getphoneno()

            });

        }

    }

}