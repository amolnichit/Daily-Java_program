package array_function;
import java.util.*;
public class Array_function
{
	public static void accept() {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array element:");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		gretest(arr);
		smollest(arr);
		ascending(arr);
		descending(arr);
		sc.close();
	}
	public static void gretest(int arr[]) 
	{
		int i,max=arr[0];
		for(i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
	}
	public static void smollest(int arr[]) {
		int i,min=arr[0];
		for(i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
	}
	public static void ascending(int arr[]) {
		int i,temp;
		for(i=0;i<arr.length-1;i++) {
		 if(arr[i]>arr[i+1]) {
			 temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		 }
		}
	}
	public static void descending(int arr[]) {
		int i,temp;
		for(i=0;i<arr.length-1;i++) {
		 if(arr[i]<arr[i+1]) {
			 temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		 }
		}
	}
	public static void main() {
		accept();
	}

}
