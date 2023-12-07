import java.util.Scanner;
 public class Main {
     static void usAlma(){
         Scanner input=new Scanner(System.in);         System.out.print("Taban sayısını giriniz : ");
         int a=input.nextInt();
         System.out.print("üs değerini giriniz : ");
         int b=input.nextInt();
         if (b==0){  
           System.out.println("Sayının 0. üssü daima 1 eşittir  ");
         } else if (a==1) {
             System.out.println("1 Sayısının üs değerleri daima 1 dir ");
         }
         int sonuc=1;
         for (int i=1;i<=b;i++){
             sonuc*=a;
         }         System.out.println("Sonuc : "+sonuc);
         usAlma();
     }     public static void main(String[] args) {
         usAlma();
     }
 }