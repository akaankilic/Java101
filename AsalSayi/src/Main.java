public class Main {
    public static void main(String[] args) {
        System.out.println("1-100 arasındaki asal sayılar..");
        int asal1=2;
        System.out.print(asal1+".");
        for (int i=3;i<=100;i++){
            if (i%2==0||i%3==0||i%5==0||i%4==0||i%6==0||i%7==0||i%8==0){
               if(i==3){
                   System.out.print("3.5.7.");
               }
            }else {
                System.out.print(i+".");
            }
        }
    }
}