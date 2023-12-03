import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hak = 3;
        int balance = 1500;
        int secim;

        while (hak > 0) {
            String userName, password;
            System.out.print("Kullanıcı Adınız :");
            userName = input.next();
            System.out.print("Parolanız : ");
            password = input.next();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                secim = input.nextInt();
                switch (secim) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Hesabınızdaki güncel bakiye = " + balance);
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        balance -= price;
                        System.out.println("Hesabınızdaki güncel bakiye = " + balance);
                        System.out.println("Tekrar görüşmek üzere.");
                        break;

                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        System.out.println("Tekrar görüşmek üzere.");
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Hatalı Seçim Yaptınız");

                }

            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                hak--;
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }

        }
    }
}