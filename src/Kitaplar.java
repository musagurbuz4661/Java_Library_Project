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
        kitapList.put(1024, "Gocmus Kediler Bahcesi, Bilge Karasu, Hikaye, 35");
        kitapList.put(1025, "Memleket Hikayeleri, Refik Halit Karay, Hikaye, 45");
        kitapList.put(1026, "Ay isiginda Caliskur, Haldun Taner, Hikaye, 55");
        return kitapList;
    }



    public static void bolumler() {
        System.out.println(Renklendirme.ANSI_YELLOW + "===================================================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "  KitapNo  " + "  Kitap Adi" + "                Yazar Adi" + "              Kitap Turu" + "      Fiyat " + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "===================================================================================" + Renklendirme.ANSI_RESET);
        for (Map.Entry<Integer, String> each : kitapListesiYazdir) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArray = eachValue.split(", ");
            if (Menu.secim.equals("1")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
            if (Menu.secim.equals("2") && eachValueArray[2].equals("Klasik")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
            if (Menu.secim.equals("3") && eachValueArray[2].equals("Roman")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
            if (Menu.secim.equals("4") && eachValueArray[2].equals("Hikaye")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
            if (Menu.secim.equals("5") && eachValueArray[2].equals("Cocuk")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
            if (Menu.secim.equals("6") && eachValueArray[2].equals("Egitim")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }
            if (Menu.secim.equals("7") && eachValueArray[2].equals("Dergi")) {
                System.out.printf("  %-5d      %-25.25s%-20s   %-10s      %s\n", eachKey, eachValueArray[0], eachValueArray[1], eachValueArray[2], eachValueArray[3]);
            }

        }
    }
}
