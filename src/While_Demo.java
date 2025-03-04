import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Viết chương trinnh thực hiện nhập các số nguyên, kết thúc nhập khi nhập 0
            Tính tổng các số vừa nhập
        */
        // B1: Khởi biến tổng, biến lưu trữ giá trị nhap
        int sum = 0, number = 1;
        // B2: Sử dụng while nhập dữ liệu và tinh tong
        while (number != 0){
            System.out.println("Nhập vào 1 số");
            number = sc.nextInt();
            sum += number;
        }
        // B3: In ra tổng
        System.out.println("Tổng các số vừa nhập là: " + sum);
    }
}
