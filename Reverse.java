class Reverse
{
	public static void main(String args[])
	{
		int x=123,rev=0;

		while(x!=0)
		{
			//rev=rev*10+x%10;
			x=x/10;
		}
		System.out.print(rev);
	}
}
