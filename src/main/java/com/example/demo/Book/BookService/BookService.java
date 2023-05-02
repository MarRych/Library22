package com.example.demo.Book.BookService;

import com.example.demo.Book.BookCreateDto;
import com.example.demo.Book.BookData;
import com.example.demo.Book.BookDto;
import com.example.demo.Book.BookRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public BookCreateDto addBook(final String bookAuthor, final String bookTitle, boolean bookStatus) {
        BookData dataBook = new BookData();
        dataBook.setBookAuthor(bookAuthor);
        dataBook.setBookTitle(bookTitle);
        dataBook.setBookStatus(bookStatus);

        BookData bookData = bookRepository.save(dataBook);
        return new BookCreateDto(bookData.getBookId(),bookData.getBookTitle(),bookData.getBookAuthor(),bookData.isBookStatus());
    }

    public BookDto findBookByTitleAndStatus(final String bookTitle, boolean bookStatus) {
        final BookData bookByTitle = bookRepository.findBookByBookTitleAndBookStatus(bookTitle, bookStatus);
        return new BookDto(bookByTitle.getBookTitle(), bookByTitle.isBookStatus());
    }


    public void saveBook(BookCreateDto bookCreateDto) {
    }

    public void deleteBookByTitle(String bookTitle) {
    }
}
