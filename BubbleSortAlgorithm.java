package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("bubble")
@Component
public class BubbleSortAlgorithm implements SortAlgorithm
{
	public int[] sorting(int [] numbers)
	{
		//logic to sort Algorithm
		return numbers;
	}

}
