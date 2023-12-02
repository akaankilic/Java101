import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Oluşturmak İstediğiniz elmas için sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        double elmas = input.nextDouble();
        for (int i = 0; i <= (elmas/2); i++) {
            for (int j = 0; j < (elmas - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int b = (int) (elmas/2); b>=0; b--){
            for(int c = 0; c< (elmas - b+1); c++){
                System.out.print(" ");
            }
            for( int a = 0 ; a < (b * 2) - 1; a++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}