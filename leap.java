import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if((n%4==0) && (n%400==0) && (n%100==0))
{
System.out.print("it is a leap year");
}
else 
System.out.print("not a leap year");
}
}
