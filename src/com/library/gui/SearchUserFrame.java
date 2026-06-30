package com.library.gui;

import com.library.dao.UserDAO;
import com.library.model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class SearchUserFrame extends JFrame {

    private JComboBox<String> cmbField;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JButton btnBack;

    private JTable table;
    private DefaultTableModel model;

    private UserDAO userDAO = new UserDAO();

    public SearchUserFrame() {

        setTitle("Search User");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // ================= MAIN PANEL =================

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245,239,224));

        // ================= TITLE =================

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(92,64,51));

        JLabel title = new JLabel("Search User");
        title.setFont(new Font("Segoe Script", Font.BOLD, 30));
        title.setForeground(new Color(255,248,220));

        titlePanel.add(title);

        // ================= SEARCH PANEL =================

        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.setBackground(new Color(245,239,224));

        searchPanel.add(new JLabel("Search By"));

        cmbField = new JComboBox<>(new String[]{
                "name",
                "email",
                "phone"
                });

        txtSearch = new JTextField(20);

        btnSearch = new JButton("Search");
        btnSearch.setBackground(new Color(133,94,66));
        btnSearch.setForeground(Color.WHITE);

        searchPanel.add(cmbField);
        searchPanel.add(txtSearch);
        searchPanel.add(btnSearch);

        // ================= TABLE =================

        model = new DefaultTableModel();

        model.addColumn("user_id");
        model.addColumn("name");
        model.addColumn("email");
        model.addColumn("phoneno");
        

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        // ================= BOTTOM PANEL =================

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(245,239,224));

        btnBack = new JButton("Back");
        btnBack.setBackground(new Color(92,64,51));
        btnBack.setForeground(Color.WHITE);

        bottomPanel.add(btnBack);

        // ================= ADD COMPONENTS =================

        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(searchPanel, BorderLayout.BEFORE_FIRST_LINE);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);

        // ================= SEARCH ACTION =================

        btnSearch.addActionListener(e -> {

            String field = cmbField.getSelectedItem().toString();
            String value = txtSearch.getText().trim();

            List<User> users = userDAO.searchUsers(field, value);

            model.setRowCount(0);

            for (User user : users) {

                model.addRow(new Object[]{
                        user.getuserId(),
                        user.getname(),
                        user.getemail(),
                        user.getphoneno()
                        });
            }

            if (users.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "No User Found!");
            }
        });

        // ================= BACK =================

        btnBack.addActionListener(e -> dispose());

        setVisible(true);
    }
}