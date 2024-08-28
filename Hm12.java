class Hm12
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}


// A==96
//a=64