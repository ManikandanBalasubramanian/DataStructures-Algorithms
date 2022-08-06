package com.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {



	public static void main(String[] args) {
		int arr[] = {5,7,4,3,2,1,6};
		MergeSort bs = new MergeSort();
		bs.sort(arr);
		System.out.println(Arrays.toString(arr) ); 
	}

	public void sort(int[] arr) {
		int n = arr.length;
		int mid = n/2;
		if(mid < 1) return;
		int lArr [] = new int[mid];
		int rArr [] = new int[n - mid];
		lArr = Arrays.copyOf(arr, mid);
		rArr = Arrays.copyOfRange(arr, mid, n);
		sort(lArr);
		sort(rArr);
		merge(arr, lArr, rArr);
	}

	public void merge(int[] arr, int[] lArr, int[] rArr) {
		int i = 0, j = 0, k = 0;
		int r = rArr.length;
		int l = lArr.length;

		while(i < r && j < l) {
			if(lArr[j] <= rArr[i]) {
				arr[k++] = lArr[j++];
			} else {
				arr[k++] = rArr[i++];
			}
		}
		while(i < r) {
			arr[k++] = rArr[i++];
		}

		while(j < l) {
			arr[k++] = lArr[j++];
		}
	}

}
