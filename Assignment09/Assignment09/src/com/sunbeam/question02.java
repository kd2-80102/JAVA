package com.sunbeam;

import java.util.*;


public class question02 {

	public static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Double[] arr = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		
		System.out.println("Before Sort: ");
		for (Double e : arr)
			System.out.println(e);
		
		class DDComparator implements Comparator<Double> {
			@Override
			public int compare(Double e1, Double e2) {
				return Double.compare(e1, e2);
			}
		}
		
		DDComparator d1 = new DDComparator();
		
		
		selectionSort(arr,d1);
		
		System.out.println("After Sort: ");
		
		for (Double e : arr)
			System.out.println(e);

		

	}

}
