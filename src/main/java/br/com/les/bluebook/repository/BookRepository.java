package br.com.les.bluebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.les.bluebook.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
