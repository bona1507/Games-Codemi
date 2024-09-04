public class Case7 {
    public static void main(String[] args) {

        // Temukan semua bilangan prima dari 0 sampai 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (/* jawab disini */) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " adalah bilangan prima.");
            }
        }
    }
}

/*
 * Jawaban:
 * int i = 2; i <= Math.sqrt(num); i++
 */