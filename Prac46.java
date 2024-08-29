class Prac46
{
	public static void main(String args[])
	{
		int n=5;
		int count=n;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c--;

			}
		System.out.println();
		count+=i+3;
	}
}
}