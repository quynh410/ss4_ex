import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("So nhap ko hop le!");
        } else {
            int sum = 0;
            for (int i = 1; i < N; i++) {
                sum += 1;
            }
            System.out.println("Tong cac so tu 1 den " + N + " la: " + sum);
        }
    }
}

