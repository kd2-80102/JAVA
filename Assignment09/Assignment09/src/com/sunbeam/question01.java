package com.sunbeam;

import java.util.*;

public class question01 {
	
	public static <T extends Number> T findMin(T[] arr) {
		T minValue = arr[0];
	    for(int i=1; i<arr.length; i++) 
	    { 
	    	if(minValue.doubleValue() > arr[i].doubleValue()) {
	    		minValue = arr[i];
	    	}
	    }

		return minValue;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		
		System.out.println("Minimum value in arr1: " + min1);
		System.out.println("Minimum value in arr2: " + min2);


	}

}
