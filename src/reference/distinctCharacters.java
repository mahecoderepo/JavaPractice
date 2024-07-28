package reference;

public class distinctCharacters {

    public static void main(String[] args) {
        
        String s="characters";
      //  String s=str.replaceAll("\\s","");
       // System.out.println("s = " + s);
        for (int i=0;i<s.length();i++)
        {
            int flag=0;
            for (int j=0;j<s.length();j++)
            {
                if (s.charAt(i)==s.charAt(j) && i!=j)
                {
                        flag=1;
                       //System.out.println("s.charAt(i) = " + s.charAt(i));
                        break;
                }
            }
            if (flag==0)
                System.out.println("s.charAt(i) = " + s.charAt(i));
        }
    }
}
