import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Mükemmel olup olmadığını öğrenmek istediğiniz sayıyı giriniz : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sayac = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sayac += i;
            }
        }
        if (number == sayac) {
            System.out.println("Sayınız mükemmel bir sayıdır.");
        } else {
            System.out.println("Sayınız mükemmel bir sayı değildir.");
        }
    }
}