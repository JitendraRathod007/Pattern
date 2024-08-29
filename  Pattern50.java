class Pattern50
{
	public static void main(String args[])
	{
		int n=1;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
			count++;
		}
	}
}