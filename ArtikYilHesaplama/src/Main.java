import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int yıl;

        System.out.print("Artık Yıl Olup-Olmadığını Kontrol Etmek istediğiniz Yılı Giriniz: ");
        yıl = input.nextInt();
        if ((yıl % 4 == 0)||(yıl%100==0)&&(yıl%400==0)){
            System.out.println(yıl+" yılı artık bir yıldır.");
        } else if ((yıl%100==0)&&(yıl%400!=0)) {
            System.out.println(yıl+" yılı artık bir yıl değildir.");
        } else {
            System.out.println(yıl+" yılı artık bir yıl değildir.");
        }
    }
}