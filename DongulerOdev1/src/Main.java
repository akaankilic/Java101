import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir Sayı Giriniz");
        Scanner input=new Scanner(System.in);
        int sayi1=input.nextInt();
        int sayac=0,toplam=0;
        for (int i=0;i<=sayi1;i++){
            if ( i%4==0&&i%3==0){
                toplam+=i;
                sayac++;
            }
        }
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e " +
                "tam bölünen sayıların ortalaması "+(toplam/(sayac-1)));
    }
}