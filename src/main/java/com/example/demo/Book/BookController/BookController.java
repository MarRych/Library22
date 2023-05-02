package com.example.demo.Book.BookController;


import com.example.demo.Book.BookCreateDto;
import com.example.demo.Book.BookDto;
import com.example.demo.Book.BookService.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;


    @PostMapping
    public ResponseEntity<BookCreateDto> addBook(@RequestBody BookCreateDto bookCreateDto) {
        bookService.saveBook(bookCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/{title}")
    public ResponseEntity<BookDto> getBookBy(final @PathVariable String bookTitle,
                                             final @PathVariable boolean bookStatus) {
        final BookDto getBookByTitle = bookService.findBookByTitleAndStatus(bookTitle, bookStatus);

        return new ResponseEntity<>(getBookByTitle, HttpStatus.OK);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<Void> deleteBookBy(final @PathVariable String bookTitle) {
        bookService.deleteBookByTitle(bookTitle);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}