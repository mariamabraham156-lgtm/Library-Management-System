package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import com.library.model.Transaction;
import com.library.util.DatabaseConnection;

public class TransactionDAO {

 // BORROW STATEMENT 

    public boolean borrowBook(int transactionId, int userId,int bookId){

        String sql = "INSERT INTO transactions(transaction_id,user_id,book_id,borrow_date,status) VALUES(?,?,?,?,?)";

        try{

            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1,transactionId);
            pstmt.setInt(2,userId);
            pstmt.setInt(3,bookId);

            pstmt.setDate(4,new Date(System.currentTimeMillis()));

            pstmt.setString(5,"Borrowed");

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

// RETURN STATEMENT

    public boolean returnBook(int transactionId) {

        String sql =
                "UPDATE transactions SET return_date=?, status=? WHERE transaction_id=?";

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement(sql);

            pstmt.setDate(
                    1,
                    new Date(System.currentTimeMillis())
            );

            pstmt.setString(2, "Returned");

            pstmt.setInt(3, transactionId);

            int rowsAffected =
                    pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

        
    }

// LIST ALL TRANSACTIONS

    public List<Transaction> getAllTransactions(){

                List<Transaction> transactions = new ArrayList<>();

                String sql = "SELECT * FROM transactions";

                try{

                    Connection conn = DatabaseConnection.getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    ResultSet rs = pstmt.executeQuery();

                    while(rs.next()){

                        Transaction transaction = new Transaction();

                        transaction.settransactionId(rs.getInt("transaction_id"));

                        transaction.setuserId(rs.getInt("user_id"));

                        transaction.setbookId(rs.getInt("book_id"));

                        transaction.setborrowDate(rs.getDate("borrow_date"));

                        transaction.setreturnDate(rs.getDate("return_date"));

                        transaction.setstatus(rs.getString("status"));

                        transactions.add(transaction);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

                return transactions;
            }
}
    

