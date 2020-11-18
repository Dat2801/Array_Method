import java.util.Scanner;

public class Max2Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("Nhập số hàng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử của ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "][" + j + "] =" );
                A[i][j] = scanner.nextInt();
            }
        }
int max = A[0][0];
        for (int i  = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng ma trận là: " + max);
    }
}
