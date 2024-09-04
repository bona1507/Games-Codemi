public class Case9 {
    public static void main(String[] args) {

        // Apa fungsi dari kode ini?
        int number = 123456;
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println( count);
    }
}


/*
 * Jawaban:
 * Menghitung jumlah digit
 */  