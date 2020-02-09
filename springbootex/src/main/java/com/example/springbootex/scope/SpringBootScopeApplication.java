package com.example.springbootex.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootScopeApplication {
	
	public static void main(String[] args) {
		

		ApplicationContext applicationContext =  SpringApplication.run(SpringBootScopeApplication.class, args);
		
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		JDBCConnection jdbcConnection = personDao.getJdbcConnection();
		
		System.out.println(personDao);
		System.out.println(jdbcConnection);
		
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		JDBCConnection jdbcConnection2 = personDao2.getJdbcConnection();
		
		System.out.println(personDao2);
		System.out.println(jdbcConnection2);
		
	}

}
