package com.library.main;

// import com.library.gui.DashboardFrame;

// import java.util.ArrayList;
// import java.util.List;

// import com.library.dao.BookDAO;
// import com.library.dao.TransactionDAO;
// import com.library.dao.UserDAO;
// import com.library.model.Book;
// import com.library.model.Transaction;
// import com.library.model.Librarian;
// import com.library.model.Library;
// import com.library.model.User;


// import com.library.gui.DashboardFrame;
// import com.library.util.DatabaseConnection;

import com.library.gui.LoginFrame;

public class Main {
public static void main(String[] args) {

        // new DashboardFrame();
        // DatabaseConnection.getConnection();


        javax.swing.SwingUtilities.invokeLater(() -> {

        new LoginFrame().setVisible(true);

        });


//             // =========================
//             // BOOK TEST
//             // =========================

//         Book book = new Book(
//                 104,
//                 "Java Basics",
//                 "James Gosling",
//                 "ISBN1012",
//                 "Programming",
//                 "Available"
//         );

//         BookDAO bookDao = new BookDAO();

//         boolean bookResult =
//                 bookDao.addBook(book);

//         if (bookResult) {

//         System.out.println(
//                 "Book Added Successfully"
//         );

//         } else {

//         System.out.println(
//                 "Book Not Added"
//         );
//         }

//         // =========================
//         // USER TESTING
//         // =========================

//         UserDAO userDao =
//                 new UserDAO();

//         User user = new User(
//                 11,
//                 "Athulya",
//                 "athulyaa@gmail.com",
//                 "9876543220"
//         );

//         boolean userResult =
//                 userDao.addUser(user);

//         if (userResult) {

//         System.out.println(
//                 "User Added Successfully"
//         );

//         } else {

//         System.out.println(
//                 "User Not Added"
//         );
//         }

//         // =========================
//         // GET USER TEST
//         // =========================

//         User foundUser =
//                 userDao.getUserbyId(11);

//         if (foundUser != null) {

//         System.out.println(
//                 "\nUser Found:"
//         );

//         System.out.println(
//                 foundUser
//         );

//         } else {

//         System.out.println(
//                 "User Not Found"
//         );
//         }

//         // =========================
//         // BORROW BOOK TEST
//         // =========================


//         TransactionDAO transactionDao =
//                 new TransactionDAO();

//         boolean borrowResult =
//                 transactionDao.borrowBook(
//                         11,
//                         11,
//                         104
//                 );

//         if (borrowResult) {

//         System.out.println(
//                 "Book Borrowed Successfully"
//         );

//         } else {

//         System.out.println(
//                 "Borrow Failed"
//         );
//         }

//         // =========================
//         // VIEW TRANSACTIONS
//         // =========================

//         List<Transaction> transactions =
//                 transactionDao.getAllTransactions();

//         for (Transaction t : transactions) {

//         System.out.println(
//                 "Transaction ID : "
//                         + t.gettransactionId());

//         System.out.println(
//                 "User ID : "
//                         + t.getuserId());

//         System.out.println(
//                 "Book ID : "
//                         + t.getbookId());

//         System.out.println(
//                 "Borrow Date : "
//                         + t.getborrowDate());

//         System.out.println(
//                 "Return Date : "
//                         + t.getreturnDate());

//         System.out.println(
//                 "Status : "
//                         + t.getstatus());

//         System.out.println(
//                 "--------------------");
//         }

//         // =========================
//         // RETURN BOOK TEST
//         // =========================

//         boolean returnResult =
//                 transactionDao.returnBook(11);

//         if (returnResult) {

//         System.out.println(
//                 "Book Returned Successfully"
//         );

//         } else {

//         System.out.println(
//                 "Return Failed"
//         );
//         }

//         // =========================
//         // VIEW TRANSACTIONS AGAIN
//         // =========================

//         System.out.println(
//                 "\nAfter Return:"
//         );

//         transactions =
//                 transactionDao.getAllTransactions();

//         for (Transaction t : transactions) {

//         System.out.println(
//                 "Transaction ID : "
//                         + t.gettransactionId());

//         System.out.println(
//                 "User ID : "
//                         + t.getuserId());

//         System.out.println(
//                 "Book ID : "
//                         + t.getbookId());

//         System.out.println(
//                 "Borrow Date : "
//                         + t.getborrowDate());

//         System.out.println(
//                 "Return Date : "
//                         + t.getreturnDate());

//         System.out.println(
//                 "Status : "
//                         + t.getstatus());

//         System.out.println(
//                 "--------------------");
//         }
//         Librarian librarian =
//         new Librarian(
//                 100,
//                 "Admin",
//                 "admin@library.com",
//                 "9999999999"
//                 );

//         System.out.println(
//                 librarian.getname()
//         );

//         librarian.addBook();
//         librarian.removeBook();
//         librarian.manageUsers();
//         librarian.viewTransactions();

//         List<Book> books = new ArrayList<>();
//         books.add(book);

//         List<User> users = new ArrayList<>();
//         users.add(user);

//         Library library =
//                 new Library(
//                         books,
//                         users
//                 );

//         System.out.println(
//                 "Books Count : "
//                 + library.getBooks().size()
//         );

//         System.out.println(
//                 "Users Count : "
//                 + library.getUsers().size()
//         );


//         System.out.println("\n=== SEARCH TEST ===");

//         List<Book> searchResults =
//                         bookDao.searchBooks(
//                                 "title",
//                                 "Java"
//                         );

//                 for (Book b : searchResults) {

//                 System.out.println(
//                         "Book ID : " + b.getBookId()
//                 );

//                 System.out.println(
//                         "Title : " + b.getTitle()
//                 );

//                 System.out.println(
//                         "Author : " + b.getAuthor()
//                 );

//                 System.out.println(
//                         "Genre : " + b.getGenre()
//                 );

//                 System.out.println(
//                         "ISBN : " + b.getIsbn()
//                 );

//                 System.out.println(
//                         "--------------------"
//                 );
//                 }


}


}