package reference;

public class extractString {
    public static void main(String[] args) {

        String str="JavaLearning2024";

        String numberOnly=str.replaceAll("[^a-z,^A-Z]","");

        System.out.println(numberOnly);
        }
    }
