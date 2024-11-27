import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hotel nesnesi oluşturuluyor
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        // Otel işlemleri için ana menü
        while (true) {
            System.out.println("\n--- Otel Yönetim Sistemi ---");
            System.out.println("1. Oda Ekle");
            System.out.println("2. Oda Sil");
            System.out.println("3. Oda Durumunu Güncelle");
            System.out.println("4. Tüm Odaları Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (secim) {
                case 1:
                    hotel.odaEkleme(); // Oda ekleme işlemi
                    break;
                case 2:
                    System.out.print("Silmek istediğiniz oda numarasını girin: ");
                    int odaNumarasiSil = scanner.nextInt();
                    hotel.odaCikarma(odaNumarasiSil); // Oda silme işlemi
                    break;
                case 3:
                    System.out.print("Durumunu güncellemek istediğiniz oda numarasını girin: ");
                    int odaNumarasiGuncelle = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Yeni durumu girin (Boş/Dolu): ");
                    String yeniDurum = scanner.nextLine();
                    hotel.odaDurumuGuncelle(odaNumarasiGuncelle, yeniDurum); // Oda durumu güncelleme
                    break;
                case 4:
                    hotel.tumOdalarıListele(); // Tüm odaları listeleme
                    break;
                case 5:
                    System.out.println("Çıkılıyor...");
                    return; // Programdan çıkma
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        }
    }
}
