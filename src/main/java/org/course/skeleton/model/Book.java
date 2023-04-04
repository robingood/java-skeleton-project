package org.course.skeleton.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements IBook, Serializable {

    private final String name;

    private final int pages;

    private final List<Page> pageList = new ArrayList<>();

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String getDescription() {
        return "Book " + this.name + " has " + this.pages + " pages";
    }

    @Override
    public int getNumberOfPages() {
        return this.pages;
    }

    private static class Page {
        private final String content;

        public Page() {
            this.content = "";
        }

        public Page(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }
    }
}
