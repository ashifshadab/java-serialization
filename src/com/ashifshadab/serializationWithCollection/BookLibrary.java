package com.ashifshadab.serializationWithCollection;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class BookLibrary implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    private List books;

    private Set uniqueBooks;

    private Map bookShelves;

    public BookLibrary() {
    }

    public BookLibrary(List books, Set uniqueBooks, Map bookShelves) {
        this.books = books;
        this.uniqueBooks = uniqueBooks;
        this.bookShelves = bookShelves;
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "books=" + books +
                ", uniqueBooks=" + uniqueBooks +
                ", bookShelves=" + bookShelves +
                '}';
    }
}
