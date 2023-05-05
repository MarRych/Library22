package com.example.demo.User.UserController;

import com.example.demo.User.UserCreateDto;
import com.example.demo.User.UserDto;
import com.example.demo.User.UserService.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserCreateDto> addUser(@PathVariable UserCreateDto userCreateDto){
        userService.saveUser(userCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<UserDto> getUser(final @PathVariable String userName){
        final UserDto getUserBy = userService.getUserByName(userName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deleteBookBy(final @PathVariable int userId){
    userService.deleteUserById(userId);
     return new ResponseEntity<>(HttpStatus.OK);
    }



}
