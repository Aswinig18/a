import java.io.*;
import java.util.*;
class number
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    if(t==0)
    {
      System.out.println("zero");
    }
    else if(t>0)
    {
      System.out.println("positive");
    }
    else
    {
      System.out.println("negative");
    }
  }
}
