package reference;

public class reverseStringInOrder {

    public static void main(String[] args) {
        String s="India is country My";
        String [] str= s.split(" ");
        String rev=" ";

        for (int i= str.length-1;i>=0; i--) {

            rev=rev+str[i]+"";
        }
        System.out.println(rev.substring(0,str.length-1));
    }
}
