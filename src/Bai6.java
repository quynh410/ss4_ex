import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong lon hon 0.");
        } else {
            int sum = 0;
            int temp = N;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.println("Tong cac chu so cua N la: " + sum);
        }
    }
}


