import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen Ders Notlarınızı Giriniz..");
        Scanner input=new Scanner(System.in);
        int mat,turkce,muzik,kimya,fizik;
        double ortalama;
        System.out.println("Matematik notunuzu giriniz");
        mat=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        turkce=input.nextInt();
        System.out.println("Muzik notunuzu giriniz");
        muzik=input.nextInt();
        System.out.println("Fizik notunuzu giriniz");
        fizik=input.nextInt();
        System.out.println("Kimya notunuzu giriniz");
        kimya=input.nextInt();
        ortalama=(mat+muzik+turkce+kimya+fizik)/5;
        if (ortalama<=55){
            System.out.println("Maselef Sınıf Tekrarı...\nNot ortalamanız ="+ortalama);
        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz...\n Not ortalamanız ="+ortalama);
        }
    }
}