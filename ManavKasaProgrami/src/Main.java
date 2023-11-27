import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Manavımıza Hoş Geldiniz..");
        Scanner input=new Scanner(System.in);
        System.out.println("Manavımızdaki taze ürünlerimiz ve fiyatları aşağıdaki gibidir..");
        System.out.println("Armut = 2,14 TL");
        System.out.println("Elma = 3,67 TL");
        System.out.println("Domates = 1,11 TL");
        System.out.println("Muz = 0,95 TL");
        System.out.println("Patlıcan = 5,00 TL");
        System.out.println("Kaç kilo armut almak istersiniz = ");
        double armut=input.nextDouble();
        System.out.println("Kaç kilo elme almak istersiniz = ");
        double elma=input.nextDouble();
        System.out.println("Kaç kilo domates almak istersiniz = ");
        double domates=input.nextDouble();
        System.out.println("Kaç kilo muz almak istersiniz = ");
        double muz=input.nextDouble();
        System.out.println("Kaç kilo patlıcan almak istersiniz = ");
        double patlican=input.nextDouble();
        double toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
        System.out.println("Ödemeniz gereken toplam tutar = "+toplam );


    }
}