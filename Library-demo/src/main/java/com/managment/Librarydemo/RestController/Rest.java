package com.managment.Librarydemo.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import models.Book;
import models.Person;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.managment.Librarydemo.services.CRUD;

import java.util.List;
import java.util.logging.Logger;

@RestController
@Slf4j
public class Rest {
    private final CRUD crud;
    @Autowired
    public Rest(CRUD crud){
        this.crud=crud;
    }
    @PostMapping("/addBook")
    @Operation(
            tags = {"Add New Book"}
    )
    public String  AddBook(@RequestBody Book book){

        log.info("New Book Added");return crud.addNewBook(book);
    }
    @DeleteMapping("/deleteBook")
    @Operation(
            tags = {"Delete Book"}
    )
    public String deleteBook(@RequestParam int id){
        log.info("Book Deleted with id=",id);return crud.deleteBookBasedOnId(id);
    }
    @GetMapping("/getAll")
    @Operation(
            tags = {"retrieve All Books"}
    )
    public List<Book> getAll(){
       log.info("Books retrieved");return crud.showAll();
    }
    @PutMapping("/updateTitle/{id}")
    @Operation(
            tags = {"Update Book Title"}
    )
    public String updateTitle(@PathVariable("id") int id, @RequestParam String title){
        log.info("Book updated Title");
        return crud.updateTitle(id,title);
    }
    @PostMapping("/buyBook")
    @Operation(
            tags = {"Add Book to the Buyer List"}
    )
    public String buyBook(@RequestParam String title, @RequestBody Person person){
        log.info("book Added To Buyer's List");

        return crud.buyBook(title,person);
    }
    @PostMapping("/getBuyerList")
    @Operation(tags = {"Return Buyer List"})
    public List<Book> getBuyerList(@RequestBody Person person){
        log.info("Buyers List Retrieved");
        return crud.getUserBooksList(person);
    }

}
