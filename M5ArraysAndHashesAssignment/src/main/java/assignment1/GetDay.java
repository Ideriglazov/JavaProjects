package assignment1;

import java.util.ArrayList;

/*
Assignment 1.

Create a method with an array list of days of the week from Sunday to Saturday.
The method can receive a number and return/print the day of the week.

example:

public String getDay(int day){

}

for example, if 2 will be provided, the method should return "Monday"
 */
public class GetDay {
    public String getDay(int day){
        String result = "";
        if (day < 1 || day > 7) {
            result = "Invalid number provided";
        }
        else {
            ArrayList<String> days = new ArrayList<String>();
            days.add("Sunday");
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");
            days.add("Saturday");
            result = days.get(day - 1);
        }
        return result;
    }
}
