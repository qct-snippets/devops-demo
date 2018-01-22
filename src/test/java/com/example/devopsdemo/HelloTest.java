package com.example.devopsdemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Created by quchentao on 2018/1/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    @Autowired
    private Hello hello;

    @Test
    public void say() {
        String say = hello.say();
        Assert.assertEquals("hello", say);
    }
}