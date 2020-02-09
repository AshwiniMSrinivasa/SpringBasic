package com.example.springbootex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class BinarySearch {
	
	public BinarySearch() {
		super();
	}

	@Autowired
	Sort sort;
	
	public int search(int a[], int i)
	{
		
		int b[] = sort.sort(a);
		
		//search for i in the array b
		
		return 2;
	}

}
