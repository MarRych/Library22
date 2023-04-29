package com.example.demo.Book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BookData")
public class BookData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUserData;

    @Column(nullable = false)
    private int bookId;

    @Column(nullable = false)
    private String bookTitle;

    @Column(nullable = false)
    private String bookAuthor;

    @Column(nullable = false)
    private boolean bookStatus;

}
