class Pattern74
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				System.out.print("*");
				else
				System.out.print("-");
			}
			//System.out.println();
			else
			for(int j=(n*2)-1;j>=i;j--)
			{
				if(i==j)

			  System.out.print("*");
			  else
			  System.out.print("-");
		  }
		  System.out.println();

		}
	}
}
