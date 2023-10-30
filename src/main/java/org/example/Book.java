package org.example;

import java.util.ArrayList;
import java.util.List;

class Book implements Comparable<LibraryItem>, LibraryItem {
    private String title;
    private String author;

    // Реализация конструктора
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Реализация метода CompareTo
    @Override
    public int compareTo(LibraryItem other) {
        return getDescription().compareTo(other.getDescription());
    }



    // Реализация метода Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }

    // Реализация метода getDescription
    @Override
    public String getDescription() {
        return "Book: " + title + " by " + author;
    }
}

