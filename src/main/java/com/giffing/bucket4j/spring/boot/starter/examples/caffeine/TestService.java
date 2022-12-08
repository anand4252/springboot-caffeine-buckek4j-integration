package com.giffing.bucket4j.spring.boot.starter.examples.caffeine;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Cacheable("mytest")
    public String myService(int key){
        System.out.println("Service Invoked");
        return "hello " + key;
    }
}
