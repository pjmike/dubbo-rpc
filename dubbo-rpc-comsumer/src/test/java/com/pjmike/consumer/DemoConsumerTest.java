package com.pjmike.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoConsumerTest {
    @Autowired
    private DemoConsumer demoConsumer;

    @Test
    public void test() {
        demoConsumer.hello();
    }
}