package com.example.demo.User.UserService;

import com.example.demo.Book.BookData;
import com.example.demo.User.UserCreateDto;
import com.example.demo.User.UserData;
import com.example.demo.User.UserDto;
import com.example.demo.User.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserCreateDto addUser(int userId, String userName, String userEmail){
        UserData dataUser = new UserData();
        dataUser.setUserId(userId);
        dataUser.setUserName(userName);
        dataUser.setUserEmail(userEmail);

        UserData userData = userRepository.save(dataUser);
        return new UserCreateDto(userData.getUserId(), userData.getUserName(), userData.getUserEmail());
    }

    public UserDto getUserByName(final String userName){
        final UserData userByName = userRepository.getUserByName(userName);
        return new UserDto(userByName.getUserName());
    }


}
