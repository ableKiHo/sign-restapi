package com.sign.restapi.service;

import com.sign.restapi.domain.SearchDto;
import com.sign.restapi.domain.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> userList(SearchDto searchDto) throws Exception;
}
