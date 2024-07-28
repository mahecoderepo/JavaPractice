package reference;

public class ReverseWordsinString {

    public static void main(String[] args) {

        String s= "Welcome to java world";

        String[] reverse=s.split("\\s");
        String reversedString="";

        for (int j=0;j< reverse.length;j++) {
            String sh = reverse[j];
            String word="";
            for (int i = sh.length()-1; i >= 0; i--)
            {
               word=  word+sh.charAt(i);
            }
            reversedString=reversedString+word+" ";
        }
        System.out.println(reversedString);
    }
}
