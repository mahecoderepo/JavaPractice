package reference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicateCharacters {

    public static void UsingHasMap(String str)
    {
        HashMap<Character,Integer> map= new HashMap<>();

        //char[] ch=str.toCharArray();
        for (int i=0;i<str.length();i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(i));
            } else {
                map.put(str.charAt(i),i);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey().toString());
        }
    }

    public static void UsingHashSet(String str)
    {
        HashSet<Character> set= new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (!set.contains(ch))
            {
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="characters";
        UsingHasMap(str);
        UsingHashSet(str);
    }

}
