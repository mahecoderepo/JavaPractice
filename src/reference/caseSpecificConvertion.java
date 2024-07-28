package reference;

public class caseSpecificConvertion {

    public static void main(String[] args) {

        String inputString = "mahendra";
        int[] indices = {3, 7}; // Indices of the characters to convert to uppercase

        // Check if indices are within valid range
        boolean allValidIndices = true;
        for (int index : indices) {
            if (index < 0 || index >= inputString.length()) {
                allValidIndices = false;
                break;
            }
        }

        if (allValidIndices) {
            // Create a StringBuilder from the inputString
            StringBuilder sb = new StringBuilder(inputString);

            // Convert characters at specified indices to uppercase
            for (int index : indices) {
                char specificChar = sb.charAt(index);
                if (specificChar >= 'a' && specificChar <= 'z') {
                    sb.setCharAt(index, (char) (specificChar - 'a' + 'A'));
                }
            }

            // Convert StringBuilder back to String
            String resultString = sb.toString();
            System.out.println("Result: " + resultString); // Output: helLo worLd
        } else {
            System.out.println("Invalid index/es");
        }
    }
}