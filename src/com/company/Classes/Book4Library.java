package com.company.Classes;

import com.company.Enums.Condition;
import com.company.Enums.CoverType;

public class Book4Library extends Book
{
    int ID;

    @Override
    public String toString() {
        return  "id:" + ID + "  "+  super.toString();
    }

    public Book4Library(String title, Author[] authors, Publisher publisher, int publishedYear, int pages, CoverType coverType, Condition condition, int id) {
        super(title, authors, publisher, publishedYear, pages, coverType, condition);
        this.ID = id;

    }

    public Book4Library(Book book)
    {
        super (book);
    }
}
