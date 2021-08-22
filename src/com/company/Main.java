package com.company;

import com.company.Classes.*;
import com.company.Enums.Condition;
import com.company.Enums.CoverType;
import com.company.Enums.Genres;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Книга1", new Author[]{new Author( "Ivanov", new Date("2000/01/01"), Genres.детектив)},
        new Publisher("BHV","www.bhc.com.ua", 1990), 2017, 40, CoverType.суперобложка, Condition.отличное);
        book1.getAuthors().get(0).addAuthorGenres(Genres.лирика);

        Book book2 = new Book("Книга2", new Author[]{new Author( "Петров", new Date("2000/01/01"), Genres.детектив)},
                new Publisher("BHV","www.bhc.com.ua", 1990), 2017, 40, CoverType.суперобложка, Condition.отличное);
        book2.getAuthors().get(0).addAuthorGenres(Genres.лирика);
        System.out.println(book1);
        System.out.println(book2);

        Book4Library book4Library1 = new Book4Library(book1);
        Book4Library book4Library2 = new Book4Library(book2);
        Library library = new Library();

        library.addBook(book4Library1);
        library.addBook(book4Library2);
        System.out.println(library);
    }

}
