class FinalVar
{
	final static int i = 10; //COMPILE TIME CONSTANT
	final static int m;
	static int k;
	final int j ; 
//	k = 30 It is Not Possible, It Is intialize during the declartion or Static block Or Any Method
	FinalVar()
	{
		j = 20;
	}
	static 
	{
		m = 40;
	}
	public static void main(String args[])
	{
		FinalVar obj =  new FinalVar();
		System.out.println(obj.i);
		System.out.println(obj.j);
		k = 30;
		System.out.println(k);
		
		System.out.println(m);
		
	}
	
}
		
	