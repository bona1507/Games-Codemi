public class Case10 {
    public static void main(String[] args) {
        int number = 12345;
        int magic = 0;
        
        // Jawab disini

        System.out.println(magic);
    }
}

/*
 * Jawaban:
 * while (number != 0) {
 * int digit = number % 10;
 * magic = magic * 10 + digit;
 * number /= 10;
 * } 
 */