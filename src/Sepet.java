import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sepet {
    static int toplamUcret;
    static Scanner scan = new Scanner(System.in);
    static List<String> toplamUcretList = new ArrayList<String>();
    public static Thread Tread;

    public static void Sepet() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_GREEN + "Almak istediginiz kitapNo giriniz : " + Renklendirme.ANSI_RESET);
        int giris = scan.nextInt();
        boolean flag = true;
        for (Map.Entry<Integer, String> each : Kitaplar.kitapListesiYazdir) {
            String eachValue = each.getValue();
            Integer eachKey = each.getKey();
            String[] eachArr = eachValue.split(", ");
            if (eachKey == giris) {
                toplamUcretList.add(eachArr[3]);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(Renklendirme.ANSI_RED + "Girdiginiz numaraya ait bir Kitap Numarasi bulunamadi" + Renklendirme.ANSI_RESET);
            Tread.sleep(3000);
            Sepet();
        }
    }

    public static void sepetToplam() throws InterruptedException {
        for (int i = 0; i < toplamUcretList.size(); i++) {
            toplamUcret += Integer.parseInt(toplamUcretList.get(i));
            toplamUcretList.remove(i);
        }boolean flag = true;
        System.out.println(Renklendirme.ANSI_GREEN + "Satin almaya devam etmek istermisiniz" + Renklendirme.ANSI_YELLOW + " 'Evet' / 'Hayir'" + Renklendirme.ANSI_RESET);
        String secim = scan.next();


            if (secim.equalsIgnoreCase("E") || secim.equalsIgnoreCase("evet")) {
                flag=false;
                Menu.Menu();
            }
            if (secim.equalsIgnoreCase("H") || secim.equalsIgnoreCase("Hayir")) {
               flag = false;
                System.out.println("1 Odemeyi yapmak");
                System.out.println("2 sepetimi iptal et");
                System.out.println("3 Ana menuye geri don");

                System.out.println(Renklendirme.ANSI_GREEN + "Yapmak istediginiz islemi seciniz : " + Renklendirme.ANSI_RESET);
                String secim1 = scan.next();
                switch (secim1) {
                    case "1":
                        odeme();
                        break;
                    case "2":
                        islemIptal();
                        break;
                    case "3":
                        Menu.Menu();
                        break;
                    default:
                        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "     Gecerli bir bolum seciniz     " + Renklendirme.ANSI_RESET);
                        break;

                }
            }
            if (flag){
                System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "     Lutfen 'Evet' veya 'Hayir' seciniz     " + Renklendirme.ANSI_RESET);
                sepetToplam();
            }
        }

    public static void odeme() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_YELLOW + "==================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "Toplam odenecek tutar : " + toplamUcret + "$" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "odemeniz basirili bir sekilde gerceklestirlmistir Tesekkur ederiz" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "==================================================================" + Renklendirme.ANSI_RESET);
        System.out.println();
        toplamUcret = 0;
        Thread.sleep(2000);
        Menu.Menu();
    }

    public static void islemIptal() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "islemleriniz iptal edilmistir" + Renklendirme.ANSI_RESET);
        Thread Tread;
        Thread.sleep(2000);
        toplamUcret = 0;
        Menu.Menu();
    }

    public static void cikis() throws InterruptedException {
        if (toplamUcret == 0) {
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "===================================================================" + Renklendirme.ANSI_RESET);
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + " Cikisiniz basarili bir sekilde gerceklesmistir iyi gunler dileriz " + Renklendirme.ANSI_RESET);
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "===================================================================" + Renklendirme.ANSI_RESET);
        } else {
            odeme();
        }

    }
}
