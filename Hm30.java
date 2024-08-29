class Hm30
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)

			{
				int c=count;
				System.out.print(count);
				count--;
			}
			System.out.println();
			count=i+1;
		}
	}
}