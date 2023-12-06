import java.util.Scanner;

public class Main {
    static int toplam() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        System.out.print(a + " ile toplanmasını istediğiniz sayı :");
        int b = input.nextInt();
        int sonuc = a + b;
        System.out.println("Sayıların toplamı : " + sonuc);
        return sonuc;
    }

    static int cikan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        System.out.print(a + " dan cıkarılmasını istediğiniz sayı :");
        int b = input.nextInt();
        int sonuc = a - b;
        System.out.println("Sayıların farkı : " + sonuc);
        return sonuc;
    }

    static double bolum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        System.out.print(a + "nın bölünmesini istediğiniz sayı :");
        int b = input.nextInt();
        double sonuc = a / b;
        System.out.println(a + " sayısının " + b + " sayısına bölümü : " + sonuc);
        return sonuc;
    }

    static int kat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        System.out.print(a + " ile çarpılmasını istediğiniz sayı :");
        int b = input.nextInt();
        int sonuc = a * b;
        System.out.println(a + " sayısının " + b + " sayısına çarpımı : " + sonuc);
        return sonuc;
    }

    static void usAlma() {
        Scanner input = new Scanner(System.in);
        System.out.print("üs almak istediğiniz sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print(a + " değerinin kaçıncı üssünü hesaplamak istiyorsunuz :");
        int b = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.println(a + " Sayısının " + b + " .üssü : " + sonuc);

    }

    static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının faktoriyelini hesaplamak istiyorsunuz : ");
        int a = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc += i;
        }
        System.out.println("Girdiğiniz sayının faktoriyeli : " + sonuc);
    }

    static int modAlma() {
        Scanner input = new Scanner(System.in);
        System.out.print("modunu almak istediğiniz sayı : ");
        int a = input.nextInt();
        System.out.print("hangi sayıya bölünmesini istiyorsunuz :");
        int b = input.nextInt();
        int sonuc = a % b;
        System.out.println(a + " Sayısının " + b + " modu : " + sonuc);
        return sonuc;
    }

    static void alanCevre() {
        Scanner input = new Scanner(System.in);
        System.out.print("dikdörtgeninizin uzun kenarını giriniz : ");
        int a = input.nextInt();
        System.out.print("dikdörtgeninizin kısa kenarını giriniz :");
        int b = input.nextInt();
        int alan = a * b, cevre = (a * 2) + (b * 2);
        System.out.println("Dikdörtgeninizin alanı : " + alan + " çevresi ise : " + cevre);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "=============\n"+"1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.println("=============");
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    toplam();
                    System.out.println("=============");
                    break;
                case 2:
                    cikan();
                    System.out.println("=============");
                    break;
                case 3:
                    kat();
                    System.out.println("=============");
                    break;
                case 4:
                    bolum();
                    System.out.println("=============");
                    break;
                case 5:
                    usAlma();
                    System.out.println("=============");
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    System.out.println("=============");
                    break;
                case 8:
                    alanCevre();
                    System.out.println("=============");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    System.out.println("=============");
            }
        }while (select != 0) ;


        }
    }




