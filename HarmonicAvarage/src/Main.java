public class Main {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        double harmonic=0;
        double harmonicSum=0.0;
        for (int i:number){
            for (int k=1;k<= i;k++) {
                harmonic += (1.0 / k);
            }
            harmonicSum += harmonic;
        }
        System.out.println("Harmonic avarage = "+number.length/harmonicSum);

    }
}