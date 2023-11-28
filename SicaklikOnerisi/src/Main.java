import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hava sıcaklığı kaç derece..??");
        Scanner input=new Scanner(System.in);
        int sicaklik=input.nextInt();
        if (sicaklik<5) {
            System.out.println("Hava çok soğuk kayak mevsimi gelmiş :) ");
        } else if ((sicaklik >= 5) && (sicaklik <= 15)) {
            System.out.println("Hava tam sinemada film izlemelik :)");
        } else if ((sicaklik>=15)&&(sicaklik<=25)) {
            System.out.println("Hava tam pikniklik bahar havası  :)");
        } else if (sicaklik > 25) {
            System.out.println("Hava mükemmel yüzmeye gidelim :)");
            
        }
    }
}