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

    public BookCreateDto addBookToTheList(final String bookAuthor, final String bookTitle, boolean bookStatus) {
        BookData data = new BookData();
        data.setBookAuthor(bookAuthor);
        data.setBookTitle(bookTitle);
        data.setBookStatus(bookStatus);

        BookData bookData = bookRepository.save(data);
        return new BookCreateDto(bookData.getBookId(),bookData.getBookTitle(),bookData.getBookAuthor(),bookData.isBookStatus());
    }

    public BookDto findBookByTitleAndStatus(final String bookTitle, boolean bookStatus) {
        final BookData bookByTitle = bookRepository.findBookByBookTitleAndBookStatus(bookTitle, bookStatus);
        return new BookDto(bookByTitle.getBookTitle(), bookByTitle.isBookStatus());
    }


    public void save(BookCreateDto bookCreateDto) {
    }

    public void deleteBookByTitle(String bookTitle) {
    }
}
