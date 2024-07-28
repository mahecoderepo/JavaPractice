package reference;

public class RemoveAccuranceOfChar {
        public static void main(String[] args) {
            String input = "Hello, world!";
            char charToRemove = 'o';

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar != charToRemove) {
                    sb.append(currentChar);
                }
            }
            String result = sb.toString();
            System.out.println("Original string: " + input);
            System.out.println("String after removing '" + charToRemove + "': " + result);
        }
}
