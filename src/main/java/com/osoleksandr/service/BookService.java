package com.osoleksandr.service;

import com.osoleksandr.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book getBookById(Long id);

    void addBook(Book book);

    void delBook(Long id);

    void editBook(Book book);
}
