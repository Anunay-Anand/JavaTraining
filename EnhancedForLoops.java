import java.util.Scanner;

public class EnhancedForLoops {

    public static void main(String[] args) {
        //int[] array1 = new int[10];
        int[][] array2 = new int[10][10];
        int count = 0;
        while (count < 10) {
            array2[0][count] = count;
            count++;
        }

        // Using Enhanced For Loops - Single Loop
//        for(int x: array1) {
//            System.out.println(x);
//        }

        // Using Enhanced For Loops - Double Loop
        for(int temp[]: array2) {
            for(int x: temp) {
                System.out.println(temp[x]);
                break;
            }
            break;
        }
    }
}
