Ariel University, School of Computer Science
Introduction to Computer Science, 2026A 

Ex0 - Foundation of problem-solving
Abstract:
In this first assignment, we will start a discussion on a few fundamental problems of computer science, particularly a variant of the Goldbach Conjecture. The main task in this assignment is to define a detailed algorithm (using free text and pseudocode) for efficiently testing the following version of the Goldbach Conjecture. Given a natural (even) number n, you are required to design the following functions: the design should be 100% correct and as efficient as possible.

Done! Class solution can be found here:
https://github.com/benmoshe/Intro2CS_ArielU_2026A/tree/main/src/assignments/Ex0/sol


isPrime(n) → boolean: return true if and only if n is a prime number. 
getPrimePair(s, n) → integer: given a positive integer s and an even positive number n, find the smallest prime number (p1>=s) such that p2 = p1+n is also a prime number.
getClosestPrimePair(s,n) → integer: given a positive integer s and an even positive number n, find the smallest prime number (p3) such that: 
p3 >= s
p4 = p3 + n is a prime number.
There are no prime numbers in the range of [p3+1, p4-1]. 
getMthClosestPrimePair(m, n) → integer: given a non-negative integer m and an even positive number n, find the prime number (p5) such that 
p6 = p5 + n is a prime number.
 There are no prime numbers in the range of [p5+1, p6-1].
There are exactly m ranges of closestPrimePairs before (below) p5.

To Do:
	This assignment is divided into 3 main parts - solve them in order!

Part 1 (start in class 1):
Understand the problem and read the related work.
Test the following “toy example”, 
Example 1: 
Enter a natural even number in range of [2,100] : 2
a) First prime pair of range = 2 : [3, 5]
b) Prime pair above 1024 with range of 2  : [1031, 1033]
c) The Prime closest pair of range 2 : [3, 5]
d) The 5'th closest prime pair of range 2 : [41, 43]
e) The program runtime is: 0.014 seconds
Run the given solution Ex0 (very slow) solution, by opening a terminal and running the following command: java -jar Ex0_sol.jar-out.jar (you may also run the .jar file from your IDE).
 java -jar Ex0_sol.jar-out.jar                         
Enter a natural even number in range of [2,100] : 8
a) First prime pair of range = 8 : [3, 11]
b) Prime pair above 1099511627776 with range of 8  : [1099511628323, 1099511628331]
c) The Prime closest pair of range 8 : [89, 97]
d) The 32'th closest prime pair of range 8 : [2531, 2539]
e) The program runtime is: 2.993 seconds

Part 2 (start after class 1):
Open a Java project with all 3 .java files of Ex0, you should only edit Ex0.java.
Write in your own words the required functionality for each of the four functions  - your writing should be in English - in the documentation of  Ex0.java.
Write a related pseudo-code for all the requirements four functions (you are mostly welcome to use the isPrime example below - but improve it). Your documentation should be above each related function (in Ex0.java).

Part 3 (start in class 2):
Implement your code (once you complete part 2).
Test your solution against the suggested JUnit Test class.
Test your runtime solution on input 98 and report your results in this Form. You can see the reported results here.
Notes:
The IsPrime pseudo-code that is given to you below can be improved significantly!!
The Ex0 jar file (given to you) is running in “slow motion” - make sure your solution runs faster than it.
In case n is not an even integer >= 2, the program should print an error and exit. You may assume that n <= 100
You can discuss this assignment with anyone in class, but when writing the solution, do it yourself! Please go over this document, which covers the School’s honesty policy.  
The suggested algorithm should be as efficient as possible. But make sure it is 100% correct!
Write your pseudocode as simply as possible - based on simple commands of “if”, “while”, ”variables”, and “return” (see example below). 
The key to a good implementation (and design) is a proper division into logical functions.
Submission guidelines: Your solution should be written as a single Java file named Ex0.java. Make sure you write your ID at the top of the page. English submissions are required. Your solution should be submitted to Moodle according to the instructions, as presented to you in the TA sessions (Deadline TBD@23:59).


Example for a relatively efficient implementation of Ex0 (run on MAC M4, java 25):
Enter a natural even number in range of [2,100] : 100
a) First prime pair of range = 100 : [3, 103]
b) Prime pair above 1099511627776 with range of 100  : [1099511627791, 1099511627891]
c) The Prime closest pair of range 100 : [396733, 396833]
d) The 32'th closest prime pair of range 100 : [9413533, 9413633]
e) The program runtime is: 0.333 seconds


