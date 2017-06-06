import java.io.*;
import java.util.Scanner;
import java.math.*;
public class Largest {
    public static void main(String args[])
    {int i,n,sum=0;
    int a[]=new int[10];
    System.out.println("enter n");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("enter nos");
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
      sum=sum+a[i]; 
    }
    System.out.println(sum);
    }}
