package net.andresbustamante.example.users.mappers;

import net.andresbustamante.example.users.UserType;
import net.andresbustamante.example.users.beans.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserType userType);

    @Mapping(target = "password", ignore = true)
    UserType map(User user);
}
