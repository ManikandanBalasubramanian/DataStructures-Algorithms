package com.datastructures.adt;

import java.util.Arrays;

public class Heap {

  private int capacity = 10;
  public int size = 0;
  public int[] items = new int[capacity];

  protected int getLeftChildIndex(int parentIndex) {
    return 2 * parentIndex + 1;
  }

  protected int getRightChildIndex(int parentIndex) {
    return 2 * parentIndex + 2;
  }

  protected int getParentIndex(int childIndex) {
    return (childIndex - 1) / 2;
  }

  protected boolean hasLeftChild(int parentIndex) {
    return getLeftChildIndex(parentIndex) < size;
  }

  protected boolean hasRightChild(int parentIndex) {
    return getRightChildIndex(parentIndex) < size;
  }

  protected boolean hasParent(int childIndex) {
    return getParentIndex(childIndex) >= 0;
  }

  protected int leftChild(int index) {
    return items[getLeftChildIndex(index)];
  }

  protected int rightChild(int index) {
    return items[getRightChildIndex(index)];
  }

  protected int parent(int index) {
    return items[getParentIndex(index)];
  }

  protected void swap(int index1, int index2) {
    int temp = items[index1];
    items[index1] = items[index2];
    items[index2] = temp;
  }

  protected void ensureCapacity() {
    if (size == capacity) {
      capacity *= 2;
      items = Arrays.copyOf(items, capacity);
    }
  }

  public int peek() {
    if (size == 0) throw new IllegalStateException();
    return items[0];
  }

  public void print() {
    int height = 0;
    for (int i = 0; i < size; i++) {
      if (i >= 2 * height) {
        height = i + 1;
      }
    }
  }
}
