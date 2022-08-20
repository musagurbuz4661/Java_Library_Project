import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    static String secim;

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
        secim = scan.next();
        switch (secim) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                Kitaplar.bolumler();
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
