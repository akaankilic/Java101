import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
       Scanner input=new Scanner(System.in);
        System.out.println("Alan bilgisini öğrenmek istediğiniz dairenin yapıçapını giriniz..");
        int r=input.nextInt();
        System.out.println("Alan bilgisini öğrenmek istediğiniz bölgenin merkez açısının ölçüsünü giriniz..");
        int a=input.nextInt();
        double pi=3.14;
        System.out.println("ölçülerini verdiğiniz parçanın alanı = "+(pi*(r*r)*a)/360);
    }
}