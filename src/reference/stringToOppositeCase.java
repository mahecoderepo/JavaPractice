package reference;

public class stringToOppositeCase {

    public static void main(String[] args) {

        String input = "Iam work ,in VeriFone";
        String converted = convertOppositeCase(input);
        System.out.println(converted);
    }

    public static String convertOppositeCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           // char current = chars[i];
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert uppercase to lowercase using ASCII values
                chars[i] = (char) (chars[i] + 32);
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                // Convert lowercase to uppercase using ASCII values
                chars[i] = (char) (chars[i] -32);
            }
            // If it's not a letter (like punctuation), leave it unchanged
        }
        return new String(chars);
    }
}