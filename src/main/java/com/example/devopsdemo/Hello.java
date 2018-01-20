package com.example.devopsdemo;

import org.springframework.stereotype.Service;

/**
 * <p>Created by quchentao on 2018/1/20.
 */
@Service
public class Hello {

    public String say() {
        System.out.println("hello");
        return "hello";
    }
}
