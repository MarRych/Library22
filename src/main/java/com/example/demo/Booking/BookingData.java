package com.example.demo.Booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LibrarySystem")
public class BookingData {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column (name = "Rental date")
    private LocalDateTime rentalDate;

    @Column (name = "Date of return")
    private LocalDateTime dateOfReturn;

    @Column (name = "Penalty points")
    private int penaltyPoints;

    @Column (name = "Inactive account")
    private boolean InactiveAccount;

    @Column (name = "Unlock date")
    private LocalDateTime unlockDate;


}
