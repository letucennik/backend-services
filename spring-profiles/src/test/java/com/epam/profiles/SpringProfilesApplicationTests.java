package com.epam.profiles;

import com.epam.profiles.domain.User;
import com.epam.profiles.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = SpringProfilesApplication.class)
@ActiveProfiles("dev")
public class SpringProfilesApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveDocumentSuccessful() {
        User user = new User("Mira", "Bulhakava");
        userRepository.save(user);
        Assertions.assertThat(user.getId()).isNotZero();
        Assertions.assertThat(userRepository.findById(user.getId())).isNotEmpty();
    }

}
