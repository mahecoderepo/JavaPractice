package reference;

public class primeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime());


    }

    public static boolean isPrime() {
        int n = 2;
        if (n==0 ||n==1)
        {
            System.out.println("not prime");
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
            else {
                return true;
            }

        }

        return false;
    }
}
