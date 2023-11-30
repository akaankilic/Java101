
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Burc Öğrenme Sistemine Hoşgeldiniz...***");
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğduğunuz Ayı 1-12 arasında sayı olarak giriniz..");
        int ay = input.nextInt();

        System.out.println("Lütfen doğduğunuz günü 1-31 arasında sayı olarak giriniz..");
        int gun = input.nextInt();
        String ayisim = getAyisim(ay);

        if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            System.out.println( ayisim +" Ayının " + gun + ". Günü Doğanlar Kova Burcuna Aittir");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Balık Burcuna Aittir");
        } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Koç Burcuna Aittir");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Boğa Burcuna Aittir");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar İkizler Burcuna Aittir");
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Yengeç Burcuna Aittir");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Aslan Burcuna Aittir");
        } else if ((ay == 8 && gun >= 22) || (ay == 9 && gun <= 22)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Başak Burcuna Aittir");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 23)) {
            System.out.println(ayisim+" Ayının "+ gun + ". Günü Doğanlar Terazi Burcuna Aittir");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Akrep Burcuna Aittir");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Yay Burcuna Aittir");
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 19)) {
            System.out.println(ayisim+" Ayının " + gun + ". Günü Doğanlar Oğlak Burcuna Aittir");
        }
    }

    private static String getAyisim(int ay) {
        String ayisim = null;
        if (ay ==1){
            ayisim="Ocak";
        } else if (ay ==2) {
            ayisim="Şubat";

        }else if (ay ==3) {
            ayisim="Mart";

        }else if (ay ==4) {
            ayisim="Nisan";

        }else if (ay ==5) {
            ayisim="Mayıs";

        }else if (ay ==6) {
            ayisim="Haziran";

        }else if (ay ==7) {
            ayisim="Temmuz";

        }else if (ay ==8) {
            ayisim="Ağustos";

        }else if (ay ==9) {
            ayisim="Eylül";

        }else if (ay ==10) {
            ayisim="Ekim";

        }else if (ay ==11) {
            ayisim="Kasım";

        }else if (ay ==12) {
            ayisim="Aralık";

        }
        return ayisim;
    }
}