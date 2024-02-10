import java.util.Scanner;

public class khz_kak_nazvat_etot_klass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число любой разрядности: ");
        long inputNumber = scanner.nextLong();

        int digitCount = countDigits(inputNumber);
        int digitSum = sumDigits(inputNumber);

        System.out.println("Количество цифр в числе: " + digitCount);
        System.out.println("Сумма цифр в числе: " + digitSum);
    }
    private static int countDigits(long number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
    private static int sumDigits(long number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
