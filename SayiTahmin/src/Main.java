import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sayı Tahmin oyununa Hoş geldiniz");
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int hak=0;
        int value=r.nextInt(100);
        int veri;
        int[] hata=new int[5];
        boolean isWrong=false;
        boolean isWin=false;
        while (hak<5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            veri=s.nextInt();
            if (veri<0||veri>100){
                System.out.println("Lütfen 0-100 aralığında bir sayı giriniz.");
                if (isWrong) {
                    hak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - hak));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (veri == value) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + value);
                isWin = true;
                break;
            } else {
                System.out.println("Bilemediniz bir sayı girdiniz !");
                if (veri > value) {
                    System.out.println(veri + " sayısı, gizli sayıdan büyüktür.");
                    System.out.println("====================");
                } else {
                    System.out.println(veri + " sayısı, gizli sayıdan küçüktür.");
                    System.out.println("====================");
                }

                hata[hak++] = veri;
                System.out.println("Kalan hakkı : " + (5 - hak));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Doğru Sayı : "+value);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(hata));
            }
        }

    }
}