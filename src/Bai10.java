import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Kiem tra so hoan hao");
            System.out.println("3. Tim va tinh tong cac uoc cua mot so");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Nhap so can kiem tra: ");
                int N = scanner.nextInt();

                if (choice == 1) {
                    boolean isPrime = N >= 2;
                    for (int i = 2; i <= Math.sqrt(N) && isPrime; i++) {
                        if (N % i == 0) {
                            isPrime = false;
                        }
                    }
                    System.out.println(N + (isPrime ? " la so nguyen to." : " khong phai la so nguyen to."));
                }
                else if (choice == 2) {
                    int sum = 0;
                    for (int i = 1; i < N; i++) {
                        if (N % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.println(N + (sum == N ? " la so hoan hao." : " khong phai la so hoan hao."));
                }
                else {
                    int sum = 0;
                    for (int i = 1; i <= N; i++) {
                        if (N % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.println("Tong cac uoc cua " + N + " la: " + sum);
                }
            } else if (choice == 4) {
                System.out.println("Thoat chuong trinh.");
            } else {
                System.err.println("\nLua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 4);
    }
}