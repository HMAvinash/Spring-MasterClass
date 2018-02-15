package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@ComponentScan
public class SpringIn5StepsApplication 
{
	public static void main(String[] args) 
	{
		//BinarySearchImpl binarysearch=new  BinarySearchImpl(new QuickSort());
		
	ApplicationContext applicationcontext=SpringApplication.run(SpringIn5StepsApplication.class, args);
	BinarySearchImpl bsearch=applicationcontext.getBean(BinarySearchImpl.class);
	BinarySearchImpl bsearch1=applicationcontext.getBean(BinarySearchImpl.class);
	
	System.out.println(bsearch);

	System.out.println(bsearch1);
	int result=bsearch.binarysearch(new int[] {1,5,3,2} ,3);
	System.out.println(result);
	}

}
