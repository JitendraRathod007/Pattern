/*
 55555
  4444
   333
    22
     1

*/
class If_prob35
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i;j++)
				System.out.print(" ");
				for(int j=n;j>=i;j--)
				System.out.print(n-i+1);
			}
			System.out.println();
		}
	}
}