package com.datastructures.adt;

public class MinHeap extends Heap {

	public int poll() {
		int item = peek();
		items[0] = items[size-1];
		size--;
		heapifyUp();
		return item;

	}

	public void add(int item) {
		ensureCapacity();
		items[size++] = item;
		heapifyDown();

	}

	private void heapifyDown() {
		int index = size -1;
		while(hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private void heapifyUp() {
		int index = 0;

		while( hasLeftChild(index)) {
			int smallerChildIndex =  getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}

			if(items[smallerChildIndex] < items[index]) {
				swap(smallerChildIndex, index);
				index = smallerChildIndex;
			} else {
				break;
			}
		}
	}

}
