public class Employee {
    private String name; // Çalışan adı
    private String id; // Çalışan kimlik numarası
    private String position; // Çalışanın pozisyonu (Admin, Manager, Employee)

    // Constructor (Yapıcı metod)
    public Employee(String name, String id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    // Çalışan adı döndüren metod
    public String getName() {
        return name;
    }

    // Çalışan kimlik numarasını döndüren metod
    public String getId() {
        return id;
    }

    // Çalışan pozisyonunu döndüren metod
    public String getPosition() {
        return position;
    }

    // Çalışan bilgilerini gösteren metod
    public void showEmployeeDetails() {
        System.out.println("Çalışan Adı: " + name);
        System.out.println("Çalışan Kimlik Numarası: " + id);
        System.out.println("Pozisyon: " + position);
    }
}
