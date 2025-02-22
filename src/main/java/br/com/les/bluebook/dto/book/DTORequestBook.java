package br.com.les.bluebook.dto.book;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.ISBN;

import jakarta.validation.constraints.NotBlank;

public record DTORequestBook(
        // Basic attributes
        @NotBlank String title,
        @NotBlank String author,
        @NotBlank String publisher,
        String edition,
        Integer publicationYear,
        String language,
        BigDecimal price,

        // Description and details
        String synopsis,
        Integer pageCount,
        String dimensions,
        Double weight,

        // Categorization
        String genre,
        String category,
        //String[] tags,

        // Additional information
        @ISBN
        String isbn,
        String releaseDate,
        String series,
        String illustrator,
        String translator,

        // Images and media
        String coverImage
        //String[] additionalImages)
){


}
