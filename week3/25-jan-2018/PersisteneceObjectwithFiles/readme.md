## Compilation & Execution Instructions
### Task1: ObjectStream Example.
This application can create 5 persons objects and store its in a file and then read the objects from the file using serialization.

##### To Compile :  
``` javac EmpDemo.java ```
##### To Run :
``` java EmpDemo ```
##### Output :
```
Name: Krishnakanth, Age: 21, Address: Siddipet
Name: Sravanthi, Age: 18, Address: Hyderabad
Name: Srikanth, Age: 28, Address: Hyderabad
Name: Robert, Age: 25, Address: Us
Name: Tony Stark, Age: 32, Address: Newyork
File End is reached.
```
```
Note: Here dummy.bin has created it holds five employee objects. file is in below. This file only java can understand.
```
#### dummy.bin File
```
¬í sr $com.epam.rd.persistentfiles.Employee{ž2Ç>Û¤ I empAgeL 
empAddresst Ljava/lang/String;L empNameq ~ xp   t Siddipett Krishnakanthsq ~     t 	Hyderabadt 	Sravanthisq ~     q ~ t Srikanthsq ~     t Ust Robertsq ~      t Newyorkt 
Tony Stark
```