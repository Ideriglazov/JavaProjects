/*
1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.
Expected Output :
Hello
Vasiliy Pupkin

2. Write a Java program to print the result of the following operations.
a. -5 + 8 * 6
b. 20 + -3*5 / 8

3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:

number a * number b *.... equals <result>



Attach class with the solution to this lesson. You can drag and drop the file from the IDEA or save it to the text file.
 */
public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Ilia Deriglazov");

        int result2A = -5 + 8 * 6;
        System.out.println("-5 + 8 * 6 = " + result2A);
        double result2B = 20 + -3*5 / 8;
        System.out.println("20 + -3*5 / 8 = " + result2B);//The result number printed is 19.0, but scientific calculator gives 18.125 answer

        double numA = 1.1;
        double numB = 2.2;
        double numC = 3.3;
        double numD = 4.4;
        double numE = 5.5;
        double result3 = numA * numB * numC * numD * numE;
        System.out.println(numA + " * " + numB + " * " + numC + " * " + numD + " * " + numE + " = " + result3);
    }
}
