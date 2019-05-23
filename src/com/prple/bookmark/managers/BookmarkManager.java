package com.prple.bookmark.managers;

import com.prple.bookmark.entities.Movie;

public class BookmarkManager {

    private static BookmarkManager bookmarkManager = new BookmarkManager();

    private BookmarkManager(){
    }

    public static BookmarkManager getInstance() {
        return bookmarkManager;
    }

    public Movie createMovie() {
        Movie movie = new Movie();

        //todo add code that instantiates a movie

        return movie;
    }

    //todo create methods for book and weblink instances
}
