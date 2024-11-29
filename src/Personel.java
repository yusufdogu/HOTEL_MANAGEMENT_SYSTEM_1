import java.util.ArrayList;

public class Admin extends Employee {
    private ArrayList<Employee> employees; // Çalışanlar listesi
    private ArrayList<Room> rooms; // Oda listesi

    // Constructor (Yapıcı metod)
    public Admin(String name, String id) {
        super(name, id, "Admin");
        employees = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    // Çalışan ekleme
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Çalışan başarıyla eklendi: " + employee.getName());
    }

    // Çalışan silme
    public void removeEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                employees.remove(employee);
                System.out.println("Çalışan başarıyla silindi: " + employee.getName());
                return;
            }
        }
        System.out.println("Çalışan bulunamadı!");
    }

    // Çalışanları listeleme
    public void listEmployees() {
        System.out.println("Tüm Çalışanlar:");
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
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

    // Tüm odaları listeleme
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
