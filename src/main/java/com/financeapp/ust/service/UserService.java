package com.financeapp.ust.service;

import com.financeapp.ust.dto.UserDto;

import java.util.List;

public interface UserService {

    public UserDto save(UserDto userDto);

    public List<UserDto> getAllUsers();

    public UserDto updateUserPassword(UserDto userDto);

    public void deleteUser(int id);

    public String login(UserDto userDto);

    public UserDto getUserDetailsById(int id);
}
