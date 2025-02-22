package br.com.les.bluebook.dto.book;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.ISBN;

import java.math.BigDecimal;


public record DTOUpdateBook(
        // Basic attributes
        @NotNull Long id,
        String title,
        String author,
        String publisher,
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
        //String[] additionalImages
        )
{

}
