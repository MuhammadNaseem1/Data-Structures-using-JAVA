import java.util.*;
import java.io.*;
import java.lang.*;

class round
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    double d=s.nextDouble();
    double n=Math.round(d*100.0)/100.0;
    System.out.println(n);
    }
}