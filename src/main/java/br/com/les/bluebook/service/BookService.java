package br.com.les.bluebook.service;

import org.springframework.stereotype.Service;

import br.com.les.bluebook.dto.book.DTORequestBook;
import br.com.les.bluebook.dto.book.DTOUpdateBook;
import br.com.les.bluebook.model.Book;
import br.com.les.bluebook.repository.BookRepository;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    
        public BookService(BookRepository repository){
            this.bookRepository = repository;
        }
    
        public Book save(DTORequestBook bookDTO){
            Book book = new Book(bookDTO);
            book = bookRepository.save(book);
            return book;
        }
        public Book getById(Long id){
            return bookRepository.findById(id).orElseThrow();
        }
        public List<Book> getAll(){
            return bookRepository.findAll();
        }

        @Transactional
        public Book updateBook(Long id, DTOUpdateBook bookDTO) {
            Book book = bookRepository.findById(id).orElseThrow();
            book.updateBook(bookDTO);
            return book;
        }

        public boolean deleteBook(Long id){
            if(!bookRepository.existsById(id)){
                return false;
            }
            bookRepository.deleteById(id);
            return true;
        }


}
