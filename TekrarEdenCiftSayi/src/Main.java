public class Main {

    static boolean isDouble(int[]arr,int value){
        for (int i:arr){
            if (value%2==0){
                return true;
            }
        }
        return false;
    }
    static boolean isFind(int[]arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] number={21,4,13,2,2,6,10,12,4,5,8,7,9,8,13,12,17,15,16,20,20,10,6};
        int[] dublicateDuble=new int[number.length];
        int startIndex=0;
        for (int i=0;i< number.length;i++){
            for (int j=0;j< number.length;j++){
                if ((i!=j)&&(number[i]==number[j])){
                    if ((!isFind(dublicateDuble,number[i]))&&(isDouble(dublicateDuble,number[i]))){
                        dublicateDuble[startIndex++]=number[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Tekrar Eden Çift Sayılar :  ");
        for (int sayi:dublicateDuble){
            if (sayi!=0){
                System.out.print(sayi+",");
            }
        }
    }
}