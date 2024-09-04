public class Case4 {
    public static void main(String[] args) {
        
        // Ada berapa bintang yang dihasilkan?
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}

/*
 * Jawaban:
 * 5+4+3+2+1 = 15
 * *
 * **
 * ***
 * ****
 * *****
 */