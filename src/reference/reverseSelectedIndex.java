package reference;

public class reverseSelectedIndex {

    public static void main(String[] args) {

                String input = "Hello World Java Programming is fun";
                String[] wordsToReverse = {"World", "Programming"};

                String reversed = reverseWords(input, wordsToReverse);
                System.out.println("Original string: " + input);
                System.out.println("String with reversed words: " + reversed);
            }

            public static String reverseWords(String input, String[] wordsToReverse) {
                // Split the input string by spaces to find individual words
                String[] words = input.split("\\s");

                // Iterate through each word and reverse if it's in the wordsToReverse array
                for (int i = 0; i < words.length; i++) {
                    for (String word : wordsToReverse) {
                        if (words[i].equals(word)) {
                            // Reverse the word
                            words[i] = new StringBuilder(words[i]).reverse().toString();
                            break; // Exit loop once word is reversed
                        }

                    }
                }

                // Recreate the string with reversed words
                StringBuilder sb = new StringBuilder();
                for (String word : words) {
                    sb.append(word).append(" ");
                }

                // Remove trailing space and return the final string
                return sb.toString().trim();
            }
        }