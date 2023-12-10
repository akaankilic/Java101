import java.util.Arrays;

public class Main {
    public static int[][] transpozChange(int[][] arr) {
        int satir = arr.length;
        int sutun = arr[0].length;

        int transpoz[][] = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = arr[i][j];
            }
        }
        return transpoz;
    }

    public static void yazdir(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}
        };
        System.out.println("Matris :");
        yazdir(matris);

        System.out.println("**************");
        System.out.println(" Matrisin Transpozu: ");
        int[][] transpoz1=transpozChange(matris);
        yazdir(transpoz1);


    }


}







