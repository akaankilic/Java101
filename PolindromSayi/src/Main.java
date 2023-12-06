import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Hangi sayıyı kontrol etmek istiyorsunuz : ");
        int a=input.nextInt();

        isPolindrom(a);


    }
    static boolean isPolindrom(int a){
        int gecici=a,sonSayi,tersSayi=0;
        while (gecici!=0){
            sonSayi=gecici%10;
            tersSayi=(tersSayi*10)+sonSayi;
            gecici/=10;
        }
        if (tersSayi==a){
            System.out.print("Girdiğiniz Sayı Polindrom Bir Sayıdır");
        }else {
            System.out.println("Girdiğiniz Sayı Polindrom Bir Sayı Değildir");
        }


        return true;
    }

}