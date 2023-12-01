import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Hoşgeldiniz----");
        Scanner input = new Scanner(System.in);
        System.out.println("**Bir Sayı Giriniz**");
        int sayi1 = input.nextInt();
        int sayac = 0;
        if (sayi1 % 2 == 0) {
            while (sayi1 % 2 == 0 && sayi1 % 4 == 0) {
                sayac += sayi1;
                System.out.println("Yeni Bir Sayı Giriniz ");
                sayi1 = input.nextInt();
            }
        } else {
            System.out.println("Tek Sayı Girdiniz\nGirdiğiniz Sayı = " + sayi1);
        }
        System.out.println("Girdiğiniz çift ve 4 ün katı olan sayıların toplamı = " + sayac);
    }
}
