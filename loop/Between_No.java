package loop;
import java.util.Scanner;
public class Between_No 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start,end,result,i;
		System.out.println("enter starting number");
		start=sc.nextInt();
		System.out.println("enter ending number");
		end=sc.nextInt();
		for(i=start;i<=end;i++) 
		{
			System.out.println(i);
		}
	}
}
