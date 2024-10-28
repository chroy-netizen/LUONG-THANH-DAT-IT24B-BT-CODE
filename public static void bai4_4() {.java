public static void bai4_4() {
    int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
    int i = 0, j = 0;
    System.out.printf("Phan tu thu nhat arr2[%d][%d] = %d", i, j, arr2[i][j]);
    System.out.printf("\nPhan tu thu hai arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
    System.out.printf("\nPhan tu thu ba arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
    System.out.printf("\nPhan tu thu tu arr2[%d][%d] = %d", i = i + 1, j = 0, arr2[i][j]);
    System.out.printf("\nPhan tu thu nam arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
    System.out.printf("\nPhan tu thu sau arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
    System.out.printf("\nPhan tu thu bay arr2[%d][%d] = %d", i = i + 1, j = 0, arr2[i][j]);
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
    bai4_4();
}