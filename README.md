# Book My Stay App – Use Case 4

## Overview

This use case introduces room search functionality with read-only access to inventory. It ensures that users can view available rooms without modifying system state.

## Objective

* Enable safe, read-only room search
* Display only available rooms
* Maintain separation between search and booking logic

## Features

* Room search service
* Filters unavailable rooms
* Displays room details and availability
* Inventory remains unchanged during search

## File Structure

* `UseCase4RoomSearch.java` – Contains all classes and search logic

## How to Compile and Run

### Compile

```id="p0x9dl"
javac UseCase4RoomSearch.java
```

### Run

```id="r8t2mq"
java UseCase4RoomSearch
```

## Expected Output

```id="w4k1zs"
Welcome to Book My Stay App
Hotel Booking System v4.0

--- Available Rooms ---
Type: Single Room
Beds: 1
Price: 1000.0
Available: 5

Type: Double Room
Beds: 2
Price: 2000.0
Available: 3
```

## Key Concepts Used

* Read-Only Access
* Separation of Concerns
* Defensive Programming
* Encapsulation
* Filtering Logic

## Version

4.0
