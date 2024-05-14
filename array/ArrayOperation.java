package array;
import java.util.*;
public class ArrayOperation
{
	public static void accept() 
	{
		//Accepting array
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array element:");
		for(i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		display(arr);
		greatest(arr);
		smollest(arr);
		ascending(arr);
		descending(arr);
		sc.close();
	}
	public static void display(int arr[]) 
	{
		//Display array
		int i;
		for(i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void greatest(int arr[]) 
	{
		//find greatest element in array
		int i,max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("the Gretest Number is"+max);
	}
	public static void smollest(int arr[]) {
		//find smollest element in array
		int i,min=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("the Smollest Number is"+min);
	}
	public static void ascending(int arr[]) 
	{
		//sort array in ascending order
		int i,j,temp;
		for(i=0;i<arr.length;i++) 
		{
			for(j=0;j<arr.length-1-i;j++) 
			{
			 if(arr[j]>arr[j+1])
			 {
				 temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		   }
		}
		System.out.println("After Sorting Ascending order");
		display(arr);
	}
	public static void descending(int arr[])
	{
		//sorting array in descending order
		int i,j,temp;
		for(i=0;i<arr.length;i++) 
		{
			for(j=0;j<arr.length-1-i;j++) 
			{
			 if(arr[j]<arr[j+1])
			 {
				 temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		   }
		}
		System.out.println("After Sorting Descending order");
		display(arr);
	}
	public static void main(String[] args) {
		accept();
	}

}
