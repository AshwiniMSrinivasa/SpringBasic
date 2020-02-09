package com.example.springbootex.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements Sort {
	
	BubbleSort()
	{
		super();
	}
	
	public int[] sort(int a[])
	{
		//sort the array and return it
		System.out.println("From BubbleSort");
		return a;
	}

}
