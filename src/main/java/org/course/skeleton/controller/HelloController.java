package org.course.skeleton.controller;

import org.course.skeleton.dto.BookType;
import org.course.skeleton.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping(value = "")
public class HelloController {

    private final int myNumber = 0;

    @GetMapping(value = "/book-by-key/{key}")
    @ResponseBody
    public String getBookByName(@PathVariable String key) {
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("book1", Book.builder()
                .name("La tiganci")
                .author("M. Eliade")
                .type(BookType.COMEDY)
                .pages(20)
                .build());

        bookMap.put("book2", Book.builder()
                .name("La scaldat")
                .author("I. Creanga")
                .type(BookType.COMEDY)
                .pages(20)
                .build());

        Book selectedBook = bookMap.getOrDefault(key, Book.builder().build());
        return selectedBook.toString();
    }

    @GetMapping(value = "/hello/{name}")
    @ResponseBody
    public String helloByName(@PathVariable String name) {

        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(Book.builder()
                .name("La tiganci")
                .author("M. Eliade")
                .type(BookType.COMEDY)
                .pages(20)
                .build());

        bookSet.add(Book.builder()
                .name("La scaldat")
                .type(BookType.COMEDY)
                .pages(20)
                .build());

        List<Book> bookList = new ArrayList<>();
        bookList.add(Book.builder()
                .name("La tiganci")
                .type(BookType.COMEDY)
                .pages(20)
                .build());
        return bookList.get(0).getName();

        /*
        Book[] myBooks = new Book[]{new Book("La scaldat", 20)};
        return myBooks[0].getName();*/

        /*

        Book book = new Book("La scaldat", 20);
        String capitalName = book.getName().toUpperCase();

        myNumber = myNumber + 1;*7

        return "User " + name + " has read : " + book.getDescription();
/*
        if (myNumber == 1) {
            return "Hello " + name2 + " you have called this page " + myNumber + " time";
        }
        return "Hello " + name2 + " you have called this page " + myNumber + " times";*/
    }
}
