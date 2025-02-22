package br.com.les.bluebook.dto.book;

import br.com.les.bluebook.model.Book;

import java.math.BigDecimal;

public record DTOReadBook(
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

        String isbn,
        String releaseDate,
        String series,
        String illustrator,
        String translator,

        // Images and media
        String coverImage
) {
    public DTOReadBook(Book book) {
        this(
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getEdition(),
                book.getPublicationYear(),
                book.getLanguage(),
                book.getPrice(),
                book.getSynopsis(),
                book.getPageCount(),
                book.getDimensions(),
                book.getWeight(),
                book.getGenre(),
                book.getCategory(),
                book.getIsbn(),
                book.getReleaseDate(),
                book.getSeries(),
                book.getIllustrator(),
                book.getTranslator(),
                book.getCoverImage());
    }
}
