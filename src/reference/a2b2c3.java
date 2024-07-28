package reference;

public class a2b2c3 {

    //output --> aabbccc


        public static void main(String[] args) {
            String input = "a2b2c3";
            String output = expandString(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }

        public static String expandString(String input) {
            StringBuilder result = new StringBuilder();
            char[] chars = input.toCharArray();

            for (int i = 0; i < chars.length; i += 2) {
                char character = chars[i];
                int count = chars[i + 1]-'0'; // Convert char to int
//charAt(i+1) retrieves the character '2' from the string str.
//The ASCII (or Unicode) value of '2' is 50.
//The ASCII value of '0' is 48.
//So, '2' - '0' equals 50 - 48, which equals 2.

                // Append character 'count' times to the result
                for (int j = 0; j < count; j++) {
                    result.append(character);
                }
            }

            return result.toString();
        }
}
