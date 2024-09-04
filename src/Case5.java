public class Case5 {
    public static void main(String[] args) {

        // Akan membentuk pola huruf apa dari kode ini?
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
        // Expected Output:
        // *   *
        //  * *
        //   *
        //  * *
        // *   *
}

/*
 * Jawaban:
 * x
 * *   *
 *  * *
 *   *
 *  * *
 * *   *
 */