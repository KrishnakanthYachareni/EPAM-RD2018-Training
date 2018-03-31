## Compilation & Execution Instructions
### Task1: Searching word in a file and returns lines if that word present in line.
 This package has a program that accepts two command line parameters: a file
 path and a string.The code should read the specified file and print the lines containing the given string.

##### To Compile :  
``` javac SearchTextInFile.java ```
##### To Run :
``` java SearchTextInFile Input.txt and ```

##### Input.txt : 
```
Line 0 and Line 1
lne 2
line 3 randomAccessfile
line 4 kittu how are you dude and what are you doing?
line 5 word

Note: This file has two lines which matched "and"
```
##### Output : 
```
Line 0 and Line 1
line 4 kittu how are you dude and what are you doing?
```
### Task2: Merging two files into other file.
A program that has three command line arguments:
two input files and an output file.The program should merge the two
input files into the given output file. If the output file.
exists, it should ask the user for confirmation.
``` 
Note: If output file is exists two files content will append to it.
```
##### To Compile :  
``` javac MergeFiles.java ```
##### To Run :
``` java MergeFiles E\\file1 E:\\file2 E:\\file3 ```

##### file1.txt : 
```
EPAM
SYSTEMS
Pvt
LIMITED
INDIA
```
##### file2.txt : 
```
Line 1
line 2
line 3 
line 4
line 5
```
##### file3.txt : 
```
Hi This is Krishnaknth Yacharni
```

##### Output : 
```
E:\\file3.txt File is exists...Do you want to repace it?(y/n)
y
Files are merged into file3.txt

Note: Here two file contents appended to third file.
```
##### after running file3.txt : 
```
Hi This is Krishnaknth YacharniEPAM
SYSTEMS
Pvt
LIMITED
INDIA
Line 1
line 2
line 3 
line 4
line 5

```