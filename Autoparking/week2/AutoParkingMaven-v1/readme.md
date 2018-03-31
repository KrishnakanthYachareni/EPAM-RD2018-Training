## Compilation & Execution Instructions

### Task: Auto Car Parking Application
Auto Car Parking Application that accept parking area and number of parking slots in a parking area. After accepting the prompt will stay and accept commands to accept the parking cars one by one. Also accept command to unpark the car. 

Valid inputs:

1. Parking area name should not contain any special symbols and can have max 100 chars.
2. capacity of parking area should be in between 10 to 100, if not assign default capacity as 10 slots.
3. Car Registration number should have at least 2 digits and remaining alphabets.
4. Registration number length should be 10.
5. User has to use 'p', 'u','e' commands for parking, unparking, exit the car respectively.

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
e => exit
p
Enter Vehicle Registration Number.
TS12345678
TS12345678 vehicle has successfully parked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
e => exit
u
Enter Vehicle Registration Number.
TS12345678
TS12345678 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
e => exit
u
Parking slots are empty
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => park
u => unpark
e => exit
e 
```