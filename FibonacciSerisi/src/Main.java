import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        System.out.println("***");
        System.out.println("*Kaç elemanlı bir fibonacci serisi istiyorsunuz*");
        Scanner input = new Scanner(System.in);
        int fib = 0, degisken = 1, gecici, b;
        int a = input.nextInt();
        b = 1;
        System.out.println("İlk Sayı = 0\n" + fib + " + " + degisken + " = " + b);
        for (int i = 1; i < a; ++i) {
            gecici = degisken + fib;
            System.out.println(fib + " + " + degisken + " = " + gecici + " ");
            fib = degisken;
            degisken = gecici;
        }
    }
}