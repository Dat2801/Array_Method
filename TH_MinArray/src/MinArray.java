import java.util.Scanner;

public class MinArray {
    public static int minValue(int[] array) {
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        int size;
        Scanner input = new Scanner(System.in);
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }
        System.out.println("The best value in array: " + min + " ,at position " + index);
    }
}

