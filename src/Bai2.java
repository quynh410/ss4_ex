import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();
        if (N < 2) {
            System.out.println("Không phải số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Số nguyên tố");
            } else {
                System.out.println("Số không phải số nguyên tố");
            }
        }
    }
}
