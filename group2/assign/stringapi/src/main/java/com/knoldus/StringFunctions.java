
public class StringFunctions{

    static void reverseFunction(String actualstring) {
        int length = actualstring.length();
        String reverse="";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + actualstring.charAt(i);
        }
        System.out.println("the reverse of the string is "+reverse);
    }
   static void getlength(String actualstring)
    {  int length = actualstring.length();

        System.out.println("the length of the string is "+length);
    }
}