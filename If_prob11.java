import java.util.*;
class If_prob11
{
	public static void main(String args[])
	{
		Scanner ji=new Scanner(System.in);
		System.out.println("enter your number");
		int day=ji.nextInt();
		switch(day)
		{
			case 1:
			System.out.println("monday");
			break;
				case 2:
						System.out.println("Tuesday");
			break;
				case 3:
						System.out.println("wednesday");
			break;
				case 4:
						System.out.println("thursaday");
			break;
				case 5:
						System.out.println("friday");
			break;
				case 6:
						System.out.println("saturday");
			break;
				case 7:
						System.out.println("sunday");
			break;

			default:
			System.out.println("enter valid number");
			break;
		}
	}
}