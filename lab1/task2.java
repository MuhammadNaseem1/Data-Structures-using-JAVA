import java.util.*;
import java.io.*;
class task2{

void extractBoundaries(int arr[][8],int n){
	int i, j;	
	for(i=0;i<n;i++)	
	{
		for(j=0;j<8;j++)
		{
			System.out.print(arr[0][j]+" ");
		}break;
	}
		System.out.println();
	for(int i=1;i<n-1;i++)
	{
		for(j=0;j<8;j++)
		{if(j==0||j==8-1)
				System.out.print(arr[i][j]+" ");
			else
			System.out.print(" ");
		}	System.out.println();
	}
	
	for(i=n-1;i<n;i++)
	{
		for(j=0;j<8;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
	}
	
}

    public static void main(String[] args)
    {
        	int N, i,j;
	Scanner s=new Scanner(System.in);
	cout<<"Enter the 2d array \n";
	cout<<"Enter the size of Row: ";
	N=sc.nextInt();
	int arr[N][8];
		
        	for(i=0; i<N; i++){
		for(j=0; j<8; j++){
		arr[i][j]=s.nextInt();
		}
	}
	System.out.println(" ");
	extractBoundaries(arr,N);
    }
}