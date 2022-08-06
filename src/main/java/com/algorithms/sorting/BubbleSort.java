package com.algorithms.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,7,4,3,2,1};
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
	}

	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++ ) {
			int flag = 0;
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) break;
		}
	}
}
