import java.io.*;
import java.util.Scanner;
class sum
{
  public static void main(String args[])
{
  int a,b,sum;
  Scanner in=new Scanner(System.in);
  System.out.println("enter A value:");
  a=in.nextInt();
  System.out.println("enter B value:");
  b=in.nextInt();
  sum=a+b;
  System.out.println("Sum of A&B:"+ sum);
}
}

