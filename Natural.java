import java.io.*;
import java.util.*;
class Natural
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,i=1,sum=0;
System.out.print("Enter the N value:");
n=s.nextInt();
while(i<n)
{
sum=sum+i;
}
System.out.println("");
System.out.print("Sum of "+n+" Natural numbers = "+sum); 
}
}
