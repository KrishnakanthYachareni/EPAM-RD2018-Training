## Compilation & Execution Instructions

### Task: Auto Car Parking Application  version 2.0
Auto Car Parking Application that accept parking area and number of parking slots in a parking area. After accepting the prompt will stay and accept commands to accept the parking cars one by one. Also accept command to unpark the car.report new feature has added in version 2.0.
Report command gives current available and occupied slots in parking area. 

Valid inputs:

1. Parking area name should not contain any special symbols and can have max 100 chars.
2. capacity of parking area should be in between 10 to 100, if not assign default capacity as 10 slots.
3. Car Registration number should have at least 2 digits and remaining alphabets.
4. Registration number length should be 10.
5. User has to use 'p', 'u', 'e', 'r' commands for parking, unparking, exit, report the car respectively.

##### To Compile :  
 ``` javac AutoCarParkingApplication.java```
 
##### To Run :
  ``` java AutoCarParkingApplication.java EPAMCARPARKING 60```
##### Output :
```
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
p
Enter Vehicle Registration Number.
ts12345678
ts12345678 vehicle has successfully parked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
r
Number of Occupied slots are: 1
Number of empty slots are: 9
Occupied vehicles are:
ts12345678,
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
p
Enter Vehicle Registration Number.
ts12345679
ts12345679 vehicle has successfully parked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
r
Number of Occupied slots are: 2
Number of empty slots are: 8
Occupied vehicles are:
ts12345678,ts12345679,
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
u
Enter Vehicle Registration Number.
ts12345670
ts12345670 vehicle has not present
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
r
Number of Occupied slots are: 2
Number of empty slots are: 8
Occupied vehicles are:
ts12345678,ts12345679,
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
u
Enter Vehicle Registration Number.
ts12345678
ts12345678 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
r
Number of Occupied slots are: 1
Number of empty slots are: 9
Occupied vehicles are:
ts12345679,
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
u
Enter Vehicle Registration Number.
ts12345679
ts12345679 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
r
Number of Occupied slots are: 0
Number of empty slots are: 10
Occupied vehicles are:

---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
u
Parking slots are empty
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
r
Number of Occupied slots are: 0
Number of empty slots are: 10
Occupied vehicles are:

---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
r => report
e => exit
e
```