package com.greenmoder.mocktest;

import com.greenmoder.mocktest.service.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Import(WebClientTestConfiguration.class)
@TestPropertySource(locations="classpath:test.properties")
class MockTestApplicationTests {

    @Autowired
    private DataService dataService;

    @Test
    void contextLoads() {
    }

}
