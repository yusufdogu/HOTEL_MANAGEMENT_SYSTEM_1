import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Room> rooms; // Oda listesi

    // Constructor (Yapıcı metod)
    public Manager(String name, String id) {
        super(name, id, "Manager");
        rooms = new ArrayList<>();
    }

    // Oda ekleme
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Oda başarıyla eklendi.");
    }

    // Oda silme
    public void removeRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                rooms.remove(room);
                System.out.println("Oda başarıyla silindi.");
                return;
            }
        }
        System.out.println("Oda bulunamadı!");
    }

    // Oda bilgilerini listeleme
    public void listRooms() {
        System.out.println("Tüm Odalar:");
        for (Room room : rooms) {
            System.out.println(room.roomDetails());
        }
    }

    // Oda arama
    public void searchRoom(int roomNumber) {
        Room.searchRoomByNumber(roomNumber, rooms);
    }
}
