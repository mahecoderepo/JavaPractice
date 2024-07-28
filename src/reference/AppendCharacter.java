package reference;

import java.util.Arrays;

public class AppendCharacter {

    // given string str ="JavaLearning-2024";
    //* output should be [JavaLearning] [2024]   */


    public static void main(String[] args) {


        String str ="JavaLearning-2024";
        String [] str1=str.split("-");
        for (String s : str1) {
            // Printing the elements of String array
            String sp1=s.replaceAll("JavaLearning","[JavaLearning]");
            String sp2=s.replaceAll("2024","[2024]");
        System.out.println(sp1);
            System.out.println(sp2);

        }

    }



}
