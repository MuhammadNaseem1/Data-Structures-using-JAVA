import java.util.*;
import java.io.*;
class task2
{
    private int n1=0,n2=1,n3=0;
    
     void fab0(int n)
     {
         int s=1;
         for(int i=0;i<n;i++)
         {
             n3=n1+n2;
             n1=n2;
             n2=n3;
               System.out.print(n3+" ");
         }
     }
   public static int fibonacci(int number)
   {
        if(number == 0 || number == 1)
        { 
            return 1;
             }
              return fibonacci(number-1) + fibonacci(number -2); //tail recursion
   }

   public void calculateTime()
   {
task2 obj=new task2();
        Scanner s=new Scanner(System.in);
        long startTime = System.nanoTime();
           System.out.println("Enter number upto which Fibonacci series to print: "); 
           int number = s.nextInt();
          
            System.out.println("Fibonacci series upto " + number +" numbers : "); 
             System.out.print(obj.n1+" ");
            //printing Fibonacci series upto number
             for(int i=1; i<=number; i++)
             { 
                 System.out.print(fibonacci(i) +" "); 
                 }
                 long stopTime = System.nanoTime();
                 long t=stopTime - startTime;
System.out.println("The time taken by fabonacci using recursion is:   "+t+" NanoSeconds");
System.out.println();

 long stime = System.nanoTime();
System.out.print(obj.n1+" "+obj.n2+" ");

obj.fab0(6);
 long st = System.nanoTime();
                 long T=st - stime;
System.out.println("The time taken by fabonacci using loop is:   "+T+" NanoSeconds");
   }
     public static void main(String[] args)
    {
 /*       task2 obj=new task2();
        Scanner s=new Scanner(System.in);
        long startTime = System.nanoTime();
           System.out.println("Enter number upto which Fibonacci series to print: "); 
           int number = s.nextInt();
          
            System.out.println("Fibonacci series upto " + number +" numbers : "); 
             System.out.print(obj.n1+" ");
            //printing Fibonacci series upto number
             for(int i=1; i<=number; i++)
             { 
                 System.out.print(fibonacci(i) +" "); 
                 }
                 long stopTime = System.nanoTime();
                 long t=stopTime - startTime;
System.out.println("The time taken by fabonacci using recursion is:   "+t);
System.out.println();

 long s = System.nanoTime();
System.out.print(obj.n1+" "+obj.n2+" ");

obj.fab0(6);
 long st = System.nanoTime();
                 long T=st - s;
System.out.println("The time taken by fabonacci using loop is:   "+T);
 */
 task2 o=new task2();
 o.calculateTime();       
    }
}