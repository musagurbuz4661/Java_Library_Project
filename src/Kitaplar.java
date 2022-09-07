import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Kitaplar {
   public static Set<Map.Entry<Integer, String>> kitapListesiYazdir = kitaplar().entrySet();

    public static Map<Integer, String> kitaplar() {
        Map<Integer, String> kitapList = new TreeMap<>();
        kitapList.put(1001, "Da Vinci Sifresi, Dan Brown, Roman, 160");
        kitapList.put(1002, "Melekler ve Seytanlar, Dan Brown, Roman, 160");
        kitapList.put(1003, "Cehennem, Dan Brown, Roman, 155");
        kitapList.put(1004, "Kayip Sembol, Dan Brown, Roman, 150");
        kitapList.put(1005, "Baslangic, Dan Brown, Roman, 220");
        kitapList.put(1006, "Dijital Kale, Dan Brown, Roman, 160");
        kitapList.put(1007, "Ihanet Noktasi, Dan Brown, Roman, 180");
        kitapList.put(1009, "Seker Portakali, Vasconcelos, Klasik, 95");
        kitapList.put(1010, "Simyaci, Paulo Coelho, Roman, 160");
        kitapList.put(1011, "Hayvan Cifligi, George Orwell, Klasik, 90");
        kitapList.put(1012, "Kurk Mantolu Madonna, Dan Brown, Klasik, 55");
        kitapList.put(1013, "Savasci, Dogan Cuceloglu, Egitim, 105");
        kitapList.put(1014, "Ogretmen olmak, Dogan Cuceloglu, Egitim, 112");
        kitapList.put(1015, "Evlenmeden Once, Dogan Cuceloglu, Egitim, 38");
        kitapList.put(1016, "Var Misin?, Dogan Cuceloglu, Egitim, 101");
        kitapList.put(1017, "Uzaya Giden Tren, Mert Karik, Cocuk, 75");
        kitapList.put(1018, "Benim Zurefam Ucabilir, MertArik, Cocuk, 45");
        kitapList.put(1019, "Yaz Tatili, Varol Yasaroglu, Cocuk, 67");
        kitapList.put(1020, "Bilim Cocuk, Tubitak, Dergi, 78");
        kitapList.put(1022, "PC Net, Net yayin, Dergi, 78");
        kitapList.put(1023, "Bilimci, Tubitak, Dergi, 87");
        return kitapList;
    }

    public static void kitapListesi() {


        System.out.println( Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK +" KitapNo  " + "   Kitap Adi" + "                Yazar Adi" + "         Kitap Turu" + "   Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);

        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            System.out.printf("  %-5d      %-25.25s%-15s   %-7s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
        }
    }

    public static void klasikKitaplar() {
        System.out.println( Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK +" KitapNo  " + "   Kitap Adi" + "                Yazar Adi" + "         Kitap Turu" + "   Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            if (eachValueArray[2].equals("Klasik")) {
                System.out.printf("  %-5d      %-25.25s%-15s   %-7s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
        }
    }
    public static void Romanlar() {
        System.out.println( Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK +" KitapNo  " + "   Kitap Adi" + "                Yazar Adi" + "         Kitap Turu" + "   Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            if (eachValueArray[2].equals("Roman")) {
                System.out.printf("  %-5d      %-25.25s%-15s   %-7s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
        }
    }


    public static void Cocukkitaplari() {
        System.out.println( Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK +" KitapNo  " + "   Kitap Adi" + "                Yazar Adi" + "         Kitap Turu" + "   Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            if (eachValueArray[2].equals("Cocuk")) {
                System.out.printf("  %-5d      %-25.25s%-15s   %-7s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
        }
    }

    public static void Egitimkitaplari() {
        System.out.println( Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK +" KitapNo  " + "   Kitap Adi" + "                Yazar Adi" + "         Kitap Turu" + "   Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            if (eachValueArray[2].equals("Egitim")) {
                System.out.printf("  %-5d      %-25.25s%-15s   %-7s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
        }
    }

    public static void Dergiler() {
        System.out.println( Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK +" KitapNo  " + "   Kitap Adi" + "                Yazar Adi" + "         Kitap Turu" + "   Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===========================================================================" + Renklendirme.ANSI_RESET);
        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            if (eachValueArray[2].equals("Dergi")) {
                System.out.printf("  %-5d      %-25.25s%-15s   %-7s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
        }
    }
}
