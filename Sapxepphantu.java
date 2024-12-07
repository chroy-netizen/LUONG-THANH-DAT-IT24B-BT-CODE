//Bai5 Sap xep mang so nguyen theo chieu tang dan
import java.util.Scanner;

public class Sapxepphantu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}