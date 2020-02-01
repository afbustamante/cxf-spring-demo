package net.andresbustamante.example.users.webservices.impl;

import net.andresbustamante.example.users.UserType;
import net.andresbustamante.example.users.mappers.UserMapper;
import net.andresbustamante.example.users.services.UsersManagementService;
import net.andresbustamante.example.users.webservices.UsersManagementWebService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Holder;

public class UsersManagementWebServiceImpl implements UsersManagementWebService {

    @Autowired
    private UsersManagementService usersManagementService;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(Holder<UserType> user) {
        usersManagementService.createUser(userMapper.map(user.value));
    }
}
