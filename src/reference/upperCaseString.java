package reference;

public class upperCaseString {

    //ASCII values  of alphabets: A – Z = 65 to 90, a – z = 97 to 122

    public static String toUpperCaseTest()
    {
        String s="Senior software engineer";
        char ch;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >='a' && s.charAt(i) <='z')
                ch= (char) (s.charAt(i) - 'a' + 'A');
            else
                ch=(char) s.charAt(i);

            result.append(ch);
        }
        return result.toString();
    }

    public static String toUpperCaseOnlySelected()
    {
        String s="senior software engineer";
        char[] ch=s.toCharArray();
        String result=" ";
        for (int i = 0; i <= s.length()-1; i++) {

            if (i==0 && ch[i] !=' ' || ch[i] !=' ' && ch[i - 1]==' ')
            {
                if (ch[i] >= 'a' && ch[i] <= 'z')

                {
                char sh= (char)(s.charAt(i)-'a'+'A');
                result+=sh;
                }
            }
            else {
                char sh= s.charAt(i);
                result+=sh;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(toUpperCaseTest());
        System.out.println(toUpperCaseOnlySelected());
    }
}
