package com.dmi.endpoint;

import com.dmi.dto.UserDto;
import com.dmi.entity.UserEntity;
import com.dmi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.function.Function;

@Component
@AllArgsConstructor
public class GetUser implements Function<String, UserDto> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetUser.class);
    private final UserRepository userRepository;
    @Override
    public UserDto apply(String id) {
        LOGGER.info("Get user with id {}", id);
        UserDto userDto = null;
        try{
            UserEntity userEntity = userRepository.findById(id).get();
            userDto = UserDto.builder()
                    .userId(userEntity.getUid())
                    .fullName(userEntity.getFirstName() + " " + userEntity.getLastName())
                    .email(userEntity.getEmail())
                    .build();
        }catch (NoSuchElementException nse){
            userDto = new UserDto();
        }
        return userDto;
    }
}
