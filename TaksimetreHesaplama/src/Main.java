import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int km;
        double tutar=20;
        System.out.println("Gidilmek İstenen Mesafeyi KM olarak yazınız..");
        km=input.nextInt();
        double kmTutar=(km*2.2);
        System.out.println(km<5 ? "Ödemeniz Gereken Tutar ="+tutar:"Ödemeniz Gereken tutar="+(kmTutar+10));


    }
}