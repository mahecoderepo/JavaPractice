package reference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateUsingHashSet {

    public static void main(String[] args) {

        int[] arr={1,2,2,2,3,4,5,6,7,7,7,8};

        HashSet<Integer> hset=new HashSet<>();

        for (int a=0;a<=arr.length-1;a++){
            hset.add(arr[a]);
            }
        System.out.println(hset);
    }
}

