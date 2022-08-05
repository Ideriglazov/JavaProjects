/*
Write a program (method) that will receive two strings and do the following:
1.) print if one string is part of another:
for example:
String a = Category
String b = Cat
compareStrings(a, b)
output
"Cat is the part of Category"

2.) If Strings are equal, the expected print is:
"The Strings are the same"

3.) If one of the strings is a null -  print:
"Cannot compare Strings"
method:
public void compareStrings(){
}
 */
public class StringComparison {
    public static void main(String[] args) {
        StringComparison compare = new StringComparison();
        String a = "Category";
        String b = "Cat";
        compare.compareStrings(a,b);
    }
    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        }
        else if (a == b) {
            System.out.println("The Strings are the same");
        }
        else if (a.contains(b)) {
            System.out.println(b + " is the part of " + a);
        }
        else if (b.contains(a)) {
            System.out.println(a + " is the part of " + b);
        }
    }
}
