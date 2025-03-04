import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("So nhap ko hơp le.");
            return;
        }

        System.out.println("cac so Palindrome tu 1 den " + N + " la:");
        for (int i = 1; i <= N; i++) {
            int orNb = i;
            int reversedNum = 0;

            for (int temp = i; temp > 0; temp /= 10) {
                reversedNum = reversedNum * 10 + (temp % 10);
            }

            if (orNb == reversedNum) {
                System.out.print(i + " ");
            }
        }
    }
}