package com.hainet.jasypt.spring.boot.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptTest {

    @Value("${app.password}")
    private String password;

    @Test
    public void decryptTest() {
        assertThat(password, is("hainet"));
    }
}
