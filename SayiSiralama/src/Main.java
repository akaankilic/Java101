import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sıralamak İstediğiniz Sayıları Giriniz..");
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("1.Sayınız =");
        a = input.nextInt();
        System.out.println("2.Sayınız =");
        b = input.nextInt();
        System.out.println("3.Sayınız =");
        c = input.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("En Büyük Sayı = " + a);
            if (b > c) {
                System.out.println("Ortanca Sayı =" + b + " ve son sayı = " + c);
            } else {
                System.out.println("Ortanca Sayı =" + c + " ve son sayı = " + b);
            }

        } else if ((b > a) && (b > c)) {
            System.out.println("En Büyük Sayı = " + b);
            if (a > c) {
                System.out.println("Ortanca Sayı =" + a + " ve son sayı = " + c);
            } else {
                System.out.println("Ortanca Sayı =" + c + " ve son sayı = " + a);
            }
        } else if ((c > a) && (c > b)) {
            System.out.println("En Büyük Sayı = " + c);
            if (a > b) {
                System.out.println("Ortanca Sayı =" + a + " ve son sayı = " + b);
            } else {
                System.out.println("Ortanca Sayı =" + b + " ve son sayı = " + a);
            }
        }
    }
}