import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    Scanner girdiler = new Scanner(System.in);

    ArrayList<Oda> odalar= new ArrayList<>();
    ArrayList<Personel> personeller= new ArrayList<>();
    ArrayList<YerAyirma> yerAyirmalar= new ArrayList<>();

    public void odaEkleme(Oda oda){
        //buraya oda sınıfı oluşturulduktan sonra scanner ile oda sınıfına girilecek bilgiler alınıp veri tabanına eklenmeli

    }
    public void odaCikarma(Oda oda){
        //odaidyi kullanıp veritabanından bu odayı bulup silme işlemini yapacağız

    }
    public void personelEkleme(Personel personel){
        System.out.println("Personel bilgilerinizi giriniz");// Gui ile buton olayları yapılmalı
        personel.setIsimSoyisim(girdiler.nextLine());
        personel.setPersonelKimlik(girdiler.nextLine());
        personel.setGorevAlani(girdiler.nextLine());
        personel.setSalary(girdiler.nextDouble());
        System.out.println("personel bilgileri ... (burada genel olarak personel bilgileri gösterilecek) ve onaylamayla ilgili bir şeyler eklenebilir ");
        //ayrıca bu bilgilerin hepsini bir veri tabanına yüklememiz gerekiyor
    }
    public void personelCikarma(Personel personel){
        System.out.println("silinecek personelin id bilgisini giriniz");//silinecek personelin id bilgisi alınması yeterli
        //buraya veritabanına bu id'yi arayıp bulacak bir kod koymalıyız

    }

    public void yoneticiEkleme(Yonetici yonetici){
        System.out.println("Yönetici bilgilerini giriniz");
        yonetici.setIsimSoyisim(girdiler.nextLine());
        yonetici.setYoneticiOzelKimlik(girdiler.nextLine());
        yonetici.setGorevAlani(girdiler.nextLine());
        yonetici.setSalary(girdiler.nextDouble());
        //burada veritabanına yükleme işlemi yapılır
    }
    public void yoneticiCikarma(Yonetici yonetici){
        //yonetici id uzerinden veritabanından veri çekilerek halledilir
    }

    public ArrayList<Oda> odaUygunMu(Tarih baslangicTarihi,Tarih ayrilmaTarihi){
        // örneğin mainden bu fonksiyona bir tarih aralığı verip ve veritabanından bu tarih aralıklarını bulup uygunluk durumu uygun olanları liste olarak döndürür
        return null;
    }
    public void otomatikOdaUygunlukDuzenleme(){
        //bu fonksiyon her gün belirli bir saatte yenilenecek ve veritabanında bugün boş hale gelmesi olan odaların uygunluk durumları düzenlenecek
    }
    public void uygunOdalariSemalastir(Tarih baslangicTarihi, Tarih ayrilmaTarihi){
        //10 katlı ve her katında 10 odası bulunan  (5 oda ormana , 5 oda denize bakacak şekilde) burada 2 boyutlu bir görsel üzerinden hangi odaların boş olduğunu göstereceğiz
    }

}
