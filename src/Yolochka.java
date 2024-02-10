import java.util.Scanner;

public class Yolochka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество ярусов: ");
        int levels = scanner.nextInt();

        System.out.print("Введите высоту первого яруса: ");
        int height = scanner.nextInt();

        drawYolochka(levels, height);
    }
    public static void drawYolochka(int levels, int height) {
        for (int f = 0; f < levels; f++) {
            for (int row = 1; row <= height; row++) {
                int spaces = height - row + levels * (height + 1);
                int stars = row * 2 - 1;

                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}