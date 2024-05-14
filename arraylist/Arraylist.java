package arraylist;
import java.util.*;
public class Arraylist 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> AL1=new ArrayList<>();
		ArrayList<String> AL2=new ArrayList<>();
		ArrayList<String> AL3=new ArrayList<>();
		int n,i;
		String name,gmail,address;
		System.out.println("How many student do you want:");
		n=sc.nextInt();
		sc.nextLine();
		for(i=1;i<=n;i++) 
		{
			
			System.out.println("Enter Name of "+i+" Student:");
			name=sc.nextLine();
			AL1.add(name);
			
			System.out.println("Enter gmail of "+i+" Student:");
			gmail=sc.nextLine();
			AL2.add(gmail);

			System.out.println("Enter Address of "+i+" Student:");
			address=sc.nextLine();
			AL3.add(address);

		}
		System.out.println("Students Name"+AL1);
		System.out.println("Students Gmail"+AL2);
		System.out.println("Students Address"+AL3);

		


	}

}
