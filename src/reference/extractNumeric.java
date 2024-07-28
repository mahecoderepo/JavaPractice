package reference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;


public class extractNumeric {
        public static void main(String[] args) {
            String input = "I have 2 apples and 3 oranges.";

            List<Integer> numbers = extractNumbers(input);

            System.out.println("Numbers extracted from the string:");
            for (Integer number : numbers) {
                System.out.println(number);
            }
        }

        public static List<Integer> extractNumbers(String input) {
            List<Integer> numbers = new ArrayList<>();

            // Regular expression to match one or more digits
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(input);

            // Find all matches and add them to the list
            while (matcher.find()) {
                numbers.add(Integer.parseInt(matcher.group()));
            }

            return numbers;
        }
    }
