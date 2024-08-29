class Sum_number3
{
	public static void main(String args[])
{
	int n=12345;
	int r,sum=0;
	while(n!=0)
	{
		r=n%10;
		sum=sum+                                                        r;
		n=n/10;
		System.out.println(sum);
	}
	System.out.println("sum of number is:"+sum);
}
}