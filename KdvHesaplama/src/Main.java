import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Satın Almak İstediğiniz Ürünün Fiyatını Giriniz..");
        Scanner input=new Scanner(System.in);
        System.out.println("1000 Tl aldındaki ürünlerde kdv %18, üzerinde ise %8\'dir");
        double tutar=input.nextDouble();
        double kdv=1.18;
        double dusukKdv=1.08;
        System.out.println("Kdvsiz Fiyat="+tutar);
        System.out.println(tutar<1000 ? "Kdv oranı =%18":"Kdv Oranı %8");
        System.out.println(tutar<1000 ? "Kdv Dahil fiyat = "+tutar*kdv:"Kdv Dahil fiyat = "+tutar*dusukKdv);



    }
}