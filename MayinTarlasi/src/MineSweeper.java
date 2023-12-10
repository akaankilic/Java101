import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    String[][] mayinMap;
    String[][] gameMap;
    int mayinSayisi;
    int rowNumber;
    int colNumber;
    int count;
    boolean isTrue = true;


    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.gameMap = new String[row][col];
        this.mayinMap = new String[row][col];
        this.mayinSayisi = (row * col) / 4;

    }

    public void mayinMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mayinMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }

    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i <=this.mayinSayisi; i++) {
            int rsayi = r.nextInt(this.row);
            int rsayi2 = r.nextInt(this.col);
            if (!this.mayinMap[rsayi][rsayi2].equals("*")) {
                this.mayinMap[rsayi][rsayi2] = "*";
            }
        }
    }

    public void printmayinMap() {
        System.out.println("Mayinlarin Konumu");
        randomNumber();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.mayinMap[i][j].equals("*")) {
                    this.mayinMap[i][j] = "-";
                }
                System.out.print(this.mayinMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
    }

    public void printGameMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void indisSecme() {
        Scanner inp = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.print("Satir Giriniz : ");
           rowNumber = inp.nextInt();
            System.out.print("Sutun Giriniz : ");
            colNumber = inp.nextInt();
            System.out.println("==================================");
            if (rowNumber > row || colNumber > col) {
                System.out.println("Map sinirlari disinda secim yaptınız tekrar giriniz !");
                continue;
            }
            if (mayinMap[rowNumber][colNumber].equals("*")) {
                System.out.println("Game Over!");
                printmayinMap();
                break;

            }
            control();
            if (finish()) {

                System.out.println("Tebrikler kazandiniz :)))))");
                break;
            }
        }
    }

    public void control() {
        count = 0;
        for (int i = (rowNumber - 1); i <= (rowNumber + 1); i++) {
            for (int j = (colNumber - 1); j <= (colNumber + 1); j++) {
                if (i < 0 || j < 0 || i >= this.row || j >= this.col) {
                    continue;
                }
                if (this.mayinMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[rowNumber][colNumber] = String.valueOf(count);
        this.mayinMap[rowNumber][colNumber] = String.valueOf(count);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.mayinMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
    public void run() {
        mayinMap();
        indisSecme();
    }
}