# Book My Stay App – Use Case 5

## Overview

This use case introduces a booking request mechanism using a Queue to ensure fair handling of multiple booking requests.

## Objective

* Accept booking requests from users
* Store requests in arrival order
* Ensure fairness using FIFO principle

## Features

* Reservation class to represent booking requests
* Queue-based request management
* FIFO (First-Come-First-Served) processing
* No inventory updates at this stage

## File Structure

* `UseCase5BookingRequestQueue.java` – Contains reservation and queue logic

## How to Compile and Run

### Compile

```id="h2k9pl"
javac UseCase5BookingRequestQueue.java
```

### Run

```id="n8v3qx"
java UseCase5BookingRequestQueue
```

## Expected Output

```id="p4z7ws"
Welcome to Book My Stay App
Hotel Booking System v5.0
Booking request added for Alice
Booking request added for Bob
Booking request added for Charlie

--- Booking Request Queue ---
Guest: Alice, Room Type: Single Room
Guest: Bob, Room Type: Double Room
Guest: Charlie, Room Type: Suite Room
```

## Key Concepts Used

* Queue Data Structure
* FIFO Principle
* Encapsulation
* Fair Request Handling
* Separation of Concerns

## Version

5.0
