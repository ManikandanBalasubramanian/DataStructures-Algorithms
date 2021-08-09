# DataStructures 
A Data structure is a way to store the data for a specific task. Changing the data structure does not change the correctness of the program but  the new implementation of the data type realizes different tradeoffs in the time to execute various operations, so the total performance can improve dramatically.
Data structures can be neatly classiﬁed as either contiguous or linked, depending upon whether they are based on arrays or pointers:
- **Contiguously-allocated structures** are composed of single slabs of memory, and
include arrays, matrices, heaps, and hash tables.
- **Linked data structures** are composed of distinct chunks of memory bound
together by pointers, and include lists, trees, and graph adjacency lists.

# Algorithm
An algorithm is a procedure to accomplish a speciﬁc task. An algorithm is the idea behind any reasonable computer program. 
In the words of someone
> A super computer cannot solve your problem but a good algorithm can.
Algorithm design form one of the core practical technologies of computer science. Designing correct, eﬃcient, and implementable algorithms for real-world problems requires access to two distinct bodies of knowledge:
- **Techniques** – Good algorithm designers understand several fundamental algorithm design techniques, including data structures, dynamic programming, depth-ﬁrst search, backtracking, and heuristics. Perhaps the single most important design technique is modeling, the art of abstracting a messy real-world application into a clean problem suitable for algorithmic attack.
- **Resources** – Good algorithm designers stand on the shoulders of giants. Rather than laboring from scratch to produce a new algorithm for every task, they can ﬁgure out what is known about a particular problem. Rather than re-implementing popular algorithms from scratch, they seek existing implementations to serve as a starting point.

## Developing an usable algorithm
- Model the problem
- Find an algorithm to solve it
- Fast enough? Fits in memory?
- If not, figure out why.
- Find a way to address the problem
- Iterate until satisfied.


## Analysis of Algorithm
- Observations
- Mathematical Models
- Order of growth classification
- theory of algo
- memory usage

## Why analyze algorithms?
- Predict performance
- Compare algo
- Provide guarantee
- Understand theoretical basis
- Avoid performance bugs