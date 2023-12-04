import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kaç katlı bir ters piramit yapmak istiyorsunuz : ");
        Scanner input=new Scanner(System.in);
        int basamak=input.nextInt();
        for (int i=basamak;i>=0;i--){
            for (int k=0;k<basamak-i+1;k++){
                System.out.print(" ");
            }for (int j=0;j<(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
}