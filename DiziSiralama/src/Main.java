import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kaç Elemanlı Dizi Oluşturmak İstiyorsunuz : ");
        Scanner input=new Scanner(System.in);
        int eleman=input.nextInt();
        int[] dizi=new int[eleman];
        System.out.println("Elemanları giriniz...");
        for (int i=0;i<= dizi.length-1;i++){
            System.out.println(i+1+" . eleman : ");
            dizi[i]=input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

    }
}