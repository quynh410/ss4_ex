import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("So nhap vao khong hop le.");
        } else {
            System.out.print("Cac so Armstrong nho hon hoac bang " + N + " la: \n");

            for (int i = 1; i <= N; i++) {
                int orNb = i;
                int sum = 0;
                int temp = i;
                int numDigits = String.valueOf(i).length();
                while (temp != 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, numDigits);
                    temp /= 10;
                }
                if (sum == orNb) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
