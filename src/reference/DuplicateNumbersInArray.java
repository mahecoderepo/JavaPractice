package reference;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersInArray {

    public static void main(String[] args) {

                int[] array = {0,0,0,1,2,3};

                // Create a HashMap to store element counts
                HashMap<Integer, Integer> map = new HashMap<>();

                // Traverse through the array and populate the HashMap
                for (int num : array) {
                    if (map.containsKey(num)) {
                        map.put(num, map.get(num) + 1);
                    } else {
                        map.put(num, 1);
                    }
                }

                // Print duplicates
                System.out.println("Duplicate elements in the array:");
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > 1) {
                        System.out.println(entry.getKey());
                    }
                }
            }
        }
