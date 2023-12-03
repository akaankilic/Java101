import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kaç adet sayı karşılaştırılacak");
        Scanner input = new Scanner(System.in);
        int sayilar = input.nextInt();
        System.out.println(" ilk sayıyı giriniz ");
        int sayi = input.nextInt();
        int maxValue = sayi;
        int minValue = sayi;
        for (int i = 1; i < sayilar; i++) {
            System.out.println((i + 1) + ". Sayıyı giriniz");
            sayi = input.nextInt();
            if (sayi < minValue) {
                minValue = sayi;
            }
            if (sayi > maxValue) {
                maxValue = sayi;
            }
        }
        System.out.println("Girdiğiniz Sayıların En Büyüğü = " + maxValue);
        System.out.println("Girdiğiniz Sayıların En Küçüğü = " + minValue);
    }
}
