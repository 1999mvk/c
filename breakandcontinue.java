import java.io.*;
class breakandcontinue
{
  public static void main(String[] args)
{
  System.out.println("break statement\n........");
  for(int i=1;i<=5;i++)
{
  if(i==4) break;
  System.out.println(i);
}
  System.out.println("continue statement\n.........");
  for(int i=1;i<=5;i++)
{
  if(i==1) continue;
  System.out.println(i);
}
}
}