import java.util.*;

class Reservation {

    private String guestName;
    private String roomType;
    private String roomId;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void displayReservation() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Room ID: " + roomId);
    }
}

class RoomInventory {

    private Map<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    public boolean isAvailable(String roomType) {
        return inventory.getOrDefault(roomType, 0) > 0;
    }

    public void decrementAvailability(String roomType) {
        inventory.put(roomType, inventory.get(roomType) - 1);
    }

    public void displayInventory() {
        System.out.println("\n--- Current Inventory ---");
        for (String type : inventory.keySet()) {
            System.out.println(type + " : " + inventory.get(type));
        }
    }
}

class BookingService {

    private Queue<Reservation> bookingQueue;
    private RoomInventory inventory;
    private Map<String, Set<String>> allocatedRooms;

    public BookingService(Queue<Reservation> bookingQueue, RoomInventory inventory) {
        this.bookingQueue = bookingQueue;
        this.inventory = inventory;
        allocatedRooms = new HashMap<>();
        allocatedRooms.put("Single Room", new HashSet<>());
        allocatedRooms.put("Double Room", new HashSet<>());
        allocatedRooms.put("Suite Room", new HashSet<>());
    }

    private String generateRoomId(String roomType) {
        String id;
        do {
            id = roomType.substring(0, 1) + "-" + (int)(Math.random() * 100 + 1);
        } while (allocatedRooms.get(roomType).contains(id));
        allocatedRooms.get(roomType).add(id);
        return id;
    }

    public void processBookings() {
        System.out.println("\n--- Processing Bookings ---");
        while (!bookingQueue.isEmpty()) {
            Reservation r = bookingQueue.poll();
            if (inventory.isAvailable(r.getRoomType())) {
                String roomId = generateRoomId(r.getRoomType());
                r.setRoomId(roomId);
                inventory.decrementAvailability(r.getRoomType());
                System.out.println("Reservation Confirmed:");
                r.displayReservation();
            } else {
                System.out.println("Reservation Failed (No Availability): " + r.getGuestName() + " for " + r.getRoomType());
            }
        }
    }
}

public class UseCase6{

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");
        System.out.println("Hotel Booking System v6.0");

        Queue<Reservation> bookingQueue = new LinkedList<>();
        bookingQueue.add(new Reservation("Alice", "Single Room"));
        bookingQueue.add(new Reservation("Bob", "Double Room"));
        bookingQueue.add(new Reservation("Charlie", "Suite Room"));
        bookingQueue.add(new Reservation("David", "Suite Room"));
        bookingQueue.add(new Reservation("Eve", "Suite Room")); // Exceeds availability

        RoomInventory inventory = new RoomInventory();

        BookingService bookingService = new BookingService(bookingQueue, inventory);
        bookingService.processBookings();

        inventory.displayInventory();
    }
}