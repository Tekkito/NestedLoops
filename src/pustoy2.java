public class pustoy2 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = height - 1; j >= i; j--) {
                if (j == height - 1 || i == 0 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
