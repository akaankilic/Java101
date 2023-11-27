import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vücut Kitle Hesaplaması Programına Hoşgeldiniz..");
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz = ");
        double boy=input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz = ");
        double kilo=input.nextDouble();
        System.out.println("Girdiğiniz Ölçülere Göre Vücut Kitle Endeksiniz = "+(kilo/(boy*boy)));
    }
}