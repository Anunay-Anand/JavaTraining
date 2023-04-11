import java.util.Scanner;

public class Demo {
    public static void main(String []argv) {
        // Validation to check if argv is null
        if(argv.length != 0) {
            System.out.println("Hey Welcome to Java Tutorials!");
            System.out.println(argv[0]);
        }
        int num[] = {1,2,3,4,5};
        printArray(num);
    }

    public static void printArray(int arr[]) {
        // print all elements of array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
        // Initializing a Scanner for parsing or taking input
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name);
        input.close();
    }
}
