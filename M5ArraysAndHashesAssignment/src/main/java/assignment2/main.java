/*
========================

Assignment 2

The online Toys store has 5 different products – Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6),
Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56). Each product has its own unique ID. Please create a
Method “public String getToyById(int id)” which will build the hashmap of ids/products described above
(Hashmap<Integer, String>) and return the name of the toy by ID. For example, calling getToyById(6) from the
main method will return and print “Wonder Woman”.

Additional requirement:

If there is no product with an id specified in the call, return “No such Toy” String instead. For example
calling getToyById(999) will return and print “No such Toy”.

Optional task:

Instead of providing the id, get the user output by using the Scanner. Here is an example:

Get user input of id using Scanner class

example:

Scanner scanner = new Scanner(System.in);
// ask the question in console
System.out.print("Enter the Toy ID: ");
// get  input as a String
int id = Integer.parseInt(scanner.next());
Find the toy name by id as you did before and return it 😊

Good luck!

============================
 */
package assignment2;


public class main {
    public static void main(String[] args) {
        GetToy getday = new GetToy();
        System.out.println(getday.getToy(56));
    }
}
