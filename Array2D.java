import java.util.Scanner;
class Array2D
{
	public static void main(String args[])
	{
		int [][]a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Data");
		for(int i = 0;i<3;i++)
		{
			for(int j = 0; j<3 ;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int[] x : a )
		{
			for(int i : x )
			{
				System.out.print(i+" ");
			}
		}
	}
}