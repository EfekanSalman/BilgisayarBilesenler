import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


/* islemci.txt dosyası -> ID, model, hız (GHz), önbellek (MB), çekirdek sayısı ve saat hızı (GHz).
 * anakart.txt dosyası -> ID, model ve bus hızı (MHz).
 * ekran_karti.txt ->   ID, model ve saat hızı (GHz).
 * ram.txt -> ID, model, kapasite (GB) ve hız (MHz)
 * hazir_sistem.txt -> ID, işlemci ID, anakart ID, ekran kartı ID ve RAM ID.
 * oyunlar.txt -> ID, oyun adı, gereken RAM kapasitesi (GB), gereken işlemci hızı (GHz), gereken anakart performansı (MHz)
 * ve gereken ekran kartı performansı (GHz).
 */

//islemci sınıfı
class Islemci {
    // Sınıfın (özel) özellikleri
    private int id;
    private String model;
    private double hiz;
    private int onbellek;
    private int cekirdek;
    private double saatHizi;

    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public Islemci(int id, String model, double hiz, int onbellek, int cekirdek, double saatHizi) {
        this.id = id;
        this.model = model;
        this.hiz = hiz;
        this.onbellek = onbellek;
        this.cekirdek = cekirdek;
        this.saatHizi = saatHizi;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getHiz() {
        return hiz;
    }

    public int getOnbellek() {
        return onbellek;
    }

    public int getCekirdek() {
        return cekirdek;
    }

    public double getSaatHizi() {
        return saatHizi;
    }
}

//anakart sınıfı
class Anakart {
    // Sınıfın özel değişkenleri
    private int id;
    private String model;
    private double busSpeed;
    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public Anakart(int id, String model, double busSpeed) {
        this.id = id;
        this.model = model;
        this.busSpeed = busSpeed;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getBusSpeed() {
        return busSpeed;
    }
}

// Ekran kartı sınıfı
class EkranKarti {
    // Sınıfın özel değişkenleri
    private int id;
    private String model;
    private double saatHizi;

    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public EkranKarti(int id, String model, double saatHizi) {
        this.id = id;
        this.model = model;
        this.saatHizi = saatHizi;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getSaatHizi() {
        return saatHizi;
    }
}

//ram sınıfı
class Ram {
    // Sınıfın özel değişkenleri
    int id;
    String model;
    int kapasite;
    int hiz;

    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public Ram(int id, String model, int kapasite, int hiz) {
        this.id = id;
        this.model = model;
        this.kapasite = kapasite;
        this.hiz = hiz;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getKapasite() {
        return kapasite;
    }

    public double getHiz() {
        return hiz;
    }
}

//hazir sistem sınıfı
class HazirSistem {
    // Sınıfın özel değişkenleri
    private int id;
    private int islemciId;
    private int anakartId;
    private int ekranKartiId;
    private int ramId;

    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public HazirSistem(int id, int islemciId, int anakartId, int ekranKartiId, int ramId) {
        this.id = id;
        this.islemciId = islemciId;
        this.anakartId = anakartId;
        this.ekranKartiId = ekranKartiId;
        this.ramId = ramId;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public int getIslemciId() {
        return islemciId;
    }

    public int getAnakartId() {
        return anakartId;
    }

    public int getEkranKartiId() {
        return ekranKartiId;
    }

    public int getRamId() {
        return ramId;
    }
}

//oyun sınıfı
class Oyun {
    // Sınıfın özel değişkenleri
    private int id;
    private String ad;
    private double gerekenIslemciHizi;
    private double gerekenAnakartPerformansi;
    private double gerekenEkranKartiPerformansi;
    private int gerekenRamKapasitesi;

    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public Oyun(int id, String ad, double gerekenIslemciHizi, double gerekenAnakartPerformansi, double gerekenEkranKartiPerformansi, int gerekenRamKapasitesi) {
        this.id = id;
        this.ad = ad;
        this.gerekenIslemciHizi = gerekenIslemciHizi;
        this.gerekenAnakartPerformansi = gerekenAnakartPerformansi;
        this.gerekenEkranKartiPerformansi = gerekenEkranKartiPerformansi;
        this.gerekenRamKapasitesi = gerekenRamKapasitesi;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public double getGerekenIslemciHizi() {
        return gerekenIslemciHizi;
    }

    public double getGerekenAnakartPerformansi() {
        return gerekenAnakartPerformansi;
    }

    public double getGerekenEkranKartiPerformansi() {
        return gerekenEkranKartiPerformansi;
    }

    public int getGerekenRamKapasitesi() {
        return gerekenRamKapasitesi;
    }
}

class Fatura {
    // Sınıfın özel değişkenleri
    private int id;
    private String urunAdi;
    private double tutar;
    private String odemeTarihi;

    // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
    public Fatura(int id, String urunAdi, double tutar) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.tutar = tutar;
        this.odemeTarihi = odemeTarihi;
    }

    // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
    public int getId() {
        return id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getTutar() {
        return tutar;
    }

    public String getOdemeTarihi() {
        return odemeTarihi;
    }
}

//Giris sınıfı
class GirisSistemi {
    //kullanicilar bu dosyaya kayıt olur
    static final String KULLANICI_DOSYASI = "kullanicilar.txt";
    static Scanner scanner = new Scanner(System.in);
    static List<Kullanici> kullanicilar = new ArrayList<>();
    //oturum açan kullanıcıyı tanır
    static Kullanici aktifKullanici = null;

    //kayıtlı kullanıcıları yukler
    static void kullanicilariYukle() {
        try (BufferedReader br = new BufferedReader(new FileReader(KULLANICI_DOSYASI))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                //virgül ile ayrılır
                String[] veri = satir.split(",");
                kullanicilar.add(new Kullanici(veri[0], veri[1], veri[2], veri[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Dosyada kullanıcılar kayıt eder
    static void kullanicilariKaydet() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(KULLANICI_DOSYASI))) {
            for (Kullanici kullanici : kullanicilar) {
                //kullanıcıdan alınan değerleri ',' ile ayırır ve kayıt eder
                bw.write(kullanici.getAd() + "," + kullanici.getSoyad() + "," + kullanici.getKullaniciAdi() + "," + kullanici.getSifre());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //program başlatıldığında çıkan ekran
    static void hosgeldinEkraniGoster() {
        int secim;
        //girişi kontrol eder
        boolean girisBasarili = false;
        do {
            System.out.println("1) Kayıt Ol");
            System.out.println("2) Giriş Yap");
            System.out.println("3) Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    kayitOl();
                    break;
                case 2:
                    //giriş başarılı ise giriş yapar
                    girisBasarili = girisYap();
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (secim != 3 && !girisBasarili); //giriş başarılı olana kadar döner
    }

    static void kayitOl() {
        System.out.print("Adınızı giriniz: ");
        String ad = scanner.nextLine();
        System.out.print("Soyadınızı giriniz: ");
        String soyad = scanner.nextLine();
        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        //kullaniciyi ekler
        kullanicilar.add(new Kullanici(ad, soyad, kullaniciAdi, sifre));
        kullanicilariKaydet();
        System.out.println("Kayıt başarıyla oluşturuldu.");
    }

    static boolean girisYap() {
        System.out.print("Kullanıcı adı: ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        for (Kullanici kullanici : kullanicilar) {
            //kullanıcı adı ve şifre eşlesmesini kontrol eder
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi) && kullanici.getSifre().equals(sifre)) {
                aktifKullanici = kullanici;
                System.out.println("Giriş başarılı! Hoş geldiniz, " + kullanici.getAd() + " " + kullanici.getSoyad() + ".");
                return true;
            }
        }
        System.out.println("Kullanıcı adı veya şifre hatalı.");
        return false;
    }

    //kullanıcı sınıfı
    static class Kullanici {
        //sınıfı özel değişkenleri
        private static int ID_SAYACI;
        private int id;
        private String ad;
        private String soyad;
        private String kullaniciAdi;
        private String sifre;

        // Yapıcı metot (constructor) sınıftan bir nesne oluşturulurken çağrılır
        Kullanici(String ad, String soyad, String kullaniciAdi, String sifre) {
            this.id = ++ID_SAYACI; //anısı var kardeşim
            this.ad = ad;
            this.soyad = soyad;
            this.kullaniciAdi = kullaniciAdi;
            this.sifre = sifre;
        }

        // Getter metotlar sınıfın özelliklerine dışarıdan erişim sağlar
        public String getAd() {
            return ad;
        }

        public String getSoyad() {
            return soyad;
        }

        public String getKullaniciAdi() {
            return kullaniciAdi;
        }

        public String getSifre() {
            return sifre;
        }
    }
}

public class Main {
    //listeler burada
    static List<Islemci> islemciler = new ArrayList<>();
    static List<Anakart> anakartlar = new ArrayList<>();
    static List<EkranKarti> ekranKartlari = new ArrayList<>();
    static List<Ram> ramler = new ArrayList<>();
    static List<HazirSistem> hazirSistemler = new ArrayList<>();
    static List<Oyun> oyunlar = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GirisSistemi.kullanicilariYukle();
        GirisSistemi.hosgeldinEkraniGoster();

        if (GirisSistemi.aktifKullanici != null) {
            dosyadanIslemcileriOku();
            dosyadanAnakartlariOku();
            dosyadanEkranKartlariniOku();
            dosyadanRamleriOku();
            dosyadanHazirSistemleriOku();
            dosyadanOyunlariOku();
            kullaniciArayuzunuGoster();
        }
        hazirSistemleriDosyayaYaz(); //program kapandıktan sonra hazır sistemleri kayıt eder.
    }

    static void dosyadanIslemcileriOku() {
        //dosyayı okur
        try (BufferedReader br = new BufferedReader(new FileReader("islemci.txt"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                //virgülle ayrılır
                String[] veri = satir.split(",");
                //islemcileri ekler
                islemciler.add(new Islemci(Integer.parseInt(veri[0]), veri[1], Double.parseDouble(veri[2]),
                        Integer.parseInt(veri[3]), Integer.parseInt(veri[4]), Double.parseDouble(veri[5])));
            }
        } catch (IOException e) {
            //hata olsada kod çalışır
            e.printStackTrace();
        }
    }

    static void dosyadanAnakartlariOku() {
        //dosyayı okur
        try (BufferedReader br = new BufferedReader(new FileReader("anakart.txt"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] veri = satir.split(",");
                anakartlar.add(new Anakart(Integer.parseInt(veri[0]), veri[1], Double.parseDouble(veri[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void dosyadanEkranKartlariniOku() {
        try (BufferedReader br = new BufferedReader(new FileReader("ekran_karti.txt"))) {
            String satir; // Dosyadan okunan her satırı tutar
            while ((satir = br.readLine()) != null) { // Dosya sonuna kadar satırları okur
                String[] veri = satir.split(","); //Virgülle ayır
                ekranKartlari.add(new EkranKarti(Integer.parseInt(veri[0]), veri[1], Double.parseDouble(veri[2])));
            }
        } catch (IOException e) { //hata yakalar
            e.printStackTrace(); // hata bulursa yazar
        }
    }

    private static void dosyadanRamleriOku() {
        try (BufferedReader br = new BufferedReader(new FileReader("ram.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) { // RAM dosyasında her satırda 4 alan olucak
                    int id = Integer.parseInt(fields[0]);
                    String model = fields[1];
                    int kapasite = Integer.parseInt(fields[2]);
                    int hiz = Integer.parseInt(fields[3]);
                    Ram ram = new Ram(id, model, kapasite, hiz);
                    ramler.add(ram);
                } else {
                    System.out.println("Hatalı satır: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void dosyadanHazirSistemleriOku() {
        try (BufferedReader br = new BufferedReader(new FileReader("hazir_sistem.txt"))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] veri = satir.split(",");
                hazirSistemler.add(new HazirSistem(Integer.parseInt(veri[0]), Integer.parseInt(veri[1]),
                        Integer.parseInt(veri[2]), Integer.parseInt(veri[3]), Integer.parseInt(veri[4])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dosyadanOyunlariOku() {
        try (BufferedReader br = new BufferedReader(new FileReader("oyunlar.txt"))) {
            String line;
            int idCounter = 1; // Otomatik olarak id değeri oluşturur
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) { // Oyun dosyasında id 4 alan olmalı
                    String isim = fields[0];
                    double minimumRam = Double.parseDouble(fields[1]);
                    double minimumIslemci = Double.parseDouble(fields[2]);
                    double minimumEkranKarti = Double.parseDouble(fields[3]);
                    Oyun oyun = new Oyun(idCounter, isim, minimumRam, minimumIslemci, (int) minimumEkranKarti, idCounter);
                    oyunlar.add(oyun);
                    idCounter++; // Her yeni oyun için id değerini artırma işlemi
                } else if (fields.length == 5) { // 5 alan olmalı (bileşenler)
                    int id = Integer.parseInt(fields[0]);
                    String isim = fields[1];
                    double minimumRam = Double.parseDouble(fields[2]);
                    double minimumIslemci = Double.parseDouble(fields[3]);
                    double minimumEkranKarti = Double.parseDouble(fields[4]);
                    Oyun oyun = new Oyun(id, isim, minimumRam, minimumIslemci, (int) minimumEkranKarti, id);
                    oyunlar.add(oyun);
                } else {
                    System.out.println("Hatalı satır: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void kullaniciArayuzunuGoster() {
        int secim;
        do {
            System.out.println("\n1) İşlemcileri Listele");
            System.out.println("2) Anakartları Listele");
            System.out.println("3) Ekran Kartlarını Listele");
            System.out.println("4) RAM'leri Listele");
            System.out.println("5) Hazır Sistemleri Listele");
            System.out.println("6) FPS Hesapla");
            System.out.println("7) Hazır Sistem Oluştur");
            System.out.println("8) Hazır Sistem Satın Al");
            System.out.println("9) Çıkış");
            System.out.print("Seçiminiz: ");
            secim = GirisSistemi.scanner.nextInt();
            GirisSistemi.scanner.nextLine();

            switch (secim) {
                case 1:
                    islemcileriListele();
                    break;
                case 2:
                    anakartlariListele();
                    break;
                case 3:
                    ekranKartlariniListele();
                    break;
                case 4:
                    ramleriListele();
                    break;
                case 5:
                    hazirSistemleriListele();
                    break;
                case 6:
                    fpsHesapla(hazirSistemler, oyunlar, islemciler, anakartlar, ekranKartlari);
                    break;
                case 7:
                    hazirSistemOlustur();
                    break;
                case 8:
                    hazirSistemSatınAl();
                    break;
                case 9:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (secim != 9);
    }

    static void islemcileriListele() {
        for (Islemci islemci : islemciler) {
            System.out.println("ID: " + islemci.getId() + ", Model: " + islemci.getModel() + ", Hız: " + islemci.getHiz()
                    + " GHz, Önbellek: " + islemci.getOnbellek() + " MB, Çekirdek: " + islemci.getCekirdek()
                    + ", Saat Hızı: " + islemci.getSaatHizi() + " GHz");
        }
    }

    static void anakartlariListele() {
        for (Anakart anakart : anakartlar) {
            System.out.println("ID: " + anakart.getId() + ", Model: " + anakart.getModel() + ", Bus Hızı: " + anakart.getBusSpeed() + " MHz");
        }
    }

    static void ekranKartlariniListele() {
        for (EkranKarti ekranKarti : ekranKartlari) {
            System.out.println("ID: " + ekranKarti.getId() + ", Model: " + ekranKarti.getModel() + ", Saat Hızı: " + ekranKarti.getSaatHizi() + " GHz");
        }
    }

    static void ramleriListele() {
        for (Ram ram : ramler) {
            System.out.println("ID: " + ram.getId() + ", Model: " + ram.getModel() + ", Kapasite: " + ram.getKapasite() + " GB, Hız: " + ram.getHiz() + " MHz");
        }
    }

    static void hazirSistemleriListele() {
        for (HazirSistem hazirSistem : hazirSistemler) {
            Islemci islemci = islemciler.stream().filter(i -> i.getId() == hazirSistem.getIslemciId()).findFirst().orElse(null);
            Anakart anakart = anakartlar.stream().filter(a -> a.getId() == hazirSistem.getAnakartId()).findFirst().orElse(null);
            EkranKarti ekranKarti = ekranKartlari.stream().filter(e -> e.getId() == hazirSistem.getEkranKartiId()).findFirst().orElse(null);
            Ram ram = ramler.stream().filter(r -> r.getId() == hazirSistem.getRamId()).findFirst().orElse(null);

            System.out.println("ID: " + hazirSistem.getId()
                    + ", İşlemci: " + (islemci != null ? islemci.getModel() : "Bilinmiyor")
                    + ", Anakart: " + (anakart != null ? anakart.getModel() : "Bilinmiyor")
                    + ", Ekran Kartı: " + (ekranKarti != null ? ekranKarti.getModel() : "Bilinmiyor")
                    + ", RAM: " + (ram != null ? ram.getModel() : "Bilinmiyor"));
        }
    }

    static void fpsHesapla(List<HazirSistem> hazirSistemler, List<Oyun> oyunlar, List<Islemci> islemciler, List<Anakart> anakartlar, List<EkranKarti> ekranKartlari) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FPS Hesaplama Ekranı");

        // Bütün hazır sistemleri listele
        System.out.println("Mevcut Hazır Sistemler:");
        for (HazirSistem hazirSistem : hazirSistemler) {
            Islemci islemci = islemciler.stream().filter(i -> i.getId() == hazirSistem.getIslemciId()).findFirst().orElse(null);
            Anakart anakart = anakartlar.stream().filter(a -> a.getId() == hazirSistem.getAnakartId()).findFirst().orElse(null);
            EkranKarti ekranKarti = ekranKartlari.stream().filter(e -> e.getId() == hazirSistem.getEkranKartiId()).findFirst().orElse(null);
            Ram ram = ramler.stream().filter(r -> r.getId() == hazirSistem.getRamId()).findFirst().orElse(null);

            //eğer bilinmiyor dönüyorsa o dosyada yoktur
            System.out.println("ID: " + hazirSistem.getId()
                    + ", İşlemci: " + (islemci != null ? islemci.getModel() : "Bilinmiyor")
                    + ", Anakart: " + (anakart != null ? anakart.getModel() : "Bilinmiyor")
                    + ", Ekran Kartı: " + (ekranKarti != null ? ekranKarti.getModel() : "Bilinmiyor")
                    + ", RAM: " + (ram != null ? ram.getModel() : "Bilinmiyor"));
        }

        System.out.print("Lütfen hazır sistem ID'sini seçin: ");
        int sistemId = scanner.nextInt();
        System.out.println("Mevcut Oyunlar:");
        for (int i = 0; i < oyunlar.size(); i++) {
            System.out.println((i+1) + ") " + oyunlar.get(i).getAd());
        }

        System.out.print("Lütfen oyunun numarasını seçin: ");
        int secilenOyunIndex = scanner.nextInt();

        if (secilenOyunIndex < 1 || secilenOyunIndex > oyunlar.size()) {
            System.out.println("Geçersiz oyun numarası!");
            return;
        }

        Oyun secilenOyun = oyunlar.get(secilenOyunIndex - 1); // 0 tabanlı indeks

        HazirSistem secilenSistem = hazirSistemler.stream().filter(s -> s.getId() == sistemId).findFirst().orElse(null);

        if (secilenSistem == null || secilenOyun == null) {
            System.out.println("Hatalı sistem ID veya oyun adı girdiniz!");
            return;
        }

        Islemci islemci = islemciler.stream().filter(i -> i.getId() == secilenSistem.getIslemciId()).findFirst().orElse(null);
        Anakart anakart = anakartlar.stream().filter(a -> a.getId() == secilenSistem.getAnakartId()).findFirst().orElse(null);
        EkranKarti ekranKarti = ekranKartlari.stream().filter(e -> e.getId() == secilenSistem.getEkranKartiId()).findFirst().orElse(null);

        if (islemci == null || anakart == null || ekranKarti == null) {
            System.out.println("Sistem bileşenleri bulunamadı!");
            return;
        }

        double fps = 0;
        if (islemci.getHiz() >= secilenOyun.getGerekenIslemciHizi() && anakart.getBusSpeed() >= secilenOyun.getGerekenAnakartPerformansi() && ekranKarti.getSaatHizi() >= secilenOyun.getGerekenEkranKartiPerformansi()) {
            fps = 60;
        } else {
            fps = 30;
        }
        System.out.println("Oyun için tahmini FPS: " + fps);
    }

    static void oyunlariListele() {
        for (Oyun oyun : oyunlar) {
            System.out.println("ID: " + oyun.getId() + ", Oyun: " + oyun.getAd());
        }
    }

    static void hazirSistemOlustur() {
        System.out.println("Mevcut İşlemciler");
        for (Islemci islemci : islemciler) {
            System.out.println("ID: " + islemci.getId() + ", Model: " + islemci.getModel());
        }
        System.out.print("İşlemci ID: ");
        int islemciId = GirisSistemi.scanner.nextInt();

        System.out.println("Mevcut Anakartlar");
        for (Anakart anakart : anakartlar) {
            System.out.println("ID: " + anakart.getId() + ", Model: " + anakart.getModel());
        }
        System.out.print("Anakart ID: ");
        int anakartId = GirisSistemi.scanner.nextInt();

        System.out.println("Mevcut Ekran Kartları");
        for (EkranKarti ekranKarti : ekranKartlari) {
            System.out.println("ID: " + ekranKarti.getId() + ", Model: " + ekranKarti.getModel());
        }
        System.out.print("Ekran Kartı ID: ");
        int ekranKartiId = GirisSistemi.scanner.nextInt();

        System.out.println("Mevcut RAM'ler");
        for (Ram ram : ramler) {
            System.out.println("ID: " + ram.getId() + ", Model: " + ram.getModel());
        }
        System.out.print("RAM ID: ");
        int ramId = GirisSistemi.scanner.nextInt();

        HazirSistem hazirSistem = new HazirSistem(hazirSistemler.size() + 1, islemciId, anakartId, ekranKartiId, ramId);
        hazirSistemler.add(hazirSistem);
        hazirSistemEkle(hazirSistem); // hazır sistemi dosyaya ekle
        System.out.println("Hazır sistem başarıyla oluşturuldu");
    }

    static void hazirSistemSatınAl() {
        System.out.println("Mevcut Hazır Sistemler:");
        for (HazirSistem hazirSistem : hazirSistemler) {
            Islemci islemci = islemciler.stream().filter(i -> i.getId() == hazirSistem.getIslemciId()).findFirst().orElse(null);
            Anakart anakart = anakartlar.stream().filter(a -> a.getId() == hazirSistem.getAnakartId()).findFirst().orElse(null);
            EkranKarti ekranKarti = ekranKartlari.stream().filter(e -> e.getId() == hazirSistem.getEkranKartiId()).findFirst().orElse(null);
            Ram ram = ramler.stream().filter(r -> r.getId() == hazirSistem.getRamId()).findFirst().orElse(null);

            System.out.println("ID: " + hazirSistem.getId()
                    + ", İşlemci: " + (islemci != null ? islemci.getModel() : "Bilinmiyor")
                    + ", Anakart: " + (anakart != null ? anakart.getModel() : "Bilinmiyor")
                    + ", Ekran Kartı: " + (ekranKarti != null ? ekranKarti.getModel() : "Bilinmiyor")
                    + ", RAM: " + (ram != null ? ram.getModel() : "Bilinmiyor"));
        }

        System.out.print("Satın almak istediğiniz hazır sistemin ID'sini giriniz: ");
        int sistemId = scanner.nextInt();

        HazirSistem hazirSistem = hazirSistemler.stream().filter(hs -> hs.getId() == sistemId).findFirst().orElse(null);

        if (hazirSistem == null) {
            System.out.println("Hazır sistem bulunamadı.");
            return;
        }

        double fiyat = hesaplaFiyat(hazirSistem); // Hesaplama işlemi

        System.out.println("Hazır sistem fiyatı: " + fiyat + " TL");

        System.out.print("Ödeme yapmak için 'Evet' veya 'Hayır' yazın: ");
        String onay = scanner.next();

        if (onay.equalsIgnoreCase("Evet")) {
            System.out.println("Ödeme yöntemleri:");
            System.out.println("1) Nakit");
            System.out.println("2) Kredi Kartı");
            System.out.print("Ödeme yönteminizi seçin: ");
            int odemeYontemi = scanner.nextInt();

            if (odemeYontemi == 1 || odemeYontemi == 2) {
                hazirSistemler.remove(hazirSistem);
                System.out.println("Hazır sistem başarıyla satın alındı.");

                // Fatura çıkartır
                Fatura fatura = new Fatura(1, "Hazır Sistem", fiyat);
                System.out.println("Fatura:");
                System.out.println("ID: " + fatura.getId());
                System.out.println("Ürün Adı: " + fatura.getUrunAdi());
                System.out.println("Tutar: " + fatura.getTutar() + " TL");
            } else {
                System.out.println("Geçersiz ödeme yöntemi seçimi.");
            }
        } else if (onay.equalsIgnoreCase("Hayır")) {
            System.out.println("Ödeme iptal edildi");
        } else {
            System.out.println("Geçersiz seçim.");
        }
    }

    static double hesaplaFiyat(HazirSistem hazirSistem) {
        // hesaplama işlemnini bileşese göre yapıyor
        Islemci islemci = islemciler.stream().filter(i -> i.getId() == hazirSistem.getIslemciId()).findFirst().orElse(null);
        Anakart anakart = anakartlar.stream().filter(a -> a.getId() == hazirSistem.getAnakartId()).findFirst().orElse(null);
        EkranKarti ekranKarti = ekranKartlari.stream().filter(e -> e.getId() == hazirSistem.getEkranKartiId()).findFirst().orElse(null);
        Ram ram = ramler.stream().filter(r -> r.getId() == hazirSistem.getRamId()).findFirst().orElse(null);

        double fiyat = 0;
        if (islemci != null) fiyat += islemci.getHiz() * 10;  //fiyatlar burada hesaplanıyor
        if (anakart != null) fiyat += anakart.getBusSpeed() * 20;
        if (ekranKarti != null) fiyat += ekranKarti.getSaatHizi() * 20;
        if (ram != null) fiyat += ram.getKapasite() * 20;

        return fiyat;
    }

    static void hazirSistemleriDosyayaYaz() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hazir_sistem.txt"))) {
            for (HazirSistem hazirSistem : hazirSistemler) {
                writer.write(hazirSistem.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void hazirSistemEkle(HazirSistem hazirSistem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hazir_sistem.txt", true))) {
            writer.write(hazirSistem.getId() + "," + hazirSistem.getIslemciId() + "," + hazirSistem.getAnakartId()
                    + "," + hazirSistem.getEkranKartiId() + "," + hazirSistem.getRamId());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



