class This
{
	int a;
	int b;
	int c;
	int d;
	This()
	{
		a = 10;
		b = 20;
	}
	This(int c,int d)
	{
	/*
		This part Doesn't Show Any Error But Its NOt Getting Executed
		c = c;
		d = d;*/
		this.c = c;
		this.d = d;
	}
	public static void main(String args[])
	{
		This obj = new This();
		This obj1 = new This(30,40);
		System.out.println(obj.a);
				System.out.println(obj.b);
						System.out.println(obj1.c);
								System.out.println(obj1.d);
	}
}