package reference;

import java.util.HashMap;

public class wordCounts {
    public static void main(String[] args) {

        String Input = "Alice is girl and Bob is boy";
        //Output = {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}

        String[] str = Input.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : str) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
