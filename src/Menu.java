import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void Menu() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_YELLOW + "========================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "======== WELCOME TO BOOK WORLD =========" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW + "========================================" + Renklendirme.ANSI_RESET);

        System.out.println("1 -->  Tum Kitap Listesi");
        System.out.println("2 -->  Klasik Kitaplar");
        System.out.println("3 -->  Romanlar");
        System.out.println("4 -->  Hikayeler");
        System.out.println("5 -->  Cocuk kitaplari");
        System.out.println("6 -->  Egitim kitaplari");
        System.out.println("7 -->  Dergiler");

        System.out.println("8 -->  CIKIS");

        System.out.println(Renklendirme.ANSI_YELLOW + "========================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_GREEN + "Hangi bolume gitmek istersiniz : " + Renklendirme.ANSI_RESET);
        String secim = scan.next();
        switch (secim) {
            case "1":
                Kitaplar.kitapListesi();
                break;
            case "2":
                Kitaplar.klasikKitaplar();
                Sepet.Sepet();
                Sepet.sepetToplam();
                break;
            case "3":
                Kitaplar.Romanlar();
                Sepet.Sepet();
                Sepet.sepetToplam();
                break;
            case "4":
                //  Kitaplar.Hikayeler();
                break;
            case "5":
                Kitaplar.Cocukkitaplari();
                Sepet.Sepet();
                Sepet.sepetToplam();
                break;
            case "6":
                Kitaplar.Egitimkitaplari();
                Sepet.Sepet();
                Sepet.sepetToplam();
                break;
            case "7":
                Kitaplar.Dergiler();
                Sepet.Sepet();
                Sepet.sepetToplam();
                break;
            case "8":
                Sepet.cikis();
                break;
            default:
                System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "     Gecerli bir bolum seciniz     " + Renklendirme.ANSI_RESET);
                Thread.sleep(3000);
                Menu();
                break;


        }
    }
}
