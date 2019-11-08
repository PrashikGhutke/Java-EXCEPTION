class FinalObject
{
	int a ;
	public static void main(String args[])
{
	FinalObject obj = new FinalObject();
	obj.a = 100;
	System.out.println(obj.a);
	final FinalObject obj1 = new FinalObject();
	//obj1  = obj ; Its shows Error Bçoz Binary Representation of obj1 is Declared as Final
	obj1.a = obj.a;
	System.out.println(obj1.a);
		
	
}
}
	