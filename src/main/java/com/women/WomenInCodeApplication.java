package com.women;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages= {("com.women")})
public class WomenInCodeApplication {
  public static void main(String[] args) {
	  SpringApplication.run(WomenInCodeApplication.class, args); 
  }
}
