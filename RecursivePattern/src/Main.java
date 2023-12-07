import java.util.Scanner;

public class Main {
       static int pattern(int a,int b){
           int gecici=a;
           if (a>=0&&a==a){
               a-=5;
               System.out.print(a+" ");
               pattern(a,b);
               if (a<0||gecici!=b){
                   gecici+=5;
                   System.out.print(" "+gecici);
               }
           }
           return a;
       }
       public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           System.out.print("Bir Sayı giriniz : ");
           int a=input.nextInt();
           int b=a;
           System.out.print(a+" ");
           pattern(a,b);
       }
}

