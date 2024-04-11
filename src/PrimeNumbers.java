import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 1;
        System.out.printf("Вывод простых чисел до 100: ");
        do{
            if (isPrime(num)) {
                System.out.printf(num + "; ");
            }
            num++;
        }
        while (num<100);
    }
    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}
