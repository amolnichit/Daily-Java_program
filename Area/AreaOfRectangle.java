package Area;
import java.util.Scanner;
public class AreaOfRectangle
{

	public static void main(String[] args) 
	{
		int length, breadth, areaOfRect;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		length = sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		breadth = sc.nextInt();
		//Area of Rectangle = length * Breadth
		areaOfRect = length * breadth;
		System.out.println("Area Of Rectangle = "+areaOfRect);
		sc.close();
	}

}