# Book My Stay App – Use Case 3

## Overview

This use case introduces centralized inventory management using a HashMap. It replaces scattered availability variables with a single source of truth.

## Objective

* Manage room availability using a centralized structure
* Use HashMap for efficient storage and retrieval
* Encapsulate inventory logic in a dedicated class

## Features

* Centralized room inventory using HashMap
* Fast lookup and update operations (O(1))
* Methods for:

  * Viewing availability
  * Updating availability
  * Displaying inventory

## File Structure

* `UseCase3InventorySetup.java` – Contains inventory logic and main method

## How to Compile and Run

### Compile

```id="x8p2lm"
javac UseCase3InventorySetup.java
```

### Run

```id="q7n1vd"
java UseCase3InventorySetup
```

## Expected Output

```id="y3r9bk"
Welcome to Book My Stay App
Hotel Booking System v3.1

--- Room Inventory ---
Single Room : 5
Double Room : 3
Suite Room : 2

Checking availability for Single Room: 5

Updating availability for Double Room...

--- Room Inventory ---
Single Room : 5
Double Room : 4
Suite Room : 2
```

## Key Concepts Used

* HashMap
* Encapsulation
* Single Source of Truth
* O(1) Lookup
* Separation of Concerns

## Version

3.1
