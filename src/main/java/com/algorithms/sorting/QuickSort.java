package com.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
	
	
	public static void main(String[] args) {
		int arr[] = {5,7,4,3,2,1,6};
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr) ); 

  }
	
	public int partition(int[] arr, int start, int end) {
		int pIndex = start;
		int pivot = end;
		for(int i = start; i < end; i++ ) {
			if(arr[i] <= arr[pivot] ) {
				int temp = arr[pIndex];
				arr[pIndex++] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[pIndex];
		arr[pIndex] = arr[pivot];
		arr[pivot] = temp;
		return pIndex;
	}
	
	public void sort(int arr[], int start, int end) {
		if(start < end) {
			int pIndex = partition(arr, start, end);
			sort(arr, start, pIndex-1);
			sort(arr, pIndex+1, end);
		}
	}
}
