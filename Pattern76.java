class Pattern76
{
	public static void main(String args[])
	{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=1;j--)
		{

		if(i==j)
		System.out.print("*");
		else
		System.out.print("-");
	    }
	    for(int j=2;j<=n;j++)
	    {
			if(i==j)
	       System.out.print("*");
	       else
	       System.out.print("-");
         }
         System.out.println();

	 }


         for(int i=n-1;i>=1;i--)
		 	{
		 		for(int j=n;j>=1;j--)
		 		{

		 		if(i==j)
		 		System.out.print("*");
		 		else
		 		System.out.print("-");
		 	    }
		 	    for(int j=2;j<=n;j++)
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


