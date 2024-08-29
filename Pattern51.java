class Pattern51
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n*(n+1)/2;
		int count2=n*(n+1)/2;
		for(int i=1,i1=n;i<=1||i1>=1;i++,i--)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i,j1=n;j<=n||j1>=1;j++,j--)
			{
				System.out.print(c1+"\t");
				System.out.print(c2+"\t");
				c1-=j;
				c2-=j1;
			}
			System.out.println();
			count1-=i-1;
			count2--;
		}

	}
}
