package trgy;

import exam1.HelloWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HelloWorldTest {
     @Test
     public void sayHelloToWorld(){
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertEquals("Hello World",helloWorld.sayHello(),"not expected message");





    }


}
