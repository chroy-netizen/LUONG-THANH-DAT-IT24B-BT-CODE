//Bai4 Kiem tra so nguyen duong
import java.util.Scanner;

public class Kiemtrasonguyenduong {
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        if (N == 2 || N == 3) {
            return true; 
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return false; 
        }
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 1 so duong N: ");
        int N = scanner.nextInt();

        if (isPrime(N)) {
            System.out.println(N + " la so nguyen to.");
        } else {
            System.out.println(N + " ko phai la so nguyen to.");
        }

        scanner.close();
    }
}