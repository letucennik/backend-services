package com.epam.customconfig;

import com.epam.customconfig.domain.User;
import com.epam.customconfig.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringCustomConfigurationApplication.class)
public class SpringCustomConfigurationApplicationTests {

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