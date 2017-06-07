import java.io.*;
import java.util.Arrays;
import java.util.*;
class Index1
{
void check(int[] m)
{
int j,l;
System.out.println("");
for(j=0;j<m.length;j++)
{
if(j==m[j])
{
System.out.print("The number "+m[j]+" equals its index "+j);
}
}
}
}
class Index
{
public static void main(String args[])
{
Scanner b=new Scanner(System.in);
int n=5,i,j;
int[] a=new int[n];
n=b.nextInt();
for(i=0;i<n;i++)
{
a[i]=b.nextInt();
}
Arrays.sort(a);
Index1 k=new Index1();
k.check(a);
}
}
