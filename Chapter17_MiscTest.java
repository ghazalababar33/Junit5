package junit5tests;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class MiscTest {

    @Test
    @Timeout(5)
    void timeout() throws InterruptedException {
        System.out.println("This is the test with the timeout");
        Thread.sleep(6000);
    }
    @Test
    @Timeout(90)
    @DisplayName("This is the nice method")
    @Tag("theTag")
    void annotatedMethod1() {
        System.out.println("This is the annotated method");
    }
    @MyAnnotation
    void annotatedMethod2() throws InterruptedException {
        System.out.println("This is the custom annotated method");
    }


    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class NestedTest {

        @BeforeAll
        void beforeAll() {
            System.out.println("Before All in nested test");
        }

        @Test
        void nestedTestMethod() {
            System.out.println("Nested test method");
        }
    }
}

//Interface
package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Test
@Timeout(90)
@DisplayName("This is the nice method")
@Tag("theTag")
public @interface MyAnnotation {
}
