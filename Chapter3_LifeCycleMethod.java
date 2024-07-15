package junit5tests;

import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {
    @BeforeAll
    static void beforeAll(){
        System.out.println("--This is the before All methods");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("----This the beforeEach Method");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("--this is the afterAll method");

    }
    @AfterEach
    void afterEach(){
        System.out.println("----This is the AfterEach method");
    }
    @Test
    void firstMethod(){
        System.out.println("this is the first test method");

    }
    @Test
    @DisplayName("US1234-TC12-this method is the second one")
    void secondMethod(){
        System.out.println("this is the second method");
    }
}
