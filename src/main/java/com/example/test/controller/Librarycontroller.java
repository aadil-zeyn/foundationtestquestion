package com.example.test.controller;

import com.example.test.model.Book;
import com.example.test.model.User;
import com.example.test.repository.BookRepository;
import com.example.test.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping
public class Librarycontroller {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/addbook")
    public ResponseEntity<Book> create(@RequestBody Book book){

        return ResponseEntity.ok().body(null);
    }
    @PostMapping("/adduser")
    public ResponseEntity<User> createUser(@RequestBody User user){

        return ResponseEntity.ok().body(null);
    }
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Long id){
        return ResponseEntity.ok().body(null);


    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){

        return ResponseEntity.ok().body(null);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateDetails(@RequestBody Book book, @PathVariable long id){

            return ResponseEntity.ok().body(null);
       }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Boolean> deleteBook(@PathVariable long id){
          return ResponseEntity.ok(null);

    }}

