public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Using a for loop to calculate the sum
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        // Output the result
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
