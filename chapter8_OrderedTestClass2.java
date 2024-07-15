package junit5tests;

import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTestClass2 {
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
    @Order(2)
    void firstMethod(){
        System.out.println("this is the first test method");

    }
    @Test
    @DisplayName("US1234-TC12-this method is the second one")
    void secondMethod(){
        System.out.println("this is the second method");
    }
    @Test
    @Order(1)
    void thirdMethod(){
        System.out.println("this is the third method");
    }
}
