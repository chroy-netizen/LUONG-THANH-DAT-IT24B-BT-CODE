//Bai30 Kiem tra so nguyen duong
import java.util.Scanner;

public class Kiemtrasonguyenduong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n từ bàn phím
        System.out.print("Nhap 1 so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Vui long nhap so nguyen duong.");
        } else {
            if (isPalindrome(n)) {
                System.out.println("So vua nhap la so doi xung.");
            } else {
                System.out.println("So vua nhap ko phai la so doi xung.");
            }
        }

        scanner.close();
    }

    
    public static boolean isPalindrome(int n) {
        int original = n; 
        int reversed = 0;

        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10; 
        }

        
        return original == reversed;
    }
}