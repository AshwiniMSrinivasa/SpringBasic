package com.example.springbootex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootexApplication {
	
	public static void main(String[] args) {
		

		ApplicationContext applicationContext =  SpringApplication.run(SpringbootexApplication.class, args);
		
		int a[] = new int[] {3,2,5};
		
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		int position = binarySearch.search(a, 2);
		System.out.println("The search string position is " + position);
		
	}

}
