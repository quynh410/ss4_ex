import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nb;
        while(true){
            System.out.print("Nhap so:");
            nb = scanner.nextInt();
            if(nb == 0) break;
            sum += nb;
        }
        System.out.println("Tong cac so vua nhap : " + sum);
    }
}
