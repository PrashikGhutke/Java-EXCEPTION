class InitBlock
{
	int a;
	int b;
	int c;
	int d;
	InitBlock()
	{
		a= 100;
		b = 10;
	System.out.println(a);
	System.out.println(b);
	System.out.println("CONSTRUCTOR");
	}
	{
		c = 500;
		d = 100;
		System.out.println("INIT");
			System.out.println(c);
			System.out.println(d);
	}
	
	public static void main(String args[])
	{
		InitBlock obj = new InitBlock();
		
	}
}