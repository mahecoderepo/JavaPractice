package reference;

import java.util.Arrays;
import java.util.Objects;

public class ReverseWord {

    public static void main(String[] args) {

        String str1=" I love Java ";
        String str2=" ";

        String[] arr= str1.split(" ");
        System.out.println(Arrays.toString(arr));

        StringBuilder sb= new StringBuilder();
        for (int i=arr.length-1;i>=0;i--){
            //System.out.println(arr[i]);
            sb.append(arr[i]);
            //System.out.println(arr[i] + "#################");
            sb.append(" ");
           // System.out.println(arr[i] + "&&&&&&&&&&&&&&");
                //str2=" "+arr[i];
        }
       //String bb1= sb.toString().trim();
       System.out.println(sb);

    }
}
