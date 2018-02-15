package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDao 
{
	@Autowired
public JdbcConnection jdbcConnection;

public PersonDao(JdbcConnection jdbcConnection)
{
	
	this.jdbcConnection = jdbcConnection;
}

}
