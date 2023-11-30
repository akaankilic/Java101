import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Çin Zodyağı***");
        System.out.println("Sizi temsil eden hayvanı bulmak için lütfen doğum yılınızı giriniz = ");
        Scanner input=new Scanner(System.in);
        int dogumYili= input.nextInt();
        int zodyak=dogumYili%12;
        switch (zodyak){
            case 0:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Maymun");
                break;
            case 1:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız =  Horoz");
                break;
            case 2:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Köpek");
                break;
            case 3:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Domuz");
                break;
            case 4:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Fare");
                break;
            case 5:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Öküz");
                break;
            case 6:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Kaplan");
                break;
            case 7:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Tavşan");
                break;
            case 8:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız =  Ejderha");
                break;
            case 9:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Yılan");
                break;
            case 10:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = At");
                break;
            case 11:
                System.out.println("Doğum Yılınız = "+dogumYili);
                System.out.println("Çin takvimine göre hayvanınız = Koyun");
                break;
        }
    }
}