class Patt
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=n;j>i;j--)
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(count+64)+"\t");
				count++;
			}
			System.out.println();

		}
	}
}