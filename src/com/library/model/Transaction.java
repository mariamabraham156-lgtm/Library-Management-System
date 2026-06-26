package com.library.model;
import java.sql.Date;

public class Transaction{
    private int transactionId;
    private int userId;
    private int bookId;
    private Date borrowDate;
    private Date returnDate;
    private String status;

    public Transaction() {

    }

    public Transaction(int transactionId, int userId, int bookId, Date borrowDate, Date returnDate, String status){
        this.transactionId = transactionId;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public int gettransactionId(){
        return transactionId;
    }
    public void settransactionId(int transactionId){
        this.transactionId = transactionId;
    }

    public int getuserId(){
        return userId;
    }
    public void setuserId(int userId){
        this.userId = userId;
    }

    public int getbookId(){
        return bookId;
    }
    public void setbookId(int bookId){
        this.bookId = bookId;
    }

    public Date getborrowDate(){
        return borrowDate;
    }
    public void setborrowDate(Date borrowDate){
        this.borrowDate = borrowDate;
    }

    public Date getreturnDate(){
        return returnDate;
    }
    public void setreturnDate(Date returnDate){
        this.returnDate = returnDate;
    }

    public String getstatus(){
        return status;
    }
    public void setstatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "BorrowTransaction{" +
                "transactionId=" + transactionId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", status='" + status +'\''+
                '}';
    }

}


