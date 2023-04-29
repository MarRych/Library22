package com.example.demo.User.UserController;

import com.example.demo.User.UserDto;
import com.example.demo.User.UserService.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping

    @GetMapping
    public ResponseEntity<UserDto> get(final @PathVariable String userName){
        final UserDto getUserby = UserSe
    }


}
