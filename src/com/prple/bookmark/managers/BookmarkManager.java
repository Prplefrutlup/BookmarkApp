package com.prple.bookmark.managers;

import com.prple.bookmark.entities.Movie;

public class BookmarkManager {

    private static BookmarkManager bookmarkManager = new BookmarkManager();

    private BookmarkManager(){
    }

    public static BookmarkManager getInstance() {
        return bookmarkManager;
    }

    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, int imdbRating) {
     
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setResleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);
        
        return movie;
    }

    //todo create methods for book and weblink instances
}
