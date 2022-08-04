package com.algorithms.searching.unionfind;

public class QuickFind {

  private int[] id;

 /**
  * Initialize the id with its own id as root.
  */
  public QuickFind(int N) {
  	id = new int[N];
  	for(int i = 0; i < N; i++) {
      id[i] = i;
  	}
  }

  /**
   * Check if both the nodes have a common root.
   */
  public boolean connected(int p, int q) {
  	return id[p] == id[q];
  }

  /**
   * Connect the two nodes/set of nodes.
   * All the nodes in the p's set has to be updated to q's root.
   */
  public void union(int p, int q) {
  	int pid = id[p];
  	int qid = id[q];
  	for(int i = 0; i < id.length; i++) {
  		if(id[i] == pid) {
  			id[i] = qid;
  		}
  	}
  }

}
