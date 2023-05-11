#### Basic exercises on arrays

- Exercise 1: Create a method which accepts an integer array, reverse the numbers in the array and  returns the resulting array in sorted order 

##### Hints


arr = [201, 654, 23, 765]

output = [32, 102, 456, 567]

```java

int reverse(int num){
	...
}

int[] reverseArray(int[] arr){
 	int []output = new int[arr.length];
	
	...
	return output;

}


int[] sort(int[] arr){
	...
}

```

- Exercise 2: Create a class containing a method to create the mirror image of a String. The method should  return the two Strings separated with a pipe(|) symbol . 

- <b>Output - Hello | olleH</b>
- Exercise 3: Create a method which accepts an integer array and removes all the duplicates in the array.  Return the resulting array in descending order 



#### HackerRank Exercises

https://www.hackerrank.com/domains/java


#### Stackroute :

- https://stackbooks-ust.stackroute.in/course/Programming-using-Core-Java/20a-session

- https://stackbooks-ust.stackroute.in/course/Programming-using-Core-Java/21a-session

- https://stackbooks-ust.stackroute.in/course/Programming-using-Core-Java/22a-session

- https://stackbooks-ust.stackroute.in/course/Programming-using-Core-Java/arrays-exercise


## Practice Statement - Palindrome 

**Palindrome is a word, sentence or a number that reads the same even after its order is reversed. Harrah is one such palindrome town in Oklahoma, United States. For administrative purposes, a list of all palindrome towns and cities is being prepared.**
**Write a Java program that states whether the name of a place is a palindrome or not. Print the words and display their total count.**

**Sample Input**

    String words []= {"Hannah", "Texas", "Renner", "Eleele" }

**Expected Output**

    Hannah is a palindrome
    Renner is a palindrome

    Total number of palindromes: 2


### Write Java Code for the following design(Class Diagram)
----------------------------------

![image](https://online.visual-paradigm.com/repository/images/bbe479b2-ff43-49ea-93e1-6920690be2a5/class-diagram-design/atm-system-class-diagrams.png)


## Problems on arrays



#### Problem 1: 
Given an array of integers, find the two elements that sum up to a given target value. Store all of them in a map and display.

#### Problem 2: 
Write a Java program that accepts two arrays of integers as input and returns a new array that contains the elements that are common to both input arrays.




#### Problem 3:
```text
Write a Java program that accepts two arrays of integers as input: one array contains positive integers and the other array contains negative integers. The program should then find the pair of integers (one positive and one negative) that have the smallest absolute difference. If multiple pairs have the same smallest absolute difference, the program should return all of them.

Here's an example input and output for the program:

Input:
Positive Array: [2, 7, 10, 13, 18]
Negative Array: [-5, -2, -1, -9, -13]
Output:
Pairs with smallest absolute difference: (2, -1), (7, -5), (10, -9), (13, -13)

Explanation: The absolute difference between (2, -1) is 3, between (7, -5) is 12, between (10, -9) is 1, and between (13, -13) is 0. The pair with the smallest absolute difference is (10, -9), but there are multiple pairs with the same smallest absolute difference, so the program should return all of them.

```

#### Problem 4:
```text
Write a Java program that accepts two arrays of integers as input, arr1 and arr2, and returns a new array that contains only the elements that appear in both arr1 and arr2, with no duplicates. The resulting array should be sorted in ascending order.

Here's an example input and output for the program:

Input:
arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
arr2 = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

Output:
[2, 4, 6, 8, 10]

Explanation: The common elements between arr1 and arr2 are 2, 4, 6, 8, and 10. The resulting array contains these elements, sorted in ascending order.

To solve this problem, you can iterate through one of the arrays and check if each element is present in the other array using the contains() method. If the element is present in both arrays and not already in the resulting array, add it to the result. Finally, sort the resulting array using a sorting algorithm such as bubble sort or selection sort.

```


#### Problem 5:

```text
Write a Java program that accepts two arrays of integers as input, arr1 and arr2, where arr1 represents the scores of students in a class and arr2 represents the cutoff scores for different grades (e.g., A, B, C, D). The program should then output the number of students who received each grade.

Here's an example input and output for the program:

Input:
arr1 = [85, 72, 91, 60, 78, 95, 80, 68, 82, 87]
arr2 = [90, 80, 70, 60]
Output:
A: 2
B: 4
C: 3
D: 1

Explanation: The cutoff scores for each grade are 90 for A, 80 for B, 70 for C, and 60 for D. The number of students who received each grade are as follows:

A: 2 students (85 and 91)
B: 4 students (72, 78, 80, and 82)
C: 3 students (60, 68, and 87)
D: 1 student (95)


```
