import java.util.Scanner;
class Array1Di
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The SIZE ");
		int n = sc.nextInt();
		System.out.println("ENter The Data");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i : a)
		{
			System.out.println(i+" ");
		}
	}
}
		