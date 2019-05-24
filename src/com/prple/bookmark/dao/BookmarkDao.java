package com.prple.bookmark.dao;

import com.prple.bookmark.DataStore;
import com.prple.bookmark.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks() {
        return DataStore.getBookmarks();
    }
}
