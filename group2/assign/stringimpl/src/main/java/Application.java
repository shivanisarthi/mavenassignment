
import java.util.Scanner;
public class Application
{
    public static void main(String args[])
    {
        StringFunctions object = new StringFunctions();

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String originalstring;
        originalstring= sc.nextLine();
        object.reverseFunction(originalstring);
        object.getlength(originalstring);

    }

}
