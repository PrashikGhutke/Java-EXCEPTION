//import java.io.* ; It executes all The Class That Are Present In the java.io package
import java.io.File ;
import java.io.FileReader ;
import java.io.FileNotFoundException ;

class CheckedException
{
	static void m1()
	{
		System.out.println("M1 Called");
		try{
		m2();
		}catch(FileNotFoundException e)
		{
			System.out.println("THANK U");
		}
		finally{ //It is Optional AND it ALways Executed 
			
		System.out.println("M1 Fianlly Exit");
		}
	}
	static void m2() throws FileNotFoundException
	{
		System.out.println("M2 Called");
		m3();
		System.out.println("M2 Exit");
	}
	static void m3() throws FileNotFoundException
	{
		System.out.println("M3 Called");
		File f = new File("abc.txt");
		//try
		//{
		FileReader fr = new FileReader(f);
	//	}
//		catch(FileNotFoundException e)
			
			System.out.println("EXCEPTION Not  CATCHED");
	
	}
	public static void main(String args[])
	{
		System.out.println("MAIN CALLED");
		m1();
		System.out.println("MAIN Completion");
	}
}
/*
If FILE EXIST

C:\Users\DAC-29\Deskto
MAIN CALLED
M1 Called
M2 Called
M3 Called
EXCEPTION Not  CATCHED
M2 Exit
M2 Finally Exit
M1 Exit
MAIN Completion


If File Not Exist

C:\Users\DAC-29
MAIN CALLED
M1 Called
M2 Called
M3 Called
THANK U
M1 Fianlly Exit
MAIN Completion
*/	
	
	
	