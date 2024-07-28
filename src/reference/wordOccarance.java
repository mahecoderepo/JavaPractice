package reference;

public class wordOccarance {

    public static void main(String[] args) {

        String str = "Java is a programming language. Java is widely used in software Testing";
        //Input = ”Java”, Output = 2

        String[] s1 = str.split(" ");
        String searchString = "Java";
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(searchString)) {
                count++;
            }
        }
        System.out.println(" count is of search string is " + count);
    }
}
