package com.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5,7,4,3,2,1};
		InsertionSort bs = new InsertionSort();
		bs.sort(arr);
		System.out.println(Arrays.toString(arr) ); 

	}

	public void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int value = arr[i];
			int whole = i;
			while(whole > 0 && arr[whole -1] > value) {
				arr[whole] = arr[whole -1];
				whole--;
			}
			arr[whole] = value;
		}
	}
}
