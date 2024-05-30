package com.ivoyant.usermanagement.Admin.controller;

import com.ivoyant.usermanagement.Admin.payload.UserDto;
import com.ivoyant.usermanagement.Admin.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class AdminController {


    private UsersService usersService;

    public AdminController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("api")
    public ResponseEntity<String> register(@RequestBody UserDto userDto){

        String response = usersService.register(userDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
