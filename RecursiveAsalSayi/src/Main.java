import java.util.Scanner;
public class Main {
    static void asal(){
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı giriniz : ");
        int a=input.nextInt();
        if (a%2==0||a%3==0||a%5==0||a%7==0){
            System.out.println(a+" sayınız ASAL değildir!");
            System.out.println("==============");
            asal();
        }else {
            System.out.println(a+" sayınız ASALDIR!");
            System.out.println("==============");
            asal();
        }
    }
    public static void main(String[] args) {
        System.out.println("*******");
        System.out.println("2-3-5-7 basamakları asaldır lütfen 0-10 aralığından daha yüksek bir sayı giriniz ");
        System.out.println("*******");
        asal();
    }
}
