package reference;

public  class alternativeMergeString {
    public static String s1="cat meow";
    public static String s2="Dog wru";
    public static String result;
    public static int i=0;
    public static int j=0;
    public static void main(String[] args) {
        String ms=mergeStrings(s1,s2);
        System.out.println(ms);
    }

    public static String mergeStrings(String s1,String s2)
    {
        StringBuilder sb=new StringBuilder();
        while (i < s1.length() && j<s2.length())
        {
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));
        }
        while (i < s1.length()) {
            sb.append(s1.charAt(i++));
        }

        // Append remaining characters from str2
        while (j < s1.length()) {
            sb.append(s1.charAt(j++));
        }
        return sb.toString();
    }
}
