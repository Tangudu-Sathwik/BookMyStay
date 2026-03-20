# Book My Stay App – Use Case 2

## Overview

This use case introduces object-oriented design concepts such as abstraction, inheritance, and polymorphism using a Hotel Booking scenario.

## Objective

* Model room types using classes
* Apply inheritance and abstraction
* Display room details and availability

## Features

* Abstract `Room` class
* Concrete room types:

    * Single Room
    * Double Room
    * Suite Room
* Static availability using variables
* Console-based output

## File Structure

* `UseCase2RoomInitialization.java` – Contains all classes and main method

## How to Compile and Run

### Compile

```id="c1p0xq"
javac UseCase2RoomInitialization.java
```

### Run

```id="z9a8lm"
java UseCase2RoomInitialization
```

## Expected Output

```id="d3k8ws"
Welcome to Book My Stay App
Hotel Booking System v2.1

--- Room Details ---
Type: Single Room
Beds: 1
Price: 1000.0
Available: 5

Type: Double Room
Beds: 2
Price: 2000.0
Available: 3

Type: Suite Room
Beds: 3
Price: 5000.0
Available: 2
```

## Key Concepts Used

* Abstract Class
* Inheritance
* Polymorphism
* Encapsulation
* Static Variables for Availability

## Version

2.1
