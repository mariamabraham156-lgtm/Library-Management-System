// package com.library.gui;

// import javax.swing.*;
// import java.awt.*;

// public class UserManagementFrame extends JFrame {

//     public UserManagementFrame() {

//         setTitle("User Management");

//         setSize(700,450);

//         setLocationRelativeTo(null);

//         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//         setLayout(new GridLayout(3,2,20,20));

//         JButton addUserBtn = new JButton("Add User");
//         JButton updateUserBtn = new JButton("Update User");
//         JButton deleteUserBtn = new JButton("Delete User");
//         JButton listUsersBtn = new JButton("List Users");
//         JButton backBtn = new JButton("Back");

//         add(addUserBtn);
//         add(updateUserBtn);
//         add(deleteUserBtn);
//         add(listUsersBtn);
//         add(backBtn);

//         addUserBtn.addActionListener(e -> new AddUserFrame());

//         updateUserBtn.addActionListener(e -> new UpdateUserFrame());

//         deleteUserBtn.addActionListener(e -> new DeleteUserFrame());

//         listUsersBtn.addActionListener(e -> new ListUsersFrame());

//         backBtn.addActionListener(e -> {
//             new DashboardFrame();
//             dispose();
//         });

//         setVisible(true);
//     }
// }


package com.library.gui;

import javax.swing.*;
import java.awt.*;

public class UserManagementFrame extends JFrame {

    public UserManagementFrame() {

        setTitle("User Management");
        setSize(900,550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245,239,224));

        // ================= TITLE =================

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(92,64,51));

        JLabel title = new JLabel("User Management");

        title.setFont(new Font("Segoe Script",Font.BOLD,34));
        title.setForeground(new Color(255,248,220));

        titlePanel.add(title);

        // ================= SUBTITLE =================

        JLabel subtitle = new JLabel("Select an Operation");

        subtitle.setHorizontalAlignment(SwingConstants.CENTER);
        subtitle.setFont(new Font("Monotype Corsiva",Font.BOLD,28));
        subtitle.setForeground(new Color(92,64,51));

        JPanel subtitlePanel = new JPanel();
        subtitlePanel.setBackground(new Color(245,239,224));
        subtitlePanel.add(subtitle);

        // ================= BUTTONS =================

        JPanel buttonPanel = new JPanel(new GridLayout(2,2,40,40));

        buttonPanel.setBackground(new Color(245,239,224));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50,80,50,80));

        Font btnFont = new Font("Georgia",Font.BOLD,20);

        JButton addBtn = new JButton("Add User");
        JButton updateBtn = new JButton("Update User");
        JButton deleteBtn = new JButton("Delete User");
        JButton listBtn = new JButton("List Users");
        JButton searchBtn = new JButton("Search User");

        JButton[] buttons = {addBtn,updateBtn,deleteBtn,listBtn,searchBtn};

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

        addBtn.addActionListener(e -> new AddUserFrame());

        updateBtn.addActionListener(e -> new UpdateUserFrame());

        deleteBtn.addActionListener(e -> new DeleteUserFrame());

        listBtn.addActionListener(e -> new ListUsersFrame());

        searchBtn.addActionListener(e -> new SearchUserFrame());

        backBtn.addActionListener(e ->{

            new DashboardFrame();
            dispose();

        });

        setVisible(true);
    }
}