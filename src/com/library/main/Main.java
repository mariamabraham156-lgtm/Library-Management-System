package com.library.main;
//import com.library.dao.BookDAO;
//import com.library.model.Book;
//import com.library.dao.UserDAO;
//import com.library.model.User;
import com.library.util.DatabaseConnection;
import com.library.gui.DashboardFrame;

public class Main {

    public static void main(String[] args) {

        new DashboardFrame();
        DatabaseConnection.getConnection();
//BOOK
       // Book book = new Book(
         //       101,
           //     "Java Basics",
             //   "James Gosling",
               // "ISBN101",
               // "Programming",
               // "Available"
        //);
//
//        BookDAO dao = new BookDAO();

  //      boolean result = dao.addBook(book);
//
  //      if(result) {
    //        System.out.println("Book Added Successfully");
      //  } else {
        //    System.out.println("Book Not Added");
      //  }
        // Book books = dao.getBookById(101);

        // System.out.println(books.getTitle());

        

        // Book bookss = dao.getBookById(101);
        // book.setTitle("Advanced Java");
        // boolean results = dao.updateBook(bookss);
        // System.out.println(results);

        // boolean resultsss= dao.deleteBook(101);

        // System.out.println(resultsss);

//User
      //  User user = new User(1024,
       //     "JAIN",
         //   "Jayin@gmail.com",
           // "9876008978"
        //);

        //UserDAO dos = new UserDAO();

        //boolean house = dos.addUser(user);

        //if(house) {
           // System.out.println("User Added Successfully");
        //} else {
          //  System.out.println("User Not Added");
        //}
        
        // User userr = dos.getUserbyId(0024);
        // System.out.println(userr.getphoneno());
        // User userss = dos.getUserbyId(0024);
        // user.setname("Advanced Java");
        // boolean houses = dos.updateUser(userss);
        // System.out.println(houses);

        // boolean houseee = dos.deleteUser(0024);
        // System.out.println(houseee);


        

















       // DatabaseConnection.getConnection();

    }
}