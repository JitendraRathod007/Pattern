class Pattern82
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2!=0)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)

			{
				if(i%2!=0)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}