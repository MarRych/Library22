package com.example.demo.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookData, Long> {


    // BookData addBookToTheList(int bookId, String bookAuthor, String bookTitle, boolean bookStatus);
    BookData findBookByBookTitleAndBookStatus(final String bookTitle, final boolean bookStatus);
}