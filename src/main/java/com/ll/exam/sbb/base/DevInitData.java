package com.ll.exam.sbb.base;

import com.ll.exam.sbb.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData {
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {

        };
    }
}
