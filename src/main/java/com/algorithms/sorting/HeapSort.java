package com.algorithms.sorting;

import com.datastructures.adt.MaxHeap;
import com.datastructures.adt.MinHeap;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {5,7,4,3,2,1,10,8,21,45};
		HeapSort hs = new HeapSort();
		hs.minSort(arr);
		hs.maxSort(arr);
	}

	private void maxSort(int[] arr) {

		MaxHeap hmax = new MaxHeap();
		for(int a : arr) {
			hmax.add(a);
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(hmax.poll() +" ");
		}
		System.out.println();
	}

	private void minSort(int[] arr) {
		MinHeap hmin = new MinHeap();
		for(int a : arr) {
			hmin.add(a);
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(hmin.poll() +" ");
		}
		System.out.println();
	}



}
