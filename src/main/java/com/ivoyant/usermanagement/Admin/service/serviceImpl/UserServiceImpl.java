package com.ivoyant.usermanagement.Admin.service.serviceImpl;

import com.ivoyant.usermanagement.Admin.payload.UserDto;
import com.ivoyant.usermanagement.Admin.entity.Users;
import com.ivoyant.usermanagement.Admin.repository.UserRepo;
import com.ivoyant.usermanagement.Admin.service.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UsersService {

    public UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public String register(UserDto userDto) {
        Users users =new Users();
        users.setUser_name(userDto.getUsername());
        users.setEmail(userDto.getEmail());
        users.setPassword(userDto.getPassword());
        userRepo.save(users);
        return "User Added successfully";
    }
}
