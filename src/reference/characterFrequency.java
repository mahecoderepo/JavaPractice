package reference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class characterFrequency {

    public static void main(String[] args) {
        String str = "Iam";
        //findSecondHighestFrequency(str);
        findSecondHighestFrequencyUsingContains(str);
    }

    public static void findSecondHighestFrequency(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Calculate character frequencies
        for (char ch : str.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                // Increment the frequency count if the character is already present
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // Initialize the frequency count to 1 if the character is not present
                frequencyMap.put(ch, 1);
            }
        }

        // Print the frequency of each character
        System.out.println("Character frequencies in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }

    public static void findSecondHighestFrequencyUsingContains(String str)
    {
                // Create a HashMap to store character frequencies (case insensitive)
                Map<Character, Integer> frequencyMap = new HashMap<>();
                String lowerCaseChar= str.toLowerCase().replaceAll("\\s+","");
        System.out.println(lowerCaseChar);

                // Calculate character frequencies
                for (char ch : lowerCaseChar.toCharArray()) {
                    frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                }
        System.out.println(frequencyMap +"count of characters");

                // Find the character(s) with the second highest frequency
                HashSet<Character> secondHighestChars = new HashSet<>();
                int highestFreq = Integer.MIN_VALUE;
                int secondHighestFreq = Integer.MIN_VALUE;

                for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                    int freq = entry.getValue();
                    char ch = entry.getKey();

                    // Update if current frequency is higher than second highest but not highest
                    if (freq > secondHighestFreq && freq < highestFreq) {
                        secondHighestFreq = freq;
                        secondHighestChars.clear(); // Clear previous set
                        secondHighestChars.add(ch); // Add new character
                    } else if (freq == secondHighestFreq) {
                        secondHighestChars.add(ch); // Add character to set
                    }

                    // Update highest frequency
                    if (freq > highestFreq) {
                        secondHighestFreq = highestFreq; // Update second highest
                        highestFreq = freq;
                        secondHighestChars.clear(); // Clear set
                        secondHighestChars.add(ch); // Add new character
                    } else if (freq == highestFreq) {
                        highestFreq = freq; // Update highest frequency
                    }
                }

                // Print the characters with the second highest frequency
                System.out.println("Character(s) with the second highest frequency:");
                for (char ch : secondHighestChars) {
                    System.out.println("'" + ch + "' : " + secondHighestFreq);
                }
            }
}