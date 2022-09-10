import java.util.*;
import java.io.*;
class task5
{
    
     public static int generate(int min,int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    void insert(int arr[],int size)
    {
        System.out.println("the random digits in the array will be from 0 to  10 ");
        //Random rand=new Random();
        for(int i=0;i<size;i++)
        {
          arr[i]= task5.generate(0,10);
        }
        System.out.println("Successfully inserted!");
    }
    int IterativeSearch(int arr[],int size,int value)
    {
        boolean bool=false;
       for(int j=0;j<size;j++)
       {
           if(arr[j]==value)
           {
               bool=true;
               break;
           }
           else
               bool=false;
       }
           if(bool==true)
           return 1;
           else 
           return 0;
          // System.out.print(arr[j]+" ");
    
       
      // System.out.println();
    } 
    boolean RecursiveSearch(int arr[], int n,int size,int value)
    {
        boolean f=false;
          if(n >= size)
        System.out.println("error");
 
    // Printing the current array element
    else if(arr[n]==value)
    {
        f=true;
        
    }
    //System.out.print(arr[n]+" ");
 else
    // Recursively calling printArray to print next element in the array
    RecursiveSearch(arr, n + 1, size,4);
     return f;
    }


    public static void main(String[] args)
    {

       Scanner s=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of an array : ");
        size=s.nextInt();
        int[] arr=new int[size];
        task5 obj=new task5();
        double start=System.nanoTime();
        obj.insert(arr,size);

       if( obj.IterativeSearch(arr,size,4)==1)
        System.out.println("This number exits in the list");
        else
          System.out.println("This number does not exit in the list");
       if(obj.RecursiveSearch(arr,0,size,4)==true)
          System.out.println("This number exits in the list");
            else
          System.out.println("This number does not exit in the list");
        }
}