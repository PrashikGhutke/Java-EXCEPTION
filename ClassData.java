class ClassData
{
	private int eid;
	private String ename;
	private float salary ;
	
	public int getEid()
	{
		return this.eid;
	}
	
	public String getEname()
	{
		return this.ename ;
	}
	
	public float getSalary()
	{
		return this.salary ;
		
	}
	
	public void setEid(int eid)
	{
		this.eid = eid ;
		
	}
	public void setEname(String sname)
	{
		this.ename = ename ;
	}
	public void setSalary(float sal )
	{
		salary = sal ;
	}
	public void getInfo()
	{
		System.out.println("EID = "+(getEid()));
		System.out.println("EID = "+(getEname()));
		System.out.println("EID = "+(getSalary()));
	
	}
		
	
	public static void main(String args[] )
	{
		ClassData obj = new ClassData();
		obj.setEid(101);
		obj.setEname("CODER");
		obj.setSalary(1200000);
		obj.getInfo();
	}
}
		
		
	