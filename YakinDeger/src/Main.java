import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz :");
        int a = input.nextInt();
        System.out.println("Dizi = " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Girilen Değer : " + a);
        int kucukYakin = a;

        int gecici;
        int buyukYakin = list[list.length - 1];
        for (int i : list) {
            if (i < a) {
                kucukYakin = i;
            }
        }
        for (int i : list)
            if (i > a) {
                gecici = i;
                if (gecici > a && gecici < buyukYakin) {
                    buyukYakin = gecici;
                }
            }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukYakin);

    }


}
