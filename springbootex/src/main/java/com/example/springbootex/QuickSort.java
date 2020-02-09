package com.example.springbootex;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class QuickSort implements Sort{
	
	public int[] sort(int[] a)
	{
		//sort the array using quicksort algo
		System.out.println("From QuickSort");
		return a;
		
	}

}
