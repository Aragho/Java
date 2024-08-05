public class AllPatterns {
    public static void main(String[] args) {
        int rows = 6; // Number of rows in the patterns

        // Pattern A
        System.out.println("Pattern A:");
        for (int index = 1; index <= rows; index++) {
            for (int java = 1; java <= index; java++) {
                System.out.print(java);
            }
            System.out.println();
        }

        // Pattern B
        System.out.println("\nPattern B:");
        for (int index = rows; index >= 1; index--) {
            for (int java = 1; java <= index; java++) {
                System.out.print(java);
            }
            System.out.println();
        }

        // Pattern C (same as Pattern A)
        System.out.println("\nPattern C:");
        for (int index = 1; index <= rows; index++) {
            for (int java = 1; java <= index; java++) {
                System.out.print(java);
            }
            System.out.println();
        }

        // Pattern D
        System.out.println("\nPattern D:");
        for (int index = 1; index <= rows; index++) {
            for (int j = index; java >= 1; java--) {
                System.out.print(java + " ");
            }
            System.out.println();
        }
    }
}
