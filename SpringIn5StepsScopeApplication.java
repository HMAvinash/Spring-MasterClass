package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDao;

@SpringBootApplication
public class SpringIn5StepsScopeApplication
{private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class); 

	public static void main(String[] args)
	{
		ApplicationContext applicationcontext=SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDao personDao=applicationcontext.getBean(PersonDao.class);
		PersonDao personDao1=applicationcontext.getBean(PersonDao.class);
		
		JdbcConnection jc=personDao.jdbcConnection;
		JdbcConnection jc1=personDao.jdbcConnection;
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",jc);
		LOGGER.info("{}",jc1);
//output;-Different PersonDao and JDBC Connection with scope as prototype for both  
//com.in28minutes.spring.basics.springin5steps.scope.PersonDao@5d99c6b5
//com.in28minutes.spring.basics.springin5steps.scope.PersonDao@266374ef
//com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@13b3d178
//com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@24c4ddae

//output;-same PersonDao and JDBC Connection with scope as prototype for  JDBC Connection and singleton for PersonDao		
//com.in28minutes.spring.basics.springin5steps.scope.PersonDao@11d8ae8b
//com.in28minutes.spring.basics.springin5steps.scope.PersonDao@11d8ae8b
//com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@479cbee5
//com.in28minutes.spring.basics.springin5steps.scope.JdbcConnection@479cbee5
	
//System.out.println(jdbcConnection3);
}


}
