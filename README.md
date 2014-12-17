
===========

Interview problem: Write a function that takes an array of integers and returns that array rotated by N positions.
For example, if N=2, given the input array [1, 2, 3, 4, 5, 6] the function should return [5, 6, 1, 2, 3, 4]

Solutions:
  
1. Solution with recursion. 
   Advantages: Inplace, no extra memory; O(n) = n; 
   Disadvantage: Mutates data;

2: Creates a brand new array. 
  Advantages: Imutable data.
  Disadvantage: Extra space.

For build you need maven :

$ mvn clean install

$ cd target

$ java -jar rotatearray-1.0-SNAPSHOT.jar ..\src\test\resoruces\test1.txt
