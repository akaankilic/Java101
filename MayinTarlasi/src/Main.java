import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("**Mayın Tarlasına Hoşgeldin.**");
        System.out.println("Oynamak istediğiniz genişlik ve uzunluğu giriniz\n==================================");
        System.out.print("Uzunluk : ");
        int satir= input.nextInt();
        System.out.print("Genişlik : ");
        int sutun=input.nextInt();
        System.out.println("===============================");
        MineSweeper mayin=new MineSweeper(satir,sutun);
        mayin.run();



    }
}