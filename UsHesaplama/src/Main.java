import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üssünün hesaplanmasını istediğiniz sayıyı giriniz");
        Scanner input=new Scanner(System.in);
        int num1,num2;
        num1=input.nextInt();
        System.out.println(num1+" in kaçıncı üssünü hesaplamak istiyorsunuz ? ");
        num2=input.nextInt();
        int sonuc=1;
        for (int i=1;i<=num2;i++){
            //System.out.println(i);
            sonuc*=num1;
        }
        System.out.println(num1+"^"+num2+" = "+sonuc);
    }
}