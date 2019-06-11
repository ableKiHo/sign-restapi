package com.sign.restapi.service;

import com.sign.restapi.domain.SearchDto;
import com.sign.restapi.domain.UserDto;
import com.sign.restapi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> userList(SearchDto searchDto) throws Exception{
        return userMapper.userList(searchDto);
    }
}
