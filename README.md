# Book My Stay App – Use Case 6

## Overview

This use case confirms reservations and allocates rooms while preventing double-booking. Each reservation is assigned a unique room ID, and inventory is updated immediately.

## Objective

* Confirm bookings from queued requests
* Generate unique room IDs
* Prevent double-booking
* Synchronize inventory after allocation

## Features

* FIFO processing of booking requests
* Unique room ID generation per reservation
* Inventory decrement upon confirmation
* Allocation tracking with `Set<String>` per room type
* Graceful handling of insufficient availability

## File Structure

* `UseCase6RoomAllocationService.java` – Contains reservation, inventory, and booking logic

## How to Compile and Run

### Compile

```id="a9k4pl"
javac UseCase6RoomAllocationService.java
```

### Run

```id="b7m2qr"
java UseCase6RoomAllocationService
```

## Expected Output

```id="c4r1sx"
Welcome to Book My Stay App
Hotel Booking System v6.0

--- Processing Bookings ---
Reservation Confirmed:
Guest: Alice, Room Type: Single Room, Room ID: S-12
Reservation Confirmed:
Guest: Bob, Room Type: Double Room, Room ID: D-8
Reservation Confirmed:
Guest: Charlie, Room Type: Suite Room, Room ID: S-55
Reservation Confirmed:
Guest: David, Room Type: Suite Room, Room ID: S-77
Reservation Failed (No Availability): Eve for Suite Room

--- Current Inventory ---
Single Room : 4
Double Room : 2
Suite Room : 0
```

## Key Concepts Used

* Queue Data Structure (FIFO)
* HashMap & Set for allocation tracking
* Unique Room ID generation
* Atomic operations for allocation + inventory update
* Prevention of double-booking

## Version

6.0
