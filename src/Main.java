import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getInteregers(5);
        printArray(myIntegers);


    }

    public static int[] getInteregers(int number) {
        System.out.println("Enter " + number + " values:\r");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        System.out.println("Your array is:\r");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        public static int[] sortArray ( int[] array){
            
        }
    }
}
