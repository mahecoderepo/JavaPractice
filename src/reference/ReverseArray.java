package reference;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {12, 9, 21, 17, 33};
        int[] srr = reverse(arr);
        System.out.println(Arrays.toString(srr));
    }


    public static int[] reverse(int[] arr) {

       int[] temp=new int[arr.length];
        int n= arr.length;
        System.out.println(n);
        for (int i = arr.length-1;i>=0; i--) {
          temp[n-i-1]=arr[i];
        }
        return temp;
    }
}


