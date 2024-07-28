package reference;

public class throwTest {

    static void fun() throws IllegalAccessException{

        throw new IllegalAccessException("e");

    }


    public static void main(String[] args)  {

        try {
            fun();
        }
        catch (IllegalAccessException e){
            System.out.println("hi");
        }
        System.out.println("Hello");
    }
}
