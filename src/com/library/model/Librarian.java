package com.library.model;

public class Librarian extends User {

    public Librarian(){

    }

    public Librarian(int userId, String name, String email, String phoneno){

        super(userId,name,email,phoneno);
    }

    public void addBook(){
        System.out.println("Librarian can add books");
    }

    public void removeBook(){
        System.out.println("Librarian can remove books");
    }

    public void manageUsers(){
        System.out.println("Librarian can manage users");
    }

    public void viewTransactions(){
        System.out.println("Librarian can view transactions");
    }
    
}
