package com.JavaDevSpring.dao;


import com.JavaDevSpring.model.Book;
import com.JavaDevSpring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@Component
public class BookDAO {

    private static int sequence;
    private Book book;
    String bookName;

    @Autowired
    private BookRepository bookRepository;


    public void addBook(String bookName){
        this.bookName = bookName;
        System.out.println(this.bookName);
        System.out.println(bookName);
        bookRepository.save(new Book(++sequence, bookName));
        //new Book(++sequence, bookName)
    }


    ArrayList<Book> list = new ArrayList<>();


    public int getSize() {
        //System.out.println(list.size());
        return list.size();
    }

    public String getBooks() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getBookName());
        }
        return null;
    }

}
