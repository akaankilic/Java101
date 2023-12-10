import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : "+ Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 0;

            if (eleman == -1) {
                continue;
            }

            for (int j = i; j < dizi.length; j++) {
                if (eleman == dizi[j]) {
                    frekans++;
                    dizi[j] = -1;
                }
            }



            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}