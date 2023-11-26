import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,turkce,fizik,kimya,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz: ");
        matematik=input.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce=input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik=input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya=input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih=input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik=input.nextInt();
        double toplam=(matematik+turkce+tarih+kimya+fizik+muzik);
        double ortalama=(toplam/6.0);
        System.out.println("Ortalamanız = "+ortalama);
        System.out.println(ortalama < 60 ? "Sınıfı geçemediniz..." : "Tebrikler Sınıfı Geçtiniz..");




    }
}