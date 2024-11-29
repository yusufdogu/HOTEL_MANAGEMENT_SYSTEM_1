import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Ali", "12345");
        Manager manager = new Manager("Veli", "67890");

        while (true) {
            System.out.println("\n--- Sisteme Giriş ---");
            System.out.println("1. Admin Girişi");
            System.out.println("2. Manager Girişi");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Admin Girişi
                System.out.print("Admin şifresi: ");
                String password = scanner.nextLine();
                if (password.equals("admin123")) {
                    while (true) {
                        System.out.println("\n--- Admin Menüsü ---");
                        System.out.println("1. Çalışan Ekle");
                        System.out.println("2. Çalışan Sil");
                        System.out.println("3. Oda Ekle");
                        System.out.println("4. Oda Sil");
                        System.out.println("5. Çalışanları Listele");
                        System.out.println("6. Odaları Listele");
                        System.out.println("7. Oda Ara");
                        System.out.println("8. Çıkış");
                        System.out.print("Seçiminizi yapın: ");
                        int adminChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (adminChoice == 1) {
                            // Çalışan Ekle
                            System.out.print("Çalışan Adı: ");
                            String name = scanner.nextLine();
                            System.out.print("Çalışan Kimlik Numarası: ");
                            String id = scanner.nextLine();
                            System.out.print("Pozisyon (Admin, Manager, Employee): ");
                            String position = scanner.nextLine();
                            Employee employee = new Employee(name, id, position);
                            admin.addEmployee(employee);
                        } else if (adminChoice == 2) {
                            // Çalışan Sil
                            System.out.print("Silmek istediğiniz çalışan kimlik numarasını girin: ");
                            String id = scanner.nextLine();
                            admin.removeEmployee(id);
                        } else if (adminChoice == 3) {
                            // Oda Ekle
                            System.out.print("Oda Numarası: ");
                            int roomNumber = scanner.nextInt();
                            System.out.print("Oda Kapasitesi: ");
                            int capacity = scanner.nextInt();
                            System.out.print("Oda Fiyatı: ");
                            double price = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Oda Durumu (Boş/Dolu): ");
                            String status = scanner.nextLine();
                            Room room = new Room(roomNumber, capacity, price, status);
                            admin.addRoom(room);
                        } else if (adminChoice == 4) {
                            // Oda Sil
                            System.out.print("Silmek istediğiniz oda numarasını girin: ");
                            int roomNumber = scanner.nextInt();
                            admin.removeRoom(roomNumber);
                        } else if (adminChoice == 5) {
                            // Çalışanları Listele
                            admin.listEmployees();
                        } else if (adminChoice == 6) {
                            // Odaları Listele
                            admin.listRooms();
                        } else if (adminChoice == 7) {
                            // Oda Ara
                            System.out.print("Aramak istediğiniz oda numarasını girin: ");
                            int roomNumber = scanner.nextInt();
                            admin.searchRoom(roomNumber);
                        } else if (adminChoice == 8) {
                            // Çıkış
                            break;
                        } else {
                            System.out.println("Geçersiz seçim. Tekrar deneyin.");
                        }
                    }
                } else {
                    System.out.println("Geçersiz şifre!");
                }
            } else if (choice == 2) {
                // Manager Girişi
                System.out.print("Manager şifresi: ");
                String password = scanner.nextLine();
                if (password.equals("manager123")) {
                    while (true) {
                        System.out.println("\n--- Manager Menüsü ---");
                        System.out.println("1. Oda Ekle");
                        System.out.println("2. Oda Sil");
                        System.out.println("3. Odaları Listele");
                        System.out.println("4. Oda Ara");
                        System.out.println("5. Çıkış");
                        System.out.print("Seçiminizi yapın: ");
                        int managerChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (managerChoice == 1) {
                            // Oda Ekle
                            System.out.print("Oda Numarası: ");
                            int roomNumber = scanner.nextInt();
                            System.out.print("Oda Kapasitesi: ");
                            int capacity = scanner.nextInt();
                            System.out.print("Oda Fiyatı: ");
                            double price = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Oda Durumu (Boş/Dolu): ");
                            String status = scanner.nextLine();
                            Room room = new Room(roomNumber, capacity, price, status);
                            manager.addRoom(room);
                        } else if (managerChoice == 2) {
                            // Oda Sil
                            System.out.print("Silmek istediğiniz oda numarasını girin: ");
                            int roomNumber = scanner.nextInt();
                            manager.removeRoom(roomNumber);
                        } else if (managerChoice == 3) {
                            // Odaları Listele
                            manager.listRooms();
                        } else if (managerChoice == 4) {
                            // Oda Ara
                            System.out.print("Aramak istediğiniz oda numarasını girin: ");
                            int roomNumber = scanner.nextInt();
                            manager.searchRoom(roomNumber);
                        } else if (managerChoice == 5) {
                            // Çıkış
                            break;
                        } else {
                            System.out.println("Geçersiz seçim. Tekrar deneyin.");
                        }
                    }
                } else {
                    System.out.println("Geçersiz şifre!");
                }
            } else if (choice == 3) {
                // Çıkış
                break;
            } else {
                System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
