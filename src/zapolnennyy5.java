public class zapolnennyy5 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < height; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
