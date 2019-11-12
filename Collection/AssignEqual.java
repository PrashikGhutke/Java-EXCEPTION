class AssignEqual
{
	public static void main(String args[])
	{
	Integer i = new Integer(10);
	Integer i1 = 10 ;
	if(i == i1 )
	{
		System.out.println("EQUAL" );
	}
	else
	{
		System.out.println("Not EQUAL" );
	}
	
	
	
	System.out.println("Next Test EQUAL" );
	Integer i2 = new Integer(100);
	if(i == i2 )
	{
		System.out.println("EQUAL" );
	}
	else
	{
		System.out.println("Not EQUAL" );
	}
	
	System.out.println("Pool COnstant Equal");
	
	Integer i3 = 10 ;
	if(i1 == i3 )
	{
		System.out.println("EQUAL" );
	}
	else
	{
		System.out.println("Not EQUAL" );
	}
	System.out.println("equals() METHOD" );
	
	if(i1.equals(i2))
	{
		System.out.println("EQUAL" );
	}
	else
	{
		System.out.println("Not EQUAL" );
	}

	}
}

/*
OUTPUT :

Not EQUAL
Next Test EQUAL
Not EQUAL
Pool COnstant Equal
EQUAL
equals() METHOD
Not EQUAL
*/

