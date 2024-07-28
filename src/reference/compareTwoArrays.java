package reference;

//TODO:
// Write Java program that checks if two arrays contain the same elements.

import java.util.Arrays;

public class compareTwoArrays {

    public static boolean compareArray(int[] arr,int[] brr)
    {
       if (arr.length !=brr.length)
           return false;
       Arrays.sort(arr);
       Arrays.sort(brr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=brr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] a= {1,2,3,};
        int[] b= {9,8,7,};

        int[] x= {1,2,3,7,9,0};
        int[] y= {8,3,6,};

          compareArray(a,b);
        System.out.println(compareArray(a,b));
        System.out.println(compareArray(x,y));

    }

}
