# Union Find
The goal is to design an efficient data structure/algorithm for dynamic connectivity problem

Given a set of N objects
Union command connect two objects
Find/connected query checks is there a path connecting the two objects.

We assume connection is an equivalence relation ie
Reflexive: p is connected to p.
Symmetric: if p is connected to q, then q is connected to p.
Transitive: if p is connected to q and q is connected to r, then p and r are connected.

Inorder to model an algorithm for this Dynamic connectivity problem we will maintain the connected components ie., a set of objects that are mutually connected.

## Quick Find

Say we have a set of 0-9 objects, we use an array to store the objects.
union(3,4) -> connects 3 and 4 by updating all the ids with 3 to 4.
```
id[] 0 1 2 3 4 5 6 7 8 9
     0 1 2 4 4 5 6 7 8 9
```
union(4,8) -> connects 4 and 8 by updating all the ids with 4 to 8.
```
id[] 0 1 2 3 4 5 6 7 8 9
     0 1 2 8 8 5 6 7 8 9
```
To find if two objects are connected, we just need to compare the id of the objects.

In QF algorithm Union operation is too expensive.
Find is O(1) and Union is O(N2).

## Quick Union

Say we have a set of 0-9 objects, we use an array to store the objects.
union(3,4) -> connects 3 and 4 by updating the root of 3 to with root of 4.
```
id[] 0 1 2 3 4 5 6 7 8 9
     0 1 2 4 4 5 6 7 8 9
```
union(4,8) -> connects 4 and 8 by updating the root of 4 to with root of 8.
```
id[] 0 1 2 3 4 5 6 7 8 9
     0 1 2 4 8 5 6 7 8 9
```
To find if two objects are connected, we just need to compare the root of the objects.

In QU algorithm union is better than QF, but find becomes expensive.
Find is O(N) and Union is O(N).


## Weighted Quick Union

Say we have a set of 0-9 objects, we use an array to store the objects.
union(3,4) -> connects 3 and 4 by updating the root of 3 to with root of 4.
```
id[] 0 1 2 3 4 5 6 7 8 9
     0 1 2 4 4 5 6 7 8 9
```	
union(4,8) -> connects 4 and 8 by updating the root of smaller tree 8 with root of larger tree 4.
```
id[] 0 1 2 3 4 5 6 7 8 9
     0 1 2 4 4 5 6 7 4 9
```
To find if two objects are connected, we just need to compare the root of the objects.

In WQU algorithm find is better than QU, but find is proportional to depth of tree.
Find is O(lg N) and Union is O(lg N).

## Weighted Quick Union Path Compression
	
WQUPC is same as WQU, here the depth of the tree is kept minimum by compressing the path during root find operation.

In WQUPC algorithm find and union is better than WQU.
Find is O(ln N) and Union is O(ln N).