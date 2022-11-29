package trgy;

import exam2.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private FizzBuzz obj ;
    @BeforeEach
    void setup(){
        obj =  new FizzBuzz();
    }

    @Test
    public void controlOfDivideByThree(){
        Assertions.assertEquals("Fizz",obj.divideOrNotDivide(3));
    }
    @Test
    public void controlOfDivideByFive(){
        Assertions.assertEquals("Buzz",obj.divideOrNotDivide(5));
    }
    @Test
    public void controlOfDivideBothByFiveAndThree(){
        Assertions.assertEquals("FizzBuzz",obj.divideOrNotDivide(15));
    }
    @Test
    public void controlOfDivideNotBothByFiveAndThree(){
        Assertions.assertEquals("7",obj.divideOrNotDivide(7));
    }
    @Test
    public void whenNumberBiggerThan100AndSmallerThan1(){
        Assertions.assertThrows(IllegalArgumentException.class,()->obj.divideOrNotDivide(-1));
        Assertions.assertThrows(IllegalArgumentException.class,()->obj.divideOrNotDivide(101));
    }

}
