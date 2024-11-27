import java.util.Scanner;

public class Oda {
    private int odaNumarasi;     // Odanın numarası
    private int kapasite;        // Odanın kapasitesi (Kaç kişi alabilir)
    private double fiyat;        // Odanın fiyatı
    private String odaDurumu;    // Odanın durumu ("Boş" ya da "Dolu")
    private String manzara;      // Odanın manzarası ("Deniz" veya "Orman")

    // Constructor (Yapıcı metod)
    public Oda(int odaNumarasi, int kapasite, double fiyat, String odaDurumu, String manzara) {
        this.odaNumarasi = odaNumarasi;
        this.kapasite = kapasite;
        this.fiyat = fiyat;
        this.odaDurumu = odaDurumu;
        this.manzara = manzara;
    }

    // Oda numarasını döndüren getter
    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    // Oda kapasitesini döndüren getter
    public int getKapasite() {
        return kapasite;
    }

    // Oda fiyatını döndüren getter
    public double getFiyat() {
        return fiyat;
    }

    // Oda durumunu döndüren getter
    public String getOdaDurumu() {
        return odaDurumu;
    }

    // Odanın manzarasını döndüren getter
    public String getManzara() {
        return manzara;
    }

    // Oda durumunu güncelleyen setter
    public void odaDurumuGuncelle(String yeniDurum) {
        this.odaDurumu = yeniDurum;
    }

    // Oda bilgilerini döndüren metod
    public String odaBilgileri() {
        return "Oda Numarası: " + odaNumarasi + ", Kapasite: " + kapasite + ", Fiyat: " + fiyat + " TL, Durum: " + odaDurumu + ", Manzara: " + manzara;
    }
}
