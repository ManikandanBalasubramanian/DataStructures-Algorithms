package com.algorithms.unionfind;

public class QuickUnion {

	private int[] id;

   /**
    * Initialize the id with its own id as root.
    */
	public QuickUnion(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	/**
	 * To find the root of the id.
	 */
	public int root(int i) {
		while(id[i] != i) {
			i = id[i];
		}
		return i;
	}

	/**
	 * Check if the roots of the p,q are same
	 */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	/**
	 * Update the root of p node with root of q.
	 */
	public void union(int p, int q) {
		int qroot = root(q);
		int proot = root(p);
		id[proot] = qroot;
	}

}
