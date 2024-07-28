package reference;

public class patternLeftTriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces before asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces (adjust if needed)
            }

            // Inner loop for printing asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print asterisks and space
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
