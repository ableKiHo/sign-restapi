package com.sign.restapi.mapper;

import com.sign.restapi.domain.SearchDto;
import com.sign.restapi.domain.UserDto;

import java.util.List;

public interface UserMapper {
    public List<UserDto> userList(SearchDto searchDto) throws Exception;
}
