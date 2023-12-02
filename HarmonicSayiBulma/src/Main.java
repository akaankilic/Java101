import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Harmonic serisini bulmak istediğiniz sayıyı giriniz");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        double harmonic=0;
        for (int i=1;i<=sayi;i++){
            harmonic+=(1.0/i);
        }
        System.out.println(harmonic);

    }
}