package com.dmi.service;


import com.dmi.entity.UserEntity;
import com.dmi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("postConstruct");
        LOGGER.info("saving some entities");
        userRepository.saveAll(
                List.of(
                        new UserEntity("101","Jon","Mec","jon@test"),
                        new UserEntity("102","sunny","Leo","sunny@test"),
                        new UserEntity("103","Abec","George","abec@test")
                )
        );
    }
}
