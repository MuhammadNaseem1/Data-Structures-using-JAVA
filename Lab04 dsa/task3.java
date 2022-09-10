import java.io.*;
import java.util.*;
class task3
{
    void Iterativefactorial(int n)
    {
       int sum=1;
       for(int i=1;i<=n;i++)
       {
           sum=sum*i;
       }
       System.out.println("The factorial of "+n+" is: "+sum);
    }
     int Recursivefactorial(int n)
    {
    
              if(n==0)
       return 1;
       else
     return (n*Recursivefactorial(n-1)) ; 
    
    }

    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       task3 obj=new task3();
       int num=s.nextInt();
long stime = System.nanoTime();
   obj.Iterativefactorial(num);
 long st = System.nanoTime();
                 long T=st - stime;
System.out.println("The time taken by factorial using loop is:   "+T+" NanoSeconds");
 
    
    long starttime = System.nanoTime();
 int factorial=obj.Recursivefactorial(num);
 long stop = System.nanoTime();
                 long t=stop - starttime;
System.out.println("The time taken by factorial using loop is:   "+t+" NanoSeconds");

      
        System.out.println("The factorial of "+num+" is: "+factorial);
    }
}