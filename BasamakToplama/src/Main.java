import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basamaklarını toplamak isteğiniz sayıyı giriniz...");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int basamakToplam=0,basamak=0;
        while(number!=0){
            basamak=number%10;
            number=number/10;
            basamakToplam+=basamak;
        }
        System.out.println("Girdiğiniz sayının basamaklarının toplamı = "+basamakToplam);
    }
}