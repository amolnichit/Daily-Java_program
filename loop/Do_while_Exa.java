package loop;
import java.util.Scanner;
public class Do_while_Exa
{

	public static void main(String[] args) 
	{
		int choice1,choice2;
		char choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Restorant");
		do
		{
			System.out.println("**************MENU***************");
			System.out.println("1.Starter\n2Drinks.\n3.Dessert\n");
			System.out.println("Enter yout choice");
			choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("1.Samosa\t12 Rs\n2.vada paw\t10 Rs\n3.patis\t15 Rs");
				System.out.println("what you want");
				choice2=sc.nextInt();
				break;
			case 2:
				System.out.println("1.Coffee\t15 Rs\n2.tea\t10 Rs\n3.Green tea\t15 Rs");
				System.out.println("what you want");
				choice2=sc.nextInt();
			case 3:
				System.out.println("1.gulab jamun\t35 Rs\n2.jalebi\t30 Rs");
				System.out.println("what you want");
				choice2=sc.nextInt();
			default:
				System.out.println("plz enter valid choice");
			}
			System.out.println("do you want to more item");
			choice=sc.next().charAt(0);
		}	
		while(choice=='Y' || choice=='y');
		System.out.println("Thanku for coming...");
	}

}
