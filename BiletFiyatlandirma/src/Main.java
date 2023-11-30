import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Hoşgeldiniz***");
        Scanner input = new Scanner(System.in);
        System.out.println("Yolculuk yapmak istediğiniz uzaklığı KM cinsinden giriniz..");
        int yol, yas, yolculukTipi;
        yol = input.nextInt();
        System.out.println("Lütfen yaşınızı giriniz...");
        yas = input.nextInt();
        double normalTutar = yol * 0.1;
        double yasİndirimliTutar = 0;
        double fiyat = 0;

        if (yas <= 12) {
            yasİndirimliTutar = normalTutar - (normalTutar * 0.5);
            fiyat = normalTutar - yasİndirimliTutar;
        } else if ((yas > 12) && (yas <= 24)) {
            yasİndirimliTutar = normalTutar - (normalTutar * 0.1);
            fiyat = normalTutar - yasİndirimliTutar;
        } else if (yas > 65) {
            yasİndirimliTutar = normalTutar - (normalTutar * 0.3);
            fiyat = normalTutar - yasİndirimliTutar;
        } else if (yas < 0) {
            System.out.println("Hatalı yaş bilgisi girdiniz..");
        } else ;

        System.out.println("Yaş indirim tutarı = " + fiyat);
        System.out.println("Lütfen bilet tipinizi belirtiniz..\nTek yön-->1\nGidiş-dönüş-->2");
        yolculukTipi = input.nextInt();
        double biletİndirimi=0;
        double toplamTutar=0;
        if (yolculukTipi == 2) {
            biletİndirimi = ((normalTutar-fiyat) * 0.2);
            toplamTutar = ((normalTutar-fiyat)-biletİndirimi)* 2;
            System.out.println("Ödemeniz gereken tutar = "+toplamTutar);
        } else if ((yolculukTipi > 2) && (yolculukTipi < 1)) {
            System.out.println("Hatalı bilet tipi seçtiniz...");
        } else if (yolculukTipi == 1) {
            System.out.println("Ödemeniz gereken tutar = "+(normalTutar-fiyat));
        }


    }
}