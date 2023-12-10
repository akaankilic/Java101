import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("**Mayın Tarlasına Hoşgeldin.**");
        System.out.println("Oynamak istediğiniz genişlik ve uzunluğu giriniz\n==================================");
        System.out.print("Uzunluk : ");
        int row= input.nextInt();
        System.out.print("Genişlik : ");
        int col=input.nextInt();
        MineSweeper mayin=new MineSweeper(row,col);
        mayin.run();



    }
}