package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EndlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndlabApplication.class, args);
		 System.out.println("Application Started Successfully! Available URLs:");
	        System.out.println("1. Greet: http://localhost:8080/SpringMVC/greet?username=Alice");
	        System.out.println("2. About: http://localhost:8080/SpringMVC/about");
	        System.out.println("3. Demo1 (Age and Country): http://localhost:8080/SpringMVC/demo1?age=30&country=USA");
	        System.out.println("4. Demo2 (Arithmetic Operations): http://localhost:8080/SpringMVC/demo2/400/200");
	        System.out.println("5. Product Form: http://localhost:8080/SpringMVC/productform");
	        System.out.println("6. Multiply Numbers: http://localhost:8080/SpringMVC/multiplyNumbers?num1=6&num2=7");
	        System.out.println("7. Reverse Strings: http://localhost:8080/SpringMVC/reverse?str1=Hello&str2=World");
	        System.out.println("8. Calculate (Addition and Subtraction): http://localhost:8080/SpringMVC/calculate?num1=20&num2=15");
	   }

}
