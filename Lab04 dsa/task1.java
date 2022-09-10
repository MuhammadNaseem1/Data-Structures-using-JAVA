import java.io.*;
import java.util.*;
class task1
 { 
    void printNum(int num)
      {
        //  if(num==0)
    //System.out.println(num);

     if(num>0)
             {   
                      printNum(num-1);
   
                        }
                     //   return printNum;     
                  System.out.print(num+" ");
      }
      void printArray(int a[],int i,int n)
       {
            if(i>=n)
             
              return;
                System.out.print(a[i]+" ");
                printArray(a,i+1,n); 

       } 
     public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         task1 obj=new task1();
         obj.printNum(n);
        // int val=obj.printNum(n);
        int number;
        System.out.println("Enter the size of an array");
        number=s.nextInt();
        int[] arr= new int[number];
        System.out.println("Enter the values of an array");
        for(int i=0;i<number;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.print("The printed elements are:  ");
        obj.printArray(arr,0,number);
             s.close();
              }
 }