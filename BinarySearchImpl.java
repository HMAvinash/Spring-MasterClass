package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl
{
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	

	public int binarysearch(int [] numbers,int numbertosearch)
	{ 
		
	
		int[] Sortednumbers=sortAlgorithm.sorting(new int[]{12,13,15});
		//System.out.println(sortAlgorithm);
		//logic to implement searching
		return 3;
	}

}
