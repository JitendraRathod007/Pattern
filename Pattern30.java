class Pattern30
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<=n;j++)
				  System.out.print(" ");
				  for(int j=1;j<=i;j++)
				  System.out.print(i);
			  }
			  else
			  {
				  for(int j=i+1;j>. n;j--)
				     System.out.print(" ");
				     for(int j=i;j<=(n*2)-1;j++)
				     System.out.print((n*2)-i);
			  }

			  System.out.println();
		  }
	  }
  }
