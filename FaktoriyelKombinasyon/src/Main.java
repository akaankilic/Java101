import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kombinasyon oluşturmak istediğiniz sayıları giriniz..");
        Scanner input=new Scanner(System.in);
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int fak1=1,fak2=1,fak3=1;
        int fark=sayi1-sayi2;
        for (int i=1;i<=sayi1;i++){
            fak1*=i;
        }
        for (int j=1;j<=sayi2;j++){
            fak2*=j;

        }
        for (int k=1;k<=fark;k++){
            fak3*=k;
        }
        System.out.println("Girilen sayıların faktoriyellerinin kombinasyonu ");
        System.out.println("C("+sayi1+","+sayi2+") = "+(fak1/(fak2*fak3)));

    }
}