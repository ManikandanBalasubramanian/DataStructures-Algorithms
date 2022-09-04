# Sorting
The goal is to design an efficient data structure/algorithm for sorting problem

Given a set of N numbers
Sort command sorts the numbers in increasing order.

## Bubble Sort
In Bubblesort, we compare consecutive numbers and swap them. Highest number will end up in the right at each iteration.

```
id[] 2 8 5 3 9 4 1
     2 8 5 3 9 4 1
     2 5 8 3 9 4 1
     2 5 3 8 9 4 1
     2 5 3 8 9 4 1
     2 5 3 8 4 9 1
     2 5 3 8 4 1 9
```
By comparing the consecutive elements 9, being the highest in the given set ended up in the right.

```
id[] 2 5 3 8 4 1 9
     2 3 5 8 4 1 9
     2 3 5 4 8 1 9
     2 3 5 4 1 8 9
          .
          .
          .
     1 2 3 4 5 8 9
```

Sorting using Bubble sort is too expensive.
Bubble Sort has space complexity of O(1) and Time complexity of O(N2).


## Heap Sort
In Heap sort, we create max/min heap and remove the largest item and place it in a sorted partition.

```
id[] 2 8 5 3 9 4 1
```
We will begin by representing array as tree

```
Tree representation
        2
     8     5
    3 9   1

```
Build Max heap and swap the largest element with last item ie., swap (9, 1)
```
id[] 9 8 5 3 2 1

        9
     8     5
    3 2   1

id[] 1 8 5 3 2 *9*

        1
     8     5
    3 2
```
Lets heapify the unpartitioned region.
```
id[] 8 3 5 3 1 2 *9* 

        8
     3     5
    1 2   

id[] 2 3 5 1 *8 9*

        2
     3     5
    1 
```

Sorting using Heap sort is efficient.
Heap Sort has space complexity of O(1) and Time complexity of O(NlogN).

## Insertion Sort
In Insertionsort,  we start from left to right. Examine each element and compare it to elements on its left.
Insert the element in the correct position in the array.

```
id[] 2 8 5 3 9 4
     2 8 5 3 9 4
     2 5 8 3 9 4
     2 5 3 8 9 4
     2 3 5 8 9 4
     2 3 5 8 4 9
     2 3 5 4 8 9
     2 3 4 5 8 9
```
Insertion sort is the staright forward sorting algorithm.
Sorting using Insertion sort is too expensive.
Insertion Sort has space complexity of O(1) and Time complexity of O(N2).


## Selection Sort
In Selection sort, we star one number with all other numbers and swap them. Lowest number will end up in the left at each iteration.

```
id[] 2 8 5 3 9 4 1
     1 8 5 3 9 4 2
```
By comparing with all the elements 2 got swapped with 1, being the smalled in the given set ended up in the left.

```
id[] 1 8 5 3 9 4 2
     1 2 8 5 9 4 3
     1 2 3 8 9 5 4
     1 2 3 4 9 8 5
          .
          .
          .
     1 2 3 4 5 8 9
```
Sorting using Selection sort is too expensive.
Selection Sort has space complexity of O(1) and Time complexity of O(N2).
