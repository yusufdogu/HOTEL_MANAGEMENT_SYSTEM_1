import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    // Oteldeki odaların listesi
    private ArrayList<Oda> odalar = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Yeni bir oda eklemek için metod
    public void odaEkleme() {
        System.out.print("Oda numarasını girin: ");
        int odaNumarasi = scanner.nextInt();

        System.out.print("Oda kapasitesini girin: ");
        int kapasite = scanner.nextInt();

        System.out.print("Oda fiyatını girin: ");
        double fiyat = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline

        System.out.print("Odanın durumunu girin (Boş/Dolu): ");
        String odaDurumu = scanner.nextLine();

        System.out.print("Odanın manzarasını girin (Deniz/Orman): ");
        String manzara = scanner.nextLine();

        // Oda nesnesini oluşturup ekliyoruz
        Oda yeniOda = new Oda(odaNumarasi, kapasite, fiyat, odaDurumu, manzara);
        odalar.add(yeniOda);

        System.out.println("Oda başarıyla eklendi: \n" + yeniOda.odaBilgileri());
    }

    // Bir odayı numarası ile silmek için metod
    public void odaCikarma(int odaNumarasi) {
        for (Oda oda : odalar) {
            if (oda.getOdaNumarasi() == odaNumarasi) {
                odalar.remove(oda); // Odayı listeden kaldır
                System.out.println("Oda başarıyla silindi: \n" + oda.odaBilgileri());
                return; // Döngüyü sonlandır
            }
        }
        System.out.println("Oda bulunamadı!"); // Oda bulunamazsa mesaj yazdır
    }

    // Oda durumunu (Boş/Dolu) güncelleyen metod
    public void odaDurumuGuncelle(int odaNumarasi, String yeniDurum) {
        for (Oda oda : odalar) {
            if (oda.getOdaNumarasi() == odaNumarasi) {
                oda.odaDurumuGuncelle(yeniDurum); // Odanın durumunu güncelle
                System.out.println("Oda durumu başarıyla güncellendi: \n" + oda.odaBilgileri());
                return;
            }
        }
        System.out.println("Oda bulunamadı!"); // Oda bulunamazsa mesaj yazdır
    }

    // Tüm odaları listeleyen metod
    public void tumOdalarıListele() {
        if (odalar.isEmpty()) {
            System.out.println("Şu anda otelde kayıtlı oda yok.");
        } else {
            System.out.println("--- Oteldeki Odalar ---");
            for (Oda oda : odalar) {
                System.out.println(oda.odaBilgileri()); // Her bir odanın bilgilerini yazdır
            }
        }
    }
}
