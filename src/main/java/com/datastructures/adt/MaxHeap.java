package com.datastructures.adt;

public class MaxHeap extends Heap {

  public MaxHeap() {
    super();
  }

  public int poll() {
    int item = peek();
    items[0] = items[size - 1];
    size--;
    heapifyUp();
    return item;
  }

  public void add(int item) {
    ensureCapacity();
    items[size++] = item;
    heapifyDown();
  }

  private void heapifyUp() {
    int index = 0;
    while (hasLeftChild(index)) {
      int largerChildIndex = getLeftChildIndex(index);
      if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
        largerChildIndex = getRightChildIndex(index);
      }

      if (items[largerChildIndex] > items[index]) {
        swap(largerChildIndex, index);
        index = largerChildIndex;
      } else {
        break;
      }
    }
  }

  private void heapifyDown() {
    int index = size - 1;
    while (hasParent(index) && parent(index) < items[index]) {
      swap(index, getParentIndex(index));
      index = getParentIndex(index);
    }
  }
}
