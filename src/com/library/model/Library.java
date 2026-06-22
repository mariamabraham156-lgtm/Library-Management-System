package com.library.model;

import java.util.List;

public class Library {

    private List<Book> books;

    private List<User> users;

    public Library(){

    }

    public Library(List<Book> books, List<User> users){
        this.books = books;
        this.users = users;
    }

    public List<Book> getBooks(){
        return books;
    }
    public void setBooks(List<Book> books){
        this.books = books;
    }

    public List<User> getUsers(){
        return users;
    }
    public void SetUsers(List<User> users){
        this.users = users;
    }
    
}
