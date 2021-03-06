package com.company.Classes;

import com.company.Enums.Genres;

import java.util.ArrayList;
import java.util.Date;

public class Author {
    String name;
    Date birthday;

    ArrayList<Genres> authorGenres;

    public Author(String name, Date birthday, Genres authorGenres) {
        this.name = name;
        this.birthday = birthday;
        this.authorGenres = new ArrayList<>();
        this.authorGenres.add(authorGenres);
    }

    public void addAuthorGenres(Genres authorGenre) {
        this.authorGenres.add(authorGenre);
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public ArrayList<Genres> getAuthorGenres() {
        return authorGenres;
    }

    @Override
    public String toString() {
        String genres = "";
        for (Genres genre: authorGenres)
        {
        genres += genre + ", ";
        genres = genres.substring(0, genres.length()-1);
        }
        return "{" + name + ", (" + birthday.getDay()+'.'+ birthday.getMonth()+1+ '.'+ (birthday.getYear()+1900)+ "), Genres; " + genres + '}';
    }
}

