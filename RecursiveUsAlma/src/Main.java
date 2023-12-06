import java.util.Scanner;

public class Main {
    static int usAlma(int a,int b){
        int gecici=a;
        if (b == 0) {
            System.out.println("Sayının sıfırıncı üssü 1 e eşittir.");
            return 1;
        } else if (a==1) {
            System.out.println("1 sayısının üstleri daima 1 dir.");
        }
        int sonuc=1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.println(gecici+" Sayısının "+b+".üsstü : "+sonuc);
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üst almak istediğiniz taban sayısını giriniz : ");
        int a=input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b=input.nextInt();
        usAlma(a,b);

    }
}