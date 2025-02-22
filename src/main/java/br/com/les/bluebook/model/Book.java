package br.com.les.bluebook.model;

import br.com.les.bluebook.dto.book.DTORequestBook;
import br.com.les.bluebook.dto.book.DTOUpdateBook;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;


@Entity(name = "Book")
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Book {
   // Basic attributes
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String author;
   private String publisher;
   private String edition;
   private Integer publicationYear;
   private String language;
   private BigDecimal price;

   // Description and details
   private String synopsis;
   private Integer pageCount;
   private String dimensions;
   private Double weight;

   // Categorization
   private String genre;
   private String category;
   //private String[] tags;

   // Additional information
   private String isbn;
   private String releaseDate;
   private String series;
   private String illustrator;
   private String translator;

   // Images and media
   private String coverImage;
//   private String[] additionalImages;

   public Book(DTORequestBook bookDTO){
    
        this.title = bookDTO.title();
        this.author = bookDTO.author();
        this.publisher = bookDTO.publisher();
        this.edition = bookDTO.edition();
        this.publicationYear = bookDTO.publicationYear();
        this.language = bookDTO.language();
        this.price = bookDTO.price();
        this.synopsis = bookDTO.synopsis();
        this.pageCount = bookDTO.pageCount();
        this.dimensions = bookDTO.dimensions();
        this.weight = bookDTO.weight();
        this.genre = bookDTO.genre();
        this.category = bookDTO.category();
//        this.tags = bookDTO.tags();
        this.isbn = bookDTO.isbn();
        this.releaseDate = bookDTO.releaseDate();
        this.series = bookDTO.series();
        this.illustrator = bookDTO.illustrator();
        this.translator = bookDTO.translator();
        this.coverImage = bookDTO.coverImage();
//        this.additionalImages = bookDTO.additionalImages();
   }
   public void updateBook(DTOUpdateBook bookDTO){
      if(bookDTO.title() != null &&!bookDTO.title().isBlank()) this.title = bookDTO.title();
      if(bookDTO.author() != null &&!bookDTO.author().isBlank()) this.author = bookDTO.author();
      if(bookDTO.publisher() != null &&!bookDTO.publisher().isBlank()) this.publisher = bookDTO.publisher();
      if(bookDTO.edition() != null &&!bookDTO.edition().isBlank()) this.edition = bookDTO.edition();
      if(bookDTO.publicationYear() != null ) this.publicationYear = bookDTO.publicationYear();
      if(bookDTO.language() != null &&!bookDTO.language().isBlank()) this.language = bookDTO.language();
      if(bookDTO.price() !=null ) this.price = bookDTO.price();
      if(bookDTO.synopsis() != null &&!bookDTO.synopsis().isBlank()) this.synopsis = bookDTO.synopsis();
      if(bookDTO.pageCount()!= null ) this.pageCount = bookDTO.pageCount();
      if(bookDTO.dimensions() != null && !bookDTO.dimensions().isBlank()) this.dimensions = bookDTO.dimensions();
      if(bookDTO.weight() != null) this.weight = bookDTO.weight();
      if(bookDTO.genre() != null &&!bookDTO.genre().isBlank()) this.genre = bookDTO.genre();
      if(bookDTO.category() != null &&!bookDTO.category().isBlank()) this.category = bookDTO.category();
//      if(bookDTO.tags().length != 0) this.tags = bookDTO.tags();
      if(bookDTO.isbn() != null &&!bookDTO.isbn().isBlank()) this.isbn = bookDTO.isbn();
      if(bookDTO.releaseDate() != null &&!bookDTO.releaseDate().isBlank()) this.releaseDate = bookDTO.releaseDate();
      if(bookDTO.series() != null &&!bookDTO.series().isBlank()) this.series = bookDTO.series();
      if(bookDTO.illustrator() != null &&!bookDTO.illustrator().isBlank()) this.illustrator = bookDTO.illustrator();
      if(bookDTO.translator() != null &&!bookDTO.translator().isBlank()) this.translator = bookDTO.translator();
      if(bookDTO.coverImage() != null &&!bookDTO.coverImage().isBlank()) this.coverImage = bookDTO.coverImage();
//      if(bookDTO.additionalImages().length != 0) this.additionalImages = bookDTO.additionalImages();
   }
}
