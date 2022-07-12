package com.dmi.endpoint;

import com.dmi.dto.UserDto;
import com.dmi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

@Component
@AllArgsConstructor
public class GetUsers implements Supplier<List<UserDto>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetUsers.class);
    private final UserRepository userRepository;
    @Override
    public List<UserDto> get() {
        LOGGER.info("GetUsers.get()");
        return userRepository.findAll().stream().map(userEntity -> {
            return UserDto.builder()
                    .userId(userEntity.getUid())
                    .fullName(userEntity.getFirstName() + " " + userEntity.getLastName())
                    .email(userEntity.getEmail())
                    .build();
        }).collect(java.util.stream.Collectors.toList());
    }
}
