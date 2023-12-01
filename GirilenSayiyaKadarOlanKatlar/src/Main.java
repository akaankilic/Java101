import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba Bir Sayı Giriniz..");
        Scanner input=new Scanner(System.in);
        int sayi1=input.nextInt();
        System.out.println("Girdiğiniz Sayıya Kadar Olan 5'in Katları");
        for (int k = 1;k<=sayi1;k*=5){
            System.out.println(k);
        }
        System.out.println("Girdiğiniz Sayıya Kadar Olan 4'ün Katları");
        for (int i=1;i<=sayi1;i*=4){
            System.out.println(i);
        }
    }
}