package com.ivoyant.usermanagement.Admin.service;

import com.ivoyant.usermanagement.Admin.payload.UserDto;

public interface UsersService {
    String register(UserDto userDto);
}
