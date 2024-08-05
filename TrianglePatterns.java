public class TrianglePatterns {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to adjust the height of the triangles

        // Pattern 1: Left-aligned triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Add a blank line between patterns

        // Pattern 2: Right-aligned triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}