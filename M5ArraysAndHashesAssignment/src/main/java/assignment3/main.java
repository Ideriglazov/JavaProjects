/*
Assignment 3

The program should receive an ArrayList of Strings and print all the words with no duplicates.

for example:

input

[Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
output:

[Steve, Tim, Lucy, Pat, Angela, Tom, Anna]


tips:

1.  What if you will sort the array before removing the duplicates?

2. What if you use some different collections?  :-)
 */
package assignment3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        RemDupl remdupl = new RemDupl();
            HashSet<String> hashSet = new HashSet<String>();
            hashSet.add("Steve");
            hashSet.add("Tim");
            hashSet.add("Lucy");
            hashSet.add("Steve");
            hashSet.add("Pat");
            hashSet.add("Angela");
            hashSet.add("Tom");
            hashSet.add("Tim");
            hashSet.add("Anna");
            hashSet.add("Lucy");
            //remdupl.remDupl(hashSet);
            System.out.println(hashSet);
    }
}