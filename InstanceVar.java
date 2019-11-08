class InstanceVar
{
	int a = 10; //Instance Variable
	
	public static void main(String args[])
	{
		InstanceVar  obj = new InstanceVar();
		obj.a = 100;
			System.out.println(obj.a);
		InstanceVar obj1 =  new InstanceVar();
		obj1 = obj ; // Objet Is Intialized To Refer Same Memory 
		
			System.out.println(obj1.a);
			
			System.out.println("Hello ");
			
			InstanceVar obj2 = new InstanceVar();
				System.out.println(obj2.a);
					
					obj2.a = obj.a ;
					System.out.println(obj2.a);
	}
}