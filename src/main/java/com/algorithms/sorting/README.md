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

## Merge Sort
In Mergesort,  we do divide and conquer by splitting the array into two until the size of the array becomes 1.
Sort the left array and right array and merge them.

Splitting the array into two parts
```
id[] 2 8 5 3 9 4
     2 8 5      3 9 4
     2   8 5    3   9 4
     2  8  5    3  9  4
```

Merging the sorted parts
```
     2  8  5  3  9  4
     2  5 8  3  9  4
     2 5 8  3  9  4
     2 5 8  3  4 9
     2 5 8  3 4 9
     2 3 4 5 8 9
```

Merge sort creates duplicate array while merging and has space complexity of O(N) and Time complexity of O(NlogN).


## Quick Sort
In Quicksort,  we do divide and conquer by pivoting a element and elements to the left are smaller and to the right are larger.
This is a recursive algorithm from start to end.

```
id[] 2 8 5 3 9 4
     i         p 
     2 3 5 8 9 4
       i       p
     2 3 4 8 9 5
         i
```

At the end of the 1st sort stack, we will have the partitionIndex at 2. 
The process is repeated for start to i-1 and i+1 to end


```
id[] 2 3 4 8 9 5
       i

     2 3 5 8 9 4
     i         

     2 3 4 8 9 5
           i   p
     2 3 4 5 9 8
           i   

     2 3 4 5 9 8
             i p
     2 3 4 5 8 9 
             i

```

Quick sort creates random pivots to achieve average case time complexity. It has space complexity of O(N) and Average Case Time complexity of O(NlogN) and worst case of O(N2).


## Radix Sort
Radix sort is the linear sorting algorithm that is used for integers. In Radix sort, there is digit by digit sorting is performed that is started from the least significant digit to the most significant digit.

irst, we have to find the largest element (suppose max) from the given array. Suppose 'x' be the number of digits in max. The 'x' is calculated because we need to go through the significant places of all elements.
After that, go through one by one each significant place. Here, we have to use any stable sorting algorithm to sort the digits of each significant place.

The average and worst case time complexity of Radix sort is θ(nk). The space complexity of Radix sort is O(n + k).


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
