## Compilation & Execution Instructions
This package contains week two all general tasks implementation Those tasks are as follows:
### Task1: Calculate Sum and Average of an Array
Write a function which evaluates the sum and avg of an array.

##### To Compile :  
``` javac SumAvgArrays.java ```
##### To Run :
``` java SumAvgArrays ```
##### Output :
```
Enter size of an array
5
Enter integer values for an array
1
2
3
4
5
Array Sum is:15
Average is:3.0
```
### Task2: Sum and Average of an Array.
Write a function which joins the elements of an array into one string. The separator character
must be optional, e.g.
```
Sample output:
	int[] arr = {1, 2, 3};
	System.out.println(join(arr)); // 1, 2, 3
	System.out.println(join(arr, ';')); // 1; 2; 3
```
##### To Compile :  
``` javac JoinArrayElements.java ```
##### To Run :
``` java JoinArrayElements ```
##### Output :
```
Enter size of an array.
5
Enter array values.
1
2
3
4
5
1, 2, 3, 4, 5
1; 2; 3; 4; 5
```
### Task3: Print Two Dimensional Array.
Write a function that can pretty print a given two-dimensional array:
```
double[][] arr = new double[3][3];
arr[1][1] = 1;
System.out.println( asMatrix( arr ) );
```
```
Sample Output:
0.0 0.0 0.0
0.0 1.0 0.0
0.0 0.0 0.0
```
##### To Compile :  
``` javac TwoDimensionalArray.java ```
##### To Run :
``` java TwoDimensionalArray ```
##### Output :
``` 
Enter no of rows, columns.
3
3
0.0 0.0 0.0 
0.0 1.0 0.0 
0.0 0.0 0.0 
```
### Task4: Display sum of rows, columns, diagonal of two dimensional array.
Write a function that can calculate the sum of the rows, columns and a diagonal of a twodimensional
array and prints it in the following way:
``` 
Sample Output:
0 1 2 | 3
1 2 3 | 6
2 3 4 | 9
------/
3 6 9   6
```
##### To Compile :  
``` javac TwoDimensionalSum.java```
##### To Run :
``` java TwoDimensionalSum ```
##### Output :
```
Enter no of rows, columns.
3
3
Enter values.
0
1
2
1
2
3
2
3
4
0 1 2 | 3
1 2 3 | 6
2 3 4 | 9
------/
3 6 9  6

```