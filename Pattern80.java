class Pattern80
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				if(j%2!=0)
				System.out.print((char)(j+64));
				else
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				if(j%2!=0)
			System.out.print((char)(j+64));
			else
			System.out.print((char)(j+96));
		}
		System.out.println();
		}
	}
}