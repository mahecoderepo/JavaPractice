package reference;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateNumberHashMap {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 8};

        /* Using Hash Map */

        Map<Integer,Integer> hmap= new HashMap<Integer,Integer>();

        for (int i = 0; i<arr.length; i++)
        {
            hmap.put(arr[i],i);
        }
            hmap.forEach(
                    (key,value) ->System.out.print(key));

//        for (Integer key :hmap.keySet())
//            System.out.println(key);
    }

/* Using Entry Set */

//        Map<Integer, Integer> mp = new HashMap<>();
//        for (int i = 0; i<arr.length; i++) {
//            mp.put(arr[i], i);
//        }
//        mp.entrySet().stream().forEach(
//                input -> System.out.println(input.getKey())
//        );
//    }
}
