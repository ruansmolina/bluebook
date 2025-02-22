package br.com.les.bluebook.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import br.com.les.bluebook.dto.book.DTOReadBook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.les.bluebook.dto.book.DTORequestBook;
import br.com.les.bluebook.dto.book.DTOUpdateBook;
import br.com.les.bluebook.model.Book;
import br.com.les.bluebook.service.BookService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<DTOReadBook> getBook(@PathVariable Long id) {
        Book book = bookService.getById(id);
        return ResponseEntity.ok(new DTOReadBook(book));
    }
    @GetMapping("/")
    public ResponseEntity<List<DTOReadBook>> getAllBook() {
        List<DTOReadBook> books = bookService.getAll().stream().map(DTOReadBook::new).toList();
        return ResponseEntity.ok(books);
    }
    
    @PostMapping("/")
    public ResponseEntity<Book> createBook(@RequestBody @Valid DTORequestBook bookDTO,UriComponentsBuilder uriBuilder) {
       
        var book = bookService.save(bookDTO);
        URI uri = uriBuilder.path("/book/{id}").buildAndExpand(book.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DTOReadBook> updateBook(@PathVariable Long id, @RequestBody DTOUpdateBook bookDTO) {
        Book book = bookService.updateBook(id,bookDTO);
        return ResponseEntity.ok(new DTOReadBook(book));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable Long id){
        var deleted = bookService.deleteBook(id);

        if(deleted) return ResponseEntity.accepted().build();
        else return ResponseEntity.badRequest().build();
    }
    
}


