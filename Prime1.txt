import java.io.*;
import java.util.Scanner;
 class Prime1
{
  public static void main(String[] args)
{
  int temp;
  boolean isprime=true;
  Scanner scan=new Scanner(System.in);
  System.out.println("ente any number:");
  int num=scan.nextInt();
  scan.close();
  for(int i=2;i<=num/2;i++)
{
  temp=num%i;
  if(temp==0)
{
  Prime1 = false;
  break;
}
}
  if(isprime)
  System.out.println(num+"is a Prime number:");
  else;
  System.out.println(num+"is not a Prime number:");
}
}