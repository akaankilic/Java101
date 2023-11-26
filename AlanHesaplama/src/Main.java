import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Alanını Hesaplamak İstediğiniz Ücgenin Kenar uzunluklarını giriniz..");
        Scanner input=new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz..");
        int a=input.nextInt();
        System.out.println("2. Kenarı Giriniz..");
        int b=input.nextInt();
        System.out.println("3. Kenarı Giriniz..");
        double c=input.nextDouble();
        double alan= (double) (a * b) /2;
        double cevre=a+b+c;
        System.out.println("Ücgeninizin çevresi = "+cevre);
        System.out.println("Üçgeninizin alanı = " +alan);


    }
}