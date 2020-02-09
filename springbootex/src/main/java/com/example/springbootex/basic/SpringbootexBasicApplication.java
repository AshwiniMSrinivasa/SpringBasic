package com.example.springbootex.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootexBasicApplication {
	
	public static void main(String[] args) {
		

		ApplicationContext applicationContext =  SpringApplication.run(SpringbootexBasicApplication.class, args);
		
		int a[] = new int[] {3,2,5};
		
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		int position = binarySearch.search(a, 2);
		System.out.println("The search string position is " + position);
		
	}

}
