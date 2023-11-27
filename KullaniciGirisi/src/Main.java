import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, resetPassword;
        int reset;
        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        password = input.nextLine();
        if (userName.equals("kaan") && password.equals("kaan1234")) {
            System.out.println("Tebrikler Başarı İle Giriş Yaptınız..");
        } else {
            System.out.println("Girdiğiniz bilgiler hatalı...\n " +
                    "Şifrenizi sıfırlamak istermisiniz\n1-Evet\n2-Hayır");
            reset = input.nextInt();
            if (reset != 1) {
                System.out.println("Uygulamadan Çıkılıyor");
            } else if (reset == 1) {
                System.out.println("Yeni Parola Giriniz : ");
                resetPassword = input.nextLine();
                if (resetPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı\nLütfen Başka şifre Belirleyiniz");
                } else {
                    System.out.println("Şifreniz Başarıyla Oluşturuldu");
                }


            }
        }
        

    }
}