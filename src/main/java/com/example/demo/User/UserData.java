package com.example.demo.User;

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
@Table(name = "UserData")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUserData;

    @Column (name = "User ID", nullable = false)
    private int userId;

    @Column(name = "User name", nullable = false)
    private String userName;

    @Column(name = "email", nullable = false)
    private String userEmail;

}
