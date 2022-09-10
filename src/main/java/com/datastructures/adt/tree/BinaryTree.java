package com.datastructures.adt.tree;

import java.util.Arrays;

public class BinaryTree {

	private int capacity = 10;
	public int size = 0;
	public int[] items;

	protected int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1 ;}
	protected int getRightChildIndex(int parentIndex) { return 2 * parentIndex + 2;}
	protected int getParentIndex(int childIndex) { return (childIndex - 1)/2;}

	protected boolean hasLeftChild(int parentIndex) { return getLeftChildIndex(parentIndex) < size;}
	protected boolean hasRightChild(int parentIndex) { return getRightChildIndex(parentIndex) < size;}
	protected boolean hasParent(int childIndex) { return getParentIndex(childIndex) >= 0;}

	protected int leftChild(int index) {return items[getLeftChildIndex(index)];}
	protected int rightChild(int index) {return items[getRightChildIndex(index)];}
	protected int parent(int index) {return items[getParentIndex(index)];}
	
	public BinaryTree(int[] arr) {
		items = arr;
		size = arr.length;
		capacity = size;
	}
	
	protected void ensureCapacity() {
		if(size == capacity) {
			capacity *= 2;
			items = Arrays.copyOf(items, capacity);
		}
	}	

	public void print() {
		int height = 0;
		for(int i = 0 ; i < size; i++) {
			System.out.print(items[i] + " "); 
			if(i >= 2*height) {
				height = i+1;
				System.out.println(); 
			}
		}
		System.out.println("\n------------------\n"); 
	}
}
