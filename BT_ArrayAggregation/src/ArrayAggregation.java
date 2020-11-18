import java.util.Scanner;

public class ArrayAggregation {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float[] a = null;
        float[] b = null;
        float[] c = null;
        System.out.println("Nhập mảng a");
        a = input(a);
        System.out.println("Nhập mảng b");
        b = input(b);
        c = merge(a,b);
        show(c);
    }

    public static float[] input(float[] arr){
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new float[n];
        System.out.println("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void sortASC(float [] arr){
        float temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static float [] merge (float [] a, float[] b){
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        float[] c = new float[cIndex + 1];

        sortASC(a);
        sortASC(b);

        for (int i = cIndex; i > - 1 ; i--) {
            if (aIndex > -1 && bIndex > -1){
                if (a[aIndex] > b[bIndex]){
                    c[i] = a[aIndex--];
                }else {
                    c[i] = b[bIndex];
                }
            }else if (bIndex == - 1){
                c[i] = a[aIndex--];
            }else {
                c[i] = b[bIndex--];
            }
        }return c;
    }
    public static void show(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }
}
