## Compilation & Execution Instructions
This package contains week two all general tasks implementation Those tasks are as follows:
### Task1: FizzBuzz
 The FizzBuzz class can print 1 to 100. If number can be divided by 3, print "Fizz"
 If divide by 5, print "Buzz" instead of the number, If both condition holds, print "FizzBuzz" instead of the number.
 ```
 sample output: 
        1 2 Fizz 4 Buzz ...13 14 Buzz 
 ```
##### To Compile :  
``` javac FizzBuzz.java ```
##### To Run :
``` java FizzBuzz ```
##### Output :
```
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz 
```
### Task2: Collatz Sequence
   The CollatzSequence class can accept command line argument and should produce collatz sequence starting from 
   ```  a_0 = N (N<100)until a_n = 1.
 		an = { (1/2)an-1 for an-1 even
		     { 3an-1+1 for odd
    ```
```
Sample output:
		> java Collatz 3
		3 10 5 16 8 4 2 1
	 	> java Collatz 5
		5 16 8 4 2 1
	    > java Collatz 7
		7 22 11 34 52 26 13 40 20 10 5 16 8 4 2 1 
```
##### To Compile :  
``` javac Collatz.java ```
##### To Run :
``` java FizzBuzz 5 ```
##### Output :
```
5 16 8 4 2 1 
```
### Task3: Temperature
  The CelsiusFahrenheit class can accept only two command line arguments if we pass more than two will raise an exception.If parameter is 0 then can convert the second parameter from celsius to fahrenheit, otherwise it can reverse the conversion.   The way to do the first conversion is the following:
```
C = (F-32) * 5 / 9
# first parameter should be int.
# second parameter should be float.
```
##### To Compile :  
``` javac CelsiusFahrenheit.java ```
##### To Run :
``` java CelsiusFahrenheit 0 31 ```
##### Output :
``` 
87.8 
```
### Task4: Perfect Number
The Perfect Number class can check given number is perfect number or not.	(a positive integer that is equal to the sum of its proper positive divisors, 1 included, the number is excluded.)  
The four smallest such integers are 6, 28, 496, 8128.
##### To Compile :  
``` javac PerfectNumber.java```
##### To Run :
``` java PerfectNumber 496 ```
##### Output :
```
496 is perfect number 
```