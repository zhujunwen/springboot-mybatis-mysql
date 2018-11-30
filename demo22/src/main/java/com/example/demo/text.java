package com.example.demo;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class text {
    @Autowired
    private UserServiceImpl us;


    @org.junit.Test
    public void adduser(){
        User u = new User();
        u.setId(39);
        u.setName("xiaodA");
        u.setAge(15);
        us.addUser(u);
    }
}
