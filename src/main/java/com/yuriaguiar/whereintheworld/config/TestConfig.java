package com.yuriaguiar.whereintheworld.config;

import com.yuriaguiar.whereintheworld.entities.Country;
import com.yuriaguiar.whereintheworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Country c1 = new Country(null,"Brasil","America do Sul","100", "Brasilia", "BR");
        Country c2 = new Country(null, "Argentina", "America do Sul", "100", "Buenos Aires", "AR");

        userRepository.saveAll(Arrays.asList(c1,c2));
    }
}
