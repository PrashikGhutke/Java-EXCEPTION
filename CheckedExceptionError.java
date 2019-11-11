//import java.io.* ; It executes all The Class That Are Present In the java.io package
import java.io.File ;
import java.io.FileReader ;
import java.io.FileNotFoundException ;

class CheckedException
{
	static void m1()
	{
		/*
		CheckedException.java:13: error: exception FileNotFoundException is never thrown in body of corresponding try statement
                }catch(FileNotFoundException e)
			If CHCEKED EXCEPTION IS NOT OCCURED THEN THERE IS NOT REQUIRED 
		*/
		System.out.println("M1 Called");
		try{
		m2();
		}catch(FileNotFoundException e)
		{
			System.out.println("THANK U");
		}
	}
	static void m2()
	{
		System.out.println("M2 Called");
		m3();
		/*
		CheckedExceptionError.java:26: error: unreported exception FileNotFoundException;
		must be caught or declared to be thrown
                m3();
		*/
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

			System.out.println(" EXCEPTION CATCHED");
	
	}
	public static void main(String args[])
	{
		m1();
		
	}
}
	