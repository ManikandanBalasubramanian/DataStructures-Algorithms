package com.algorithms.searching.unionfind;

public class WeightedQuickUnion {


	private int[] id;
	private int[] size;

	/**
	 * Initialize the id with its own id as root.
	 */
	public WeightedQuickUnion(int N) {
		id = new int[N];
		size = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	
	/**
	 * Find the root of the id.
	 * @param i
	 * @return root of i
	 */
	public int root(int i) {
		while(id[i] != i) {
			i = id[i];
		}
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	/**
	 * Update the root of the smaller set/tree to the root of larger tree/set.
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);

		if(proot == qroot) return;

		if(size[proot] > size[qroot]) {
			id[qroot] = proot;
			size[proot] += size[qroot];
		} else {
			id[proot] = qroot;
			size[qroot] += size[proot];
		}
	}


}
