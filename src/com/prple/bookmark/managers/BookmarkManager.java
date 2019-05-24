package com.prple.bookmark.managers;

import com.prple.bookmark.dao.BookmarkDao;
import com.prple.bookmark.entities.Book;
import com.prple.bookmark.entities.Bookmark;
import com.prple.bookmark.entities.Movie;
import com.prple.bookmark.entities.Weblink;

public class BookmarkManager {

    //allows the creation of static singleton call
    private static BookmarkManager bookmarkManager = new BookmarkManager();

    //instantiates a bookmark dao
    private static BookmarkDao dao = new BookmarkDao();

    private BookmarkManager(){
    }

    //allows only one instance of BookmarkManager class be created (Singleton design pattern)
    public static BookmarkManager getInstance() {
        return bookmarkManager;
    }

    //creates movie instance
    public Movie createMovie(long id, String title, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {
     
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);
        
        return movie;
    }

    //creates book instance
    public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre, double amazonRating) {

        Book book  = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    //creates weblink instance
    public Weblink createWeblink(long id, String title, String url, String host) {

        Weblink weblink = new Weblink();
        weblink.setId(id);
        weblink.setTitle(title);
        weblink.setUrl(url);
        weblink.setHost(host);

        return weblink;
    }

    public Bookmark[][] getBookmarks() {
        return dao.getBookmarks();
    }

}
