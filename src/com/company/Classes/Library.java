package com.company.Classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book4Library> books;

    public ArrayList<Book4Library> getBooks() {
        return books;
    }
    public void addBook(Book4Library book)
    {
        if (this.books.isEmpty())
        book.ID =1;
        else
            book.ID=this.books.get(this.books.size()-1).ID+1;
        this.books.add(book);
    }
    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(int booksNumber) {
        this.books = new ArrayList<>(booksNumber);
    }

    @Override
    public String toString() {
        String result = "Library + \n";
        for (Book4Library book:this.books)
        {
        result += book + "\n";
        }
        return result;
    }
}
