import java.util.*;
public class Palindrome {
    public static void main (String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.next();
        String rev="";
        int len = str.length();
        for(i=len-1; i>=0; i--)
        {
        rev = rev + str.charAt(i);
        }
        if (rev.equals(str))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
