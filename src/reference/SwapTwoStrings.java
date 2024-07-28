package reference;

public class SwapTwoStrings {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swap strings without temp variable using StringBuilder
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        // Set str1 to the value of sb2, and str2 to the value of sb1
        str1 = sb2.toString();
        str2 = sb1.toString();

        //@TODO :using string concat

//        str1 = str1 + str2;  // str1 = HelloWorld
//        str2 = str1.substring(0, str1.length() - str2.length());  // str2 = Hello
//        str1 = str1.substring(str2.length());  // str1 = World

        System.out.println("\nAfter swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
