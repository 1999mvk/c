import java.io.*;
import java.util.Scanner;
class unaryop
{
  public static void main(String args[])
{
  int r;
  Scanner in=new Scanner(System.in);
  System.out.println("enter r value:");
  r=in.nextInt();
  System.out.println("r="+ r);
  System.out.println("r="+ ++r);
  
  int x;
  System.out.println("enter x value:");
  x=in.nextInt();
  System.out.println("x="+ x);
  System.out.println("x="+ x++);

  int y;
  System.out.println("enter y value:");
  y=in.nextInt();
  System.out.println("y="+ y);
  System.out.println("y="+ y++);
  
  int p;
  System.out.println("enter p value:");
  p=in.nextInt();
  System.out.println("p="+ p);
  System.out.println("p="+ p++);
}
}
  