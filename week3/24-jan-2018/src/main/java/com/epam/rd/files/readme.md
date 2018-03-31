## Compilation & Execution Instructions
### Task1: Display the list of files present in directory.
Write a simple listing program that lists all the ”*.java” files within a specified
directory (it is a path passed as a command line argument). Use the
classes java.io.File and some utility methods like String.endsWith() and
File.list().

##### To Compile :  
``` javac ListJavaFiles.java ```
##### To Run :
``` java ListJavaFiles C:\Users\Krishnakanth_Yachare\eclipse-workspace\23-jan-2018\src\main\java\com\epam\rd\arrays ```
##### Output :
```
JoinArrayElements.java
package-info.java
SumAvgArrays.java
TwoDimensionalArray.java
TwoDimensionalSum.java
```
### Task2: Find sin, cos, tan values.
Write a simple interactive math utility that reads a real number from the user
and prints its sin, cos, tg values on the screen. Use the Math class for the
implementation. The code should run until the user specifies the ”END” input.
##### To Compile :  
``` javac MathUtility.java ```
##### To Run :
``` java MathUtility ```
##### Output :
```
Enter value for sin,cos,tan or use 'end' to exit
0
0.0
1.0
0.0
Enter value for sin,cos,tan or use 'end' to exit
90
1.0
6.123233995736766E-17
1.633123935319537E16
Enter value for sin,cos,tan or use 'end' to exit
45
0.7071067811865475
0.7071067811865476
0.9999999999999999
Enter value for sin,cos,tan or use 'end' to exit
end
```
### Task3: Dice Throwing.
Write an interactive dice throwing program. The program should ask the user for
a number of D6s to use, and prints its result on the screen. Use the
java.util.Random and java.io.Console classes for the implementation. The code
should run until the user specifies the empty string.
```
Note : This code has console input so, run with command prompt.
```
##### To Compile :  
``` javac RandomDice.java ```
##### To Run :
``` java RandomDice ```
##### Output :
``` 
Enter number
1
Sorry!
Enter number
1
Sorry!
Enter number
11
The number should be in between 1 to 6
Enter number
2
Sorry!
Enter number
2
Sorry!
Enter number
2
Excellent!
Enter number
3
Sorry!
Enter number


C:\Users\Krishnakanth_Yachare\eclipse-workspace> 
```
### Task4: Display current directory.
Write a program that prints the working directory to the console.
``` 
Sample Output:
$ java io.sample.Pwd
/var/home/belkar
```
##### To Compile :  
``` javac PrintWorkingDir.java```
##### To Run :
``` java PrintWorkingDir ```
##### Output :
```
C:\Users\Krishnakanth_Yachare\eclipse-workspace\24-jan-2018

```
### Task4: Display directory in tree structure format.
Write a program that display the structure of a specified folder recursively.
``` 
Sample Output:
$ java io.sample.Tree /src
+- src/
+- site/
+- apt/
| +- index.apt
|
+- xdoc/
| +- other.xml
|
+- fml/
| +- general.fml
| +- faq.fml
|
+- site.xml
```
##### To Compile :  
``` javac TreeStructure.java ```
##### To Run :
``` java TreeStructure E:\MyWorkSpace\RDTraining\RD18Training\week3 ```
##### Output :
```
+- 23-jan-2018/
|	pom.xml
|	readme.md
|	+- src/
|	|	+- main/
|	|	|	+- java/
|	|	|	|	+- com/
|	|	|	|	|	+- epam/
|	|	|	|	|	|	+- rd/
|	|	|	|	|	|	|	+- arrays/
|	|	|	|	|	|	|	|	JoinArrayElements.java
|	|	|	|	|	|	|	|	package-info.java
|	|	|	|	|	|	|	|	readme.md
|	|	|	|	|	|	|	|	SumAvgArrays.java
|	|	|	|	|	|	|	|	TwoDimensionalArray.java
|	|	|	|	|	|	|	|	TwoDimensionalSum.java
+- 24-jan-2018/
|	.classpath
|	.gitignore
|	.project
|	+- .settings/
|	|	org.eclipse.core.resources.prefs
|	|	org.eclipse.jdt.core.prefs
|	|	org.eclipse.m2e.core.prefs
|	pom.xml
|	readme.md
|	+- src/
|	|	+- main/
|	|	|	+- java/
|	|	|	|	+- com/
|	|	|	|	|	+- epam/
|	|	|	|	|	|	+- rd/
|	|	|	|	|	|	|	+- files/
|	|	|	|	|	|	|	|	+- Exception/
|	|	|	|	|	|	|	|	|	InputValidationException.java
|	|	|	|	|	|	|	|	|	package-info.java
|	|	|	|	|	|	|	|	ListJavaFiles.java
|	|	|	|	|	|	|	|	MathUtility.java
|	|	|	|	|	|	|	|	package-info.java
|	|	|	|	|	|	|	|	PrintWorkingDir.java
|	|	|	|	|	|	|	|	RandomDice.java
|	|	|	|	|	|	|	|	readme.md
|	|	|	|	|	|	|	|	TreeStructure.java
|	+- target/
|	|	+- classes/
|	|	|	+- com/
|	|	|	|	+- epam/
|	|	|	|	|	+- rd/
|	|	|	|	|	|	+- files/
|	|	|	|	|	|	|	+- Exception/
|	|	|	|	|	|	|	|	InputValidationException.class
|	|	|	|	|	|	|	|	package-info.class
|	|	|	|	|	|	|	ListJavaFiles.class
|	|	|	|	|	|	|	MathUtility.class
|	|	|	|	|	|	|	package-info.class
|	|	|	|	|	|	|	PrintWorkingDir.class
|	|	|	|	|	|	|	RandomDice.class
|	|	|	|	|	|	|	readme.md
|	|	|	|	|	|	|	TreeStructure.class
|	|	|	+- META-INF/
|	|	|	|	MANIFEST.MF
|	|	|	|	+- maven/
|	|	|	|	|	+- com/
|	|	|	|	|	|	+- 24-jan-2018/
|	|	|	|	|	|	|	pom.properties
|	|	|	|	|	|	|	pom.xml
|	|	+- test-classes/
RandomName.java

```
