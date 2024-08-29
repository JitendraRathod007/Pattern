class HM02
{
	public static void main(String args[])
	{
		int n=123;
		int num=0;
		while(n!=0)
		{
		int r=n%10;
		num=num*10+r;
		n=n/10;
	}
	System.out.println("our no is  123: "+num);
}
}

