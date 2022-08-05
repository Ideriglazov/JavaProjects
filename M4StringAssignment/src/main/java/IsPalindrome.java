/*
Given a string, write a program to check if it is palindrome or not (return boolean).
A string is said to be palindrome if the reverse of the string is the same as string. For example, “racecar” is
a palindrome, but “carrace” is not a palindrome. Return boolean true or false.

method:

public boolean isPalindrome(String text){

//code which will check if the text is palindrome or not.

//return true if it is, false is it is not;

return.....

}
 */
public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        String str = "racecar";
        //String str = "carrace";
        System.out.println(palindrome.isPalindrome(str));
    }
    boolean isPalindrome(String str) {
        boolean result = false;
        int strLength = str.length();
        for(int i = 0; i < strLength/2; i++) {
            if (str.charAt(i) != str.charAt(strLength-i-1)) {
                result = false;
            }
            else {
                result = true;
            }
        }
        return result;
    }
}
