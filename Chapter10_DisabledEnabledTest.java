package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisabledEnabledTest {
    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest(){
        System.out.println("This is the first test method");
    }
    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demp of"+ "@DisabledOnOs")
    void secondTest(){
        System.out.println("this is the second test method");
    }
    @Test
    @DisabledIfSystemProperty(named = "env", matches = "staging", disabledReason = "disabled for demo of" + "@DisabledIfSystemProperty")
    void thirdTest(){
        System.out.println("this is the third test method");
    }
    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled for demo of @DisabledIf")
    void fourthTest() {
        System.out.println("This is the fourth test method");
    }

    boolean provider() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.WEDNESDAY);
    }

    @Test
    void fifthTest(){
        System.out.println("this is the fifth test method");
    }


}
