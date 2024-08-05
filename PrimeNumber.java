public class PrimeNumber{
    public static boolean isPrime(int number) {

		int factor = 1;
        if (number <= 1) {
            return false; 
        }
        for (int index = 2; index * index <= number; index++) {
            if (number % index == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int myNumber = 27; 
        if (isPrime(myNumber)) {
            System.out.println(myNumber + " is a prime number.");
        } else {
            System.out.println(myNumber + " is not a prime number.");
        }
    }
}