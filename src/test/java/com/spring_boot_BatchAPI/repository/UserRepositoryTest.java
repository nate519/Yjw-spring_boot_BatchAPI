package com.spring_boot_BatchAPI.repository;

import com.spring_boot_BatchAPI.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void name() throws Exception {
        assertEquals("hello", "hello");
    }
/*
    @Test
    public void name2() throws Exception {
        assertEquals("hello", "bye");
    }*/

    @Test
    public void save() throws Exception {
        User user = new User("davidweb", "1234" , "JungWon" );
        userRepository.save(user);
    }
}