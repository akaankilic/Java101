import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sıralamak İstediğiniz Sayıları Giriniz..");
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int enBuyuk, ortanca;
        System.out.println("1.Sayınız =");
        a = input.nextInt();
        System.out.println("2.Sayınız =");
        b = input.nextInt();
        System.out.println("3.Sayınız =");
        c = input.nextInt();
        if ((a > b) && (a > c)) {
            enBuyuk = a;
            System.out.println("En Büyük Sayı = " + a);
            if (b > c) {
                ortanca = b;
                System.out.println("Ortanca Sayı =" + b + " ve son sayı = " + c);
            } else {
                ortanca = c;
                System.out.println("Ortanca Sayı =" + c + " ve son sayı = " + b);
            }

        } else if ((b > a) && (b > c)) {
            enBuyuk = b;
            System.out.println("En Büyük Sayı = " + b);
            if (a > c) {
                ortanca = a;
                System.out.println("Ortanca Sayı =" + a + " ve son sayı = " + c);
            } else {
                ortanca = c;
                System.out.println("Ortanca Sayı =" + c + " ve son sayı = " + a);
            }
        } else if ((c > a) && (c > b)) {
            enBuyuk = c;
            System.out.println("En Büyük Sayı = " + b);
            if (a > b) {
                ortanca = a;
                System.out.println("Ortanca Sayı =" + a + " ve son sayı = " + b);
            } else {
                ortanca = b;
                System.out.println("Ortanca Sayı =" + b + " ve son sayı = " + a);
            }
        }
    }
}