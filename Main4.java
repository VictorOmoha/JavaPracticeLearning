public class Main4 {
    public static void main(String[] args) {
        int[] grades = { 4, 20, 100, 1};

        int min = grades[0];
        int max = grades[0];

        for(int i = 0; i < grades.length; i++){
            if(grades[i] < min){
                min = grades[i];
            }

            if(grades[i] > max){
                max = grades[i];
            }
        }
        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);
    }

}
