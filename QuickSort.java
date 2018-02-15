package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class QuickSort implements SortAlgorithm
{
	public int[] sorting(int [] numbers)
	{
		//logic to sort Algorithm
		return numbers;
	}

}
