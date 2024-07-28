package reference;

import java.util.Arrays;

public class LowestElementInArray
{
    public static void findHighestElement()
    {
        int[] arr = {2, 2, 3, 45, 6, 3, 1,};

        int temp = arr[0];
        Arrays.sort(arr);

        for (int i = 0; i <= arr.length-1; i++) {
            if (temp >= arr[i]) {
                temp = arr[i];
            }
            else {
                temp=arr[i];
            }
        }
        System.out.println("highest element is "+ temp);
    }

    public static void findLowestElement()
    {
        int[] arr = {2, 2, 3, 45, 6, 3, 1};

        int temp = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if (temp<=arr[i]) {
                temp = arr[i];
            }
            else {
                temp=arr[i];
            }
        }
        System.out.println("lowest element is "+ temp);
    }

    public static void findSecondHighestElement()
    {
        int[] arr = {2, 2, 3, 45, 6, 3, 1,};

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax=max;
                max=arr[i];
            } else if (arr[i] >secondMax && arr[i] != max) {
                secondMax=arr[i];
            }

        }
        System.out.println("second highest element is "+secondMax );
    }

    public static void main(String[] args) {

        findLowestElement();
        findHighestElement();
        findSecondHighestElement();

    }
}

