import java.io.*;
import java.util.Scanner;
class revnumber2
{
  public static void main(String[] args)
{
  if(number<10)
{
  System.out.println(number);
  return;
}
  else
{
  System.out.println(number % 10);
  reverseNumber(number/10);
}
}
  public static void main(string[] args)
{
  System.out.println("enter the number that you want to reverse:");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  System.out.println("the reverse of the given number is:");
  reverseNumber(num);
}
}