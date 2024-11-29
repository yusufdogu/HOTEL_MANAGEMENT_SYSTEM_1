import java.util.ArrayList;

public class Room {
    private int roomNumber; // Oda numarası
    private int capacity; // Oda kapasitesi
    private double price; // Oda fiyatı
    private String status; // Oda durumu (Boş/Dolu)

    // Constructor (Yapıcı metod)
    public Room(int roomNumber, int capacity, double price, String status) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price = price;
        this.status = status;
    }

    // Oda numarasını döndüren metod
    public int getRoomNumber() {
        return roomNumber;
    }

    // Oda kapasitesini döndüren metod
    public int getCapacity() {
        return capacity;
    }

    // Oda fiyatını döndüren metod
    public double getPrice() {
        return price;
    }

    // Oda durumunu döndüren metod
    public String getStatus() {
        return status;
    }

    // Oda bilgilerini döndüren metod
    public String roomDetails() {
        return "Oda Numarası: " + roomNumber + ", Kapasite: " + capacity + ", Fiyat: " + price + " TL, Durum: " + status;
    }

    // Oda arama (Oda numarasına göre)
    public static void searchRoomByNumber(int roomNumber, ArrayList<Room> rooms) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                System.out.println("Oda Bulundu: " + room.roomDetails());
                return;
            }
        }
        System.out.println("Oda numarası ile eşleşen oda bulunamadı.");
    }
}
