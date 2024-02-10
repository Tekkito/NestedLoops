import java.util.Scanner;

public class lesenki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество ступенек: ");
        int numberOfSteps = scanner.nextInt();

        System.out.println("Лесенка на " + numberOfSteps + " ступенек:");

        for (int i = 1; i <= numberOfSteps; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
