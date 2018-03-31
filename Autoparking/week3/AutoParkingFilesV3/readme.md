## Compilation & Execution Instructions

### Task: Auto Parking Application  version 3.0(Persistent)
Auto Car Parking Application that can have Login and SignUp panels and after successful login the prompt will stay and accept commands to accept the
parking cars one by one. Also accept command to unpark the car. Vehcile parking in time , unpark time will store in text file.
The auto parking application is persisted.It can maintain the information of parking and unparking of vehicles in a parking Lot.
#### New Features in Version 3.0:
``` 
1. It can maintain the Parking Lot user information in a file.
2. It can store the current Parked Vehicles data and time in file.
3. It can also maintains the previous data in a file.
4. MoreOver this application is more persistence,It will not lost the data.
 
```

Valid inputs:

1. Parking area name should not contain any special symbols and can have max 100 chars.
2. capacity of parking area should be in between 10 to 100, if not assign default capacity as 10 slots.
3. Car Registration number should have at least 2 digits and remaining alphabets.
4. Registration number length should be 10.
5. User has to use 'p', 'u', 'e', 'l' commands for parking, unparking, exit, report the car respectively.

##### To Compile :  
 ``` javac ClientLogin.java```
 
##### To Run :
  ``` java ClientLogin.java```
##### Output :
```
**************** Welcome To AutoParking ****************
1.Login
2.SignUp(new user)
2
************ SignUp Panel ***********
Enter User Name
krishnakanth
Enter your secret password
krishnakanth
Enter Paking Lot Name
Krishnakanth
Enter Parking Lot Capacity
10
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
p
Enter Vehicle Registration Number.
TS12345678
TS12345678 vehicle has already present
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
p
Enter Vehicle Registration Number.
TS12345677
TS12345677 vehicle has successfully parked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
p
Enter Vehicle Registration Number.
TS12345669
TS12345669 vehicle has successfully parked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
u
Enter Vehicle Registration Number.
ts12345678
TS12345678 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
u
Enter Vehicle Registration Number.
ts12345677
TS12345677 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
u
Enter Vehicle Registration Number.
ts12345679
TS12345679 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
l
************** Parked Vehicles in Parking Lot  ************
4,TS12345669,2018-02-08 16:12:33
************** Auto Parking Transcation LogFile ************
1,TS12345678,2018-02-08 11:23:27,2018-02-08 11:23:36
1,TS12345678,2018-02-08 12:04:39,2018-02-08 12:24:22
1,TS12345678,2018-02-08 16:02:36,2018-02-08 16:12:39
3,TS12345677,2018-02-08 16:12:15,2018-02-08 16:12:46
2,TS12345679,2018-02-08 16:02:41,2018-02-08 16:12:57
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
u
Enter Vehicle Registration Number.
ts12345669
TS12345669 vehicle has successfully unparked
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
u
Parking slots are empty
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
l
************** Parked Vehicles in Parking Lot  ************
************** Auto Parking Transcation LogFile ************
1,TS12345678,2018-02-08 11:23:27,2018-02-08 11:23:36
1,TS12345678,2018-02-08 12:04:39,2018-02-08 12:24:22
1,TS12345678,2018-02-08 16:02:36,2018-02-08 16:12:39
3,TS12345677,2018-02-08 16:12:15,2018-02-08 16:12:46
2,TS12345679,2018-02-08 16:02:41,2018-02-08 16:12:57
4,TS12345669,2018-02-08 16:12:33,2018-02-08 16:13:16
---------- AUTOPARKING ---------
Choose any one command in MENU.
p => Park
u => Unpark
l => Log Data
e => Exit
e
```