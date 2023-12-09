public class Main {
    public static void main(String[] args) {
        System.out.println("Holigan Dövüşüne Hoş Geldiniizz..");
        System.out.println("Dövüşçü Bilgilerinizi giriniz");
        Holigan holigan1=new Holigan("Benekli Ayhan","Ankaragücü",55,100,25);
        Holigan holigan2=new Holigan("Rambo Okan","Fenerbahçe",50,100,20);
        Fight dovus1=new Fight(holigan1,holigan2,60,40);
        dovus1.dovus();
        System.out.println("Başka Müsabakalarda Görüşmek üzere");

    }
}