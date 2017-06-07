import java.io.*;
import java.util.*;
class Leapyear
{
public static void main(String args[])
{
int year;
Scanner a=new Scanner(System.in);
year=a.nextInt();
if((year%4==0)||((year%100==0)&&(year%400==0)))
{
System.out.println("The entered years is a LEAP YEAR");
}
else
{
System.out.println("The entered year is not a leap year");
}
}
}
