import java.util.*;
import java.io.*;

class task3{
void extractCenter(int arr[][8],int n){
	int i, j;
	cout<<"Given array is: "<<endl;
	for(i=0; i<n; i++){
		for(j=0; j<8; j++){
		System.out.print(arr[i][j]+" ");
		}System.out.println();
	}System.out.println();

	System.out.println("Center lines are:");
	for(int i=0;i<n;i++){
		for(int j=0;j<8;j++)
		{if(i>=1&&i<n-1&&j>=1&&j<7)
			System.out.print(arr[i][j]+" ");
		}System.out.println();
	}
	
	
	
}



    public static void main(String[] args)
    {
	int N, i,j;
	
	System.out.print("Enter the 2d array \n");
	System.out.println("Enter the size of Row: ");
	int arr[N][8];
    Scanner s=new Scanner(System.in);
    N=sc.nextInt();
	
		
	for(i=0; i<N; i++){
		for(j=0; j<8; j++){
		arr[i][j]=sc.nextInt();;
		}
	}
	System.out.println();
	extractCenter(arr,N);
    }
}