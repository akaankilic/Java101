import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, islem;
        System.out.println("Hesaplamak istediğiniz ilk sayıyı giriniz");
        sayi1 = input.nextInt();
        System.out.println("Hesaplamak istediğiniz ikinci sayıyı giriniz");
        sayi2 = input.nextInt();
        System.out.println("***********");
        System.out.println("Lütfen Yapmak İstediğiniz İşlem Numarasını Giriniz..");
        System.out.println("**1-Toplama**\n**2-Çıkarma**\n**3-Çarpma**\n**4-Bölme**");
        islem = input.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Sayıların toplamı = " + sayi1 + sayi2);
                break;
            case 2:
                System.out.println("Sayıların farkı  = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sayıların çarpımı = " + sayi1 * sayi2);
                break;
            case 4:
                System.out.println("Sayıların bölümü = " + sayi1 / sayi2);
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız...");
        }

    }
}