public class MinArray {
    public static void main(String[] args) {
        int number[] = new int[] {2,3,4,5,6,7,8,9,0};

            int min = number[1];
        for (int i = 1; i < number.length; i++) {
            min = number[i];
        }

        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
