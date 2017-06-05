import java.io.*;
import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char x;
        x=s.next().charAt(0);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}
