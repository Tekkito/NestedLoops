public class zapolnennyy2 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = height - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
