package org.course.skeleton.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.course.skeleton.dto.BookType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Builder
public class Book implements IBook, Serializable, Comparable<Book> {

    private final String name;

    private final String author;
    private final int pages;

    private final BookType type;

    private final List<Page> pageList = new ArrayList<>();

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


    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }

    public String toString() {
        return "Book(name=" + this.getName() + ", author=" + this.author + ", pages=" + this.getPages() + ", type=" + this.type + ", pageList=" + this.pageList + ")";
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
