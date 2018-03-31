## Compilation & Execution Instructions
### Task1: Print comma separated data using PushBackInputStream
 This application print comma separated data using PushBackInputStream. If the first argument is even number, print the row. If the first argument is odd number, skip the row.
 ```
 Sample input: 
 	20,Krishnakanth
 	21,Yachareni
 	
 Sample output:
 	20,Krishnakanth
```
```
Note: because 20 is even so output is "20,Krishnakanth"
```
#### Readme.txt File
```
20, krishnakanth,Rajinikanth

26, Yachareni, Srikanth.

24, Abhinav Panjala.

12, Saikumar, Gajula
13, Sravanthi
14,,Two commas
15 EPAM Systems Pvt Limited
16 Thank You.
```
##### To Compile :  
``` javac PushBackExample.java ```
##### To Run :
``` java PushBackExample E:\\Readme.txt ```
##### Output :
```
20, krishnakanth,Rajinikanth

26, Yachareni, Srikanth.

24, Abhinav Panjala.

12, Saikumar, Gajula
14,,Two commas
```