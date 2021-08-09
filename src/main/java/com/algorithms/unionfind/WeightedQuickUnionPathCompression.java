package com.algorithms.unionfind;

public class WeightedQuickUnionPathCompression {

private int[] id;
	private int[] size;

   /**
    * Initialize the id with its own id as root.
    */
	public WeightedQuickUnionPathCompression(int N) {
		id = new int[N];
		size = new int[N];
		
		for(int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	/**
	 * Find the root of i and also update the root one step up.
	 * This reduces the path from the root node.
	 * @param i
	 * @return root of i
	 */
	public int root(int i) {
		while(id[i] != i) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	/**
	 * Compare the root of p and q
	 * @param p
	 * @param q
	 * @return if p and q is connected.
	 */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	/**
	 * Check and update the root of the smaller tree/set to root of larger tree/set.
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
