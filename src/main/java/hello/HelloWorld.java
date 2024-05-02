package hello;

import java.sql.Time;
import java.time.LocalTime;

public class HelloWorld {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println("Hora local: " + currentTime);


        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }


}
