package com.epam.autoconfig;

import com.epam.autoconfig.domain.User;
import com.epam.autoconfig.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest(classes = SpringAutoConfigurationApplication.class)
public class SpringAutoConfigurationApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testDataSource() {
        User user = new User("Mira", "Bulhakava");
        userRepository.save(user);
        Assertions.assertThat(user.getId()).isNotZero();
        Assertions.assertThat(userRepository.findById(user.getId())).isNotEmpty();
    }
}
