import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();
        scanner.close();
        System.out.println("Các số Happy từ 1 đến " + N + " là:");
        for (int i = 1; i <= N; i++) {
            int num = i;
            while (num != 1 && num != 4) {
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit * digit;
                    num /= 10;
                }
                num = sum;
            }
            if (num == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
