package com.gl.departmentservice;

public class TechDepartment extends SuperDepartment {
	
	public TechDepartment()
	{
		
	}
	
	public String DepartmentName()
	{
		return "Tech Department" ;
	}
	
	public String getTodaysWork()
	{
	 return "Complete coding of module 1" ;
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD  " ;
	}
	
	public String getTechStackInformation()
	{
		return "core Java " ;
	}

}
