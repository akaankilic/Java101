import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ebob ve Ekok'unu Bulmak istediğiniz Sayılaı giriniz");
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı = ");
        int say1 = input.nextInt();
        System.out.print("İkinci Sayı = ");
        int say2 = input.nextInt();
        int ebob = 1;
        int ekok=1;
        do {
            boolean b = say1 % ebob == 0;
            ebob++;
        } while (say2 % ebob == 0); {
            ebob++;
            System.out.println("Ebob = "+ebob);
        }
       while(ekok<=(say2*say1)){
           if (ekok%say1==0&&ekok%say2==0){
               System.out.println("Ekok = "+ekok);
               break;
           }
           ekok++;
       }


    }
}