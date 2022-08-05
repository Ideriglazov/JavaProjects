/*
Using two loops print upside-down pyramid on the screen (see and modify the numbers pyramid example in the lesson)
 */
public class task3 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
