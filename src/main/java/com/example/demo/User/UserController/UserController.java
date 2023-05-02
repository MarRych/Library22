package com.example.demo.User.UserController;

import com.example.demo.User.UserCreateDto;
import com.example.demo.User.UserDto;
import com.example.demo.User.UserService.UserService;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<UserCreateDto> addUser(@PathVariable UserCreateDto userCreateDto){
        userService.saveUser(userCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<UserDto> getUser(final @PathVariable String userName){
        final UserDto getUserBy = userService.getUserbyName(userName);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
