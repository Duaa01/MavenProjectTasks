package junitTests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class testClass {

    @BeforeAll
    void init(){
        System.out.println("Browser must be loaded");
    }
    @BeforeEach
    void entryCriteria(){
        System.out.println("Login required");
    }
    @AfterAll
    void afterAll(){
        System.out.println("Clean up");
    }
    @AfterEach
    void afterEach(){
        System.out.println("End of test");
    }

    @Test
    public void firstTest(){
        System.out.println("First Test");
    }
    @Test
    public void secondTest(){
        System.out.println("Second Test");
    }
}
