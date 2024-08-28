import java.util.*;
class If_prob10
{
	public static void main(String args[])
	{
		Scanner ji=new Scanner(System.in);

		System.out.println("enter 1 for Tea");
		System.out.println("enter 2 for coffee");
		System.out.println("enter 3 for softdrink");
		int n=ji.nextInt();

		switch(n)
		{
			case 1:
			System.out.println(" Do you want tea");
			break;
			case 2:
			System.out.println(" do you want cofee");
			break;
			case 3:
			System.out.println("do you want softDrink");
			break;
			default:
			System.out.println("enter valid number");
		}
	}
}
