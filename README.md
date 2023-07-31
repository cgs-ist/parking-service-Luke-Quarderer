[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11508266&assignment_repo_type=AssignmentRepo)
# November 2020 Paper 2

### Question 10

A company provides car parking services in large cities and needs a computer system to keep track of the number of vehicles using its parking areas. 
When a vehicle arrives, its registration plate is recorded on the system and it is allocated a number that identifies where it should park. When the vehicle leaves, that space is made available for other vehicles to use. 
Vehicles are identified by their unique registration plate, which is an alphanumeric code of 
eight characters (eg X1234567). This is clearly displayed on the vehicle. 
A programmer created the classes `ParkingArea` and `Vehicle` to model the above situation. 

> **Study the Code in the ParkingArea and Vehicle Classes**

> 10 (a) Outline one effect of using the modifier `static` when declaring a variable. [2]

- > { Q Reference: Section D3.3 }

> 10 (b) Describe the relationship between the classes `Vehicle` and `ParkingArea`.	[3] 

- > { Question Reference: Section D1.6 }

> 10 (c) Outline why it is necessary to use the keyword `this` in the `setBroken` method of the  `Vehicle` class.	[2] 

- > { Question Reference: Section D2.1 }

> 10 (d) (i)	Construct code to create an instance of the `Vehicle` class that has a registration of X1234567.	[2]

- > { Question Reference: Section D3.5 }

> 10 (d) (ii)	Construct code that sets the colour of the object created in part (i) as black.	[2] 

- > { Question Reference: Section D3.5 }

### Question 11

> 11 (a) Construct the method `addVehicle(Vehicle v)` that will add a vehicle to the first empty position of the array `vehicles[]` and return the position (ie the index of the array) at which it has added the car. If it is not possible to fit the vehicle into the array 
then it should return -1.	[6] 

- > { Question Reference: Section D3.5 }

> 11 (b) Outline two differences between inheritance and aggregation.	[4]

- > { Question Reference: Section D1.6 }

> 11 (c) Two further classes, `Car` and `Motorbike`, are created. Construct a UML diagram that shows the relationships between the ParkingArea, Vehicle, Motorbike and Car classes. There is no need to include the attributes or methods of each class.	[4] 

- > { Question Reference: Section D1.3,4 & D1.6 }

 > 11 (d) The method `pay` in the `Vehicle` class returns the administration fee (which is only part of the total price), while the method pay of the `Car` class calculates the total price for a car staying in the parking area. 

 - > { Question Reference: Section D }

 > 11 (d) (i) Construct the method pay in the Vehicle class that returns the admin fee stored in the variable AdminFee if the vehicle has stayed for five hours or less; otherwise, it returns 0.	[2] 

 - > { Question Reference: Section D }

 > 11 (d) (ii) Construct the method `pay` in the `Car` class, where it uses the vehicle method `pay` but adds the charge for the amount of time spent in the parking area.	[2] 

  - > { Question Reference: Section D }

 > 11 (e) The array `vehicles[]` in the `ParkingArea` class is used to store instances of the `Car` or `Motorbike` class. [2]

 - > { Question Reference: Section D }

 ### Question 12

 > 12 The management of the company will launch a new scheme to give every 50th car driver and every 60th motorcyclist a free coffee voucher. The code for printing this voucher has already been created and is activated by calling the static method Vouchers.`printCoffeeVoucher()`. 

  > 12 (a) A `getKind()` method has already been added to the `Vehicle` class, which returns a char value indicating whether it is a car (c) or a motorbike (m). 
 Describe, without writing code, any changes required to the `addVehicle` method and the `ParkingArea` class to make the new voucher scheme work.	[5] 

  - > { Question Reference: Section D }

 > One test performed on the finished code was defined as follows: 

 Test Data | Vouchers Printed
 -----|-----
 29 cars | 0
 130 motorbikes | 2

 > 12 (b) Identify three other tests you might perform on the completed code to prove that it 
functions correctly. [3]

 - > { Question Reference: Section D }

> The `removeVehicle` method of the `ParkingArea` class searches in the array for a Vehicle 
object with a specified registration plate, then removes it by setting that array index to null. The method returns a reference to the Vehicle object that has been removed from the array, or null if no matching registration plate was found. 

> 12 (c) Construct the `removeVehicle` method. [6]

 - > { Question Reference: Section D }
