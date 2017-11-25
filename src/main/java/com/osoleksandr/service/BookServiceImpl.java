package com.osoleksandr.service;

import com.osoleksandr.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void delBook(Long id) {

    }

    @Override
    public void editBook(Book book) {

    }
}
