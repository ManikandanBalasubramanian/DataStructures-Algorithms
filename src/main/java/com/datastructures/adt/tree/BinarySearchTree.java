package com.datastructures.adt.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree(int[] arr) {
		for(int a: arr) {
			add(a, root);
		}
	}

	public void add(int a, Node root) {

		if(root == null) {
			root = new Node(a);
			return;
		}

		if(a < root.getElement()) {
			add(a, root.left);
		} else {
			add(a, root.right);
		}
	}
	
	public void print() {
		
		
	}
}

class Node {
	private int element;
	Node left, right;

	public Node(int ele) {
		this.element = ele;
		left = right = null;
	}

	public int getElement() {
		return this.element;
	}
}
