package assignment1;
/*
Assignment 1.

Create a method with an array list of days of the week from Sunday to Saturday.
The method can receive a number and return/print the day of the week.

example:

public String getDay(int day){

}

for example, if 2 will be provided, the method should return "Monday"
 */
public class main {
    public static void main(String[] args) {
        GetDay getday = new GetDay();
        System.out.println(getday.getDay(2));
    }
}
