import java.util.Random;

/*
Create a method that will receive 2 numbers and calculate the summary of all the numbers between them.

for example:

a=1;

b=3

the result should be 6 (1+2+3)
 */
public class task2 {
    public static void main(String[] args) {
        task2 findSum = new task2();
        Random rand = new Random();
        int num1 = rand.nextInt(10);//generate a random integer from 0 to 9
        int num2 = rand.nextInt(10);//generate a random integer from 0 to 9
        System.out.println("First random number: " + num1);
        System.out.println("Second random number: " + num2);
        findSum.sum(num1,num2);
    }
    public void sum(int num1, int num2) {
        int sum = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of all numbers in between: " + sum);
        }
        else if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of all numbers in between: " + sum);
        }
        else if(num1 == num2) {
            System.out.println("Numbers are equal");
        }
    }
}
