/*
The code should be able to print all of the positive integers from 1 to 100.

Additional requirements:

 Print messages should contain the following details:
 In the output, state whether each integer is ‘odd’ or ‘even’ in the output. ( *tip  (i % 2 == 0) will return true if  is odd)
 If the number is divisible by three, instead of stating that the number is odd or even, state that the number is ‘divisible by
 three’. If the number is divisible by both two and three, instead of saying that the number is odd, even or divisible by three;
 state that the number is ‘divisible by two and three’. Design the logic of the loop to be as efficient as possible, using
 the minimal number of operations to perform the required logic.
Sample Output

The number ‘1’ is odd.
The number ‘2’ is even.
The number ‘3’ is divisible by three.
 */
public class task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number '" + i + "' is divisible by two and three");
            }
            else if (i % 2 != 0 && i % 3 == 0) {
                System.out.println("The number '" + i + "' is divisible by three");
            }
            else if (i % 2 == 0 && i % 3 != 0) {
                System.out.println("The number '" + i + "' is even");
            }
            else {
                System.out.println("The number '" + i + "' is odd");
            }
        }
    }
}
