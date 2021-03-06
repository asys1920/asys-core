package com.asys1920.mapper;

import com.asys1920.dto.UserDTO;
import com.asys1920.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDTOtoUser(UserDTO user);

    UserDTO userToUserDTO(User user);
}
