Here are some of the coding questions I worked on, in the pursuit of learning different data structures and algorithms. 
This repository will contain codes written in different languages based on the problem statement.

=================================================================================================================


Problem 1: Rotate array clockwise by one position
Problem 2: Count Pairs with given sum in a array
Problem 3: Check if an array is a subset of other array

==================================================================================================================


Problem 1: Rearrange elements in array by sign alternatively in order.
Problem 2: Rearrange elements in array by sign, equal number of even and odd.
Problem 3: Stack using Array
Problem 4: Queue using Array

==================================================================================================================


Problem 1: Re arrange elements and Maximum the sum in the array 
Problem 2: Remove duplicate characters in a array
Problem 3: Merge two strings alternatively starting with string 1
Problem 4: Reverse vowels in String

==================================================================================================================


Problem 1: Kids With Maximum Candies
Problem 2: Can Place Flowers alternatively

==================================================================================================================

Problem 1: Is string 1 subsequence of string 2(isSubsequence)
Problem 2: Reverse words in a string

==================================================================================================================

MISSING OR DUPLICATE NUMBER IN ARRAY PATTERN

| Problem                                 | Key Constraints                                                                     | Pattern Name / Technique                      | How It Works                                                                                                                | Notes                                               |
| --------------------------------------- | ----------------------------------------------------------------------------------- | --------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| **Set Mismatch**                        | Numbers 1…n, one duplicate, one missing; O(1) space; can modify array               | **Negative Marking / Index as Hash**          | Mark seen numbers by negating value at index `num-1`. Duplicate detected if already negative; missing = index with positive | Array is modified                                   |
| **Find All Disappeared Numbers**        | Numbers 1…n, possibly missing numbers; O(1) space; can modify array                 | **Negative Marking / Index as Hash**          | Negate values at indices for presence. Scan for positives → missing numbers                                                 | Works for multiple missing                          |
| **Find the Duplicate Number (LC 287)**  | Numbers 1…n, array size n+1, exactly one duplicate; cannot modify array; O(1) space | **Floyd’s Tortoise & Hare / Cycle Detection** | Treat nums as pointers → detect cycle → start of cycle = duplicate                                                          | Works even if duplicate occurs multiple times       |
| **First Missing Positive (LC 41)**      | Unsorted array, positive integers; O(1) space; can modify array                     | **Cyclic Sort / Index-as-Hash**               | Place number `x` at index `x-1` if in range 1..n. Scan for first mismatch → missing positive                                | Handles negatives, numbers > n                      |
| **Find Duplicate Number (XOR version)** | Numbers 1…n, exactly one duplicate appearing twice; cannot modify array; O(1) space | **XOR Trick**                                 | XOR all array elements with numbers 1..n → duplicate remains                                                                | Only works for exactly one duplicate, appears twice |



