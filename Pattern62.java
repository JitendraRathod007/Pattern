class Pattern62
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				for(int j=n;j>=1;j--)
				System.out.print(j);
				for(int j=i+1;j<=n;j++)
				System.out.print(j);
			}
			else
		{
			for(int j=i;j>=1;j--)
			System.out.print(j);
			for(int j=(n-i+1)*2-3;j>=1;j--)
			System.out.print("_");
            for(int j=1;j<=i;j++)
            System.out.print(j);
		    System.out.println();
	     }
       }
    }
}