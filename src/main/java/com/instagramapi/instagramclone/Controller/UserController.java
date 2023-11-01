package com.instagramapi.instagramclone.Controller;

import com.instagramapi.instagramclone.Entity.Users;
import com.instagramapi.instagramclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("")
    private Users submitUser(@RequestBody Users users){
        return userService.submitMetaDataOfUser(users);

    }
    @GetMapping("/{userId}")
    private Users getUserDetails(@PathVariable("userId") String userId){
        Users user = userService.displayUserMetaData(userId);
        return user;
    }
}
