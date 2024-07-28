package reference;

public class ReplaceCharacterInString {

    public static void main(String[] args) {

        String s="SBI";

        char charToReplace='M';
        char oldChar='I';

        char[] ch=s.toCharArray();

        for (int i=0;i<ch.length;i++) {
            if (ch[i] == oldChar) {
                ch[i] = charToReplace;
            }
        }
        String name=new String(ch);
        System.out.println(name);

    }
}
