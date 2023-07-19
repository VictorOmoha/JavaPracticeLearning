public class Main5 {
    public static void main(String[] args) {
        int[] numbers = {4,7,12,5,8};
        int sumOdd = 0;
        int count = 0;
   
        for(int i: numbers){
            if(i % 2 != 0){
                sumOdd += i;
                count++;
            }

        }
        double aveOdd = (double) sumOdd / count;
        System.out.println(aveOdd);
    }
}
