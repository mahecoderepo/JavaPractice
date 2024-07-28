package reference;

public class reverse {
    public static void main(String[] args) {

        String s="I Love Java";
        char[] arr = s.toCharArray();
            for (int i=s.length()-1;i>=0;i--){
                System.out.print(arr[i]);
            }
    }
}
