package com.managment.Librarydemo.services;
import models.Book;
import models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class CRUD {
        private List<Book> bookList=new ArrayList<Book>();
        private List<Book> books=new ArrayList<>();
        //book

    public CRUD(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String addNewBook(Book book){

        bookList.add(book);

        return "Book Added with Id="+book.getId();


    }
    public String deleteBookBasedOnId(int id) {
        Iterator<Book> iterator = bookList.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove(); // Use iterator to safely remove the element
                return "Book with id=" + id + " Deleted";
            }
        }

        return "No Book Found with id " + id;
    }
    public List<Book> showAll(){
        return bookList;
    }
    public String updateTitle(int id, String title) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                book.setTitle(title);
                return "Title updated Successfully";
            }
        }

        return "No Book Found with id " + id;
    }
    public String buyBook(String title, Person person) {
        for (Book book : bookList) {
            if (book.getTitle() .equals(title)) {
                person.setBooks(books, book);
                return "Book with Title " + title + "Added Successfully";
            }
        }
        return "No Book with Title" + title + " Found";
    }
    public List<Book> getUserBooksList (Person person){
return books;
    }
    }



