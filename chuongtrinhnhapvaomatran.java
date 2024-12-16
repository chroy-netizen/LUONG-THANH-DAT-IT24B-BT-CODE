import java.util.Scanner;

public class chuongtrinhnhapvaomatran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dong n: ");
        int n = scanner.nextInt();

        System.out.print("Nhap so cot m: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Nhap cac phan tu cua ma tran(gia tri tu 1-99)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        findMaxElement(matrix);
        findPalindromes(matrix);
        replaceNonPrimes(matrix);
        sortColumns(matrix);

        scanner.close();
    }

    public static void findMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int row = -1, col = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Phan tu lon nhat: " + max + " tai vi tri (" + row + ", " + col + ")");
    }

    public static void findPalindromes(int[][] matrix) {
        System.out.println("Cac so doi xung (Palindrome):");
        for (int[] row : matrix) {
            for (int element : row) {
                if (isPalindrome(element)) {
                    System.out.print(element + " ");
                }
            }
        }
        System.out.println();
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static void replaceNonPrimes(int[][] matrix) {
        System.out.println("Ma tran sau khi thay the cac phan tu ko phai so nguyen bang 0:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!isPrime(matrix[i][j])) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sortColumns(int[][] matrix) {
        // Sorting columns logic can be implemented here
        // For now, we will just print the matrix as is
        System.out.println("Ma tran sau khi sap xep cot (chua duoc hoan thanh):");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}