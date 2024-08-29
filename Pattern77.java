class Pattern77
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=n;j>=1;j--)

					if(i==j)
					System.out.print("*");
					else
					System.out.print("-");

			}
			for(int j=2;j<=n;j++)
			{

		//	System.out.print(if(i==j)? "*":"-" );
	     	if(i==j)
	     	System.out.print("*");
	     	else
	    	System.out.print(" ");
		   }
		   System.out.println();


			//System.out.println();
			for(int j=i;j<=(n*2)-1;j++)
			{
			if(i==j)
			System.out.print("*");
			System.out.print(" ");
		    }
			System.out.println();

		}
	}
}