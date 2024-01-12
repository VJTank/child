package org.example.child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AppChild
{

    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        SpringApplication.run(AppChild.class, args);
    }
}
