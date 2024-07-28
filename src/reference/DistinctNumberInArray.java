package reference;

public class DistinctNumberInArray {

    public static void main(String[] args) {

                int[] arr= {1,1,2,2,3,4,5,5,6,6};
                for (int i = 0; i < arr.length-1; i++) {
                    int flag=0;
                    for (int j = 0; j <arr.length ; j++) {
                        if (arr[i]==arr[j] && i!=j)
                        {
                            flag=1;
                            break;
                        }
                    }
                    if (flag==0)
                    {
                        System.out.println(arr[i]);
                    }
                }
                System.out.println("hello");
            }
}
