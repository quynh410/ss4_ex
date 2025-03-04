import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int N = scanner.nextInt();
        if(N <= 0){
            System.out.println("So nhap ko hop le.");
        }else{
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        }
    }
}
