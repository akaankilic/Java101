import java.util.Scanner;

public class Main {
    static int dongu(int a){
        int cikti=a;
        if (cikti>=0){
            cikti-=5;
            System.out.print(cikti+" ");
//            if (cikti==0||cikti<0){
//                cikti+=5;
//            }
            a=cikti;

        }
        return a;
    }
    public static void main(String[] args) {
        System.out.print("Bir Sayı giriniz : ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.print(a+" "+dongu(a));



    }
}