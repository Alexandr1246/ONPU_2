package com.company.Classes;

import com.company.Enums.Condition;
import com.company.Enums.CoverType;

import java.util.ArrayList;

public class Book {
    String title;
    ArrayList <Author> authors;
    Publisher publisher;
    int publishedYear;
    int pages;
    CoverType coverType;
    Condition condition;

    public Book(Book book)
    {
        this.authors = book.authors;
        this.condition = book.condition;
        this.coverType = book.coverType;
        this.pages = book.pages;
        this.publishedYear = book.publishedYear;
        this.publisher = book.publisher;
        this.title = book.title;

    }

    public Book(String title, Author[] authors, Publisher publisher, int publishedYear, int pages, CoverType coverType, Condition condition) {
        this.title = title;
        this.authors = new ArrayList<>();
        for (Author author: authors)
        {
            this.authors.add(author);
        }
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.pages = pages;
        this.coverType = coverType;
        this.condition = condition;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getPages() {
        return pages;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", publisher=" + publisher +
                ", publishedYear=" + publishedYear +
                ", pages=" + pages +
                ", coverType=" + coverType +
                ", condition=" + condition +
                '}';
    }
}
