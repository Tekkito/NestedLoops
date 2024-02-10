public class zapolnennyy4 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = height - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = height - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
