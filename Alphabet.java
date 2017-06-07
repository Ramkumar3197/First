import java.io.*;
import java.util.*;
import java.lang.*;
class Alphabet
{
public static void main(String args[])
{
char f;
Scanner s=new Scanner(System.in);
f=s.nextChar();
if(isDigit(f))
{
System.out.println("It is an alphabet");
}
else
{
System.out.println("It is a character");
}
}
}
