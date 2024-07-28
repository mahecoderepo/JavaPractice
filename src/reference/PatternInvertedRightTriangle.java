package reference;

public class PatternInvertedRightTriangle {

    public static void main(String[] args) {

        int rows=5;

        for (int i = 1; i <=rows; i++) {

            for (int col = 1; col <=rows-i+1; col++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
