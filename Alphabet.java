    import java.io.*;
    import java.util.*;
    import java.lang.*;
    class Alphabet
    {
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    String f=s.next();
    char c=f.charAt(0);
    if(Character.isLetter(c))
    {
    	System.out.print("It is an alphabet");
    }
    else
    {
    	System.out.print("It is an character");
    }
    }
    }
