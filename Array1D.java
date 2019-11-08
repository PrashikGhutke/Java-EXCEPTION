import java.util.Scanner;
class Array1D   //Default Class
{
//	final int size;
	int a[] =  new int[5];
	
	
	/*Array1D(int n)  //Default COnstructor
	{
	 ;
	}*/
	void putData(int b[])
	{
		for(int i : b)
		{
			System.out.println(i+" ");
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		//System.out.println("Enter The Size of An Array");
		//int n = sc.nextInt();
		Array1D obj = new Array1D();
		System.out.println("Enter The Data");
		for(int i = 0;i<obj.a.length;i++)
		{
			obj.a[i] = sc.nextInt();
		}
		obj.putData(obj.a);
		
	}
}