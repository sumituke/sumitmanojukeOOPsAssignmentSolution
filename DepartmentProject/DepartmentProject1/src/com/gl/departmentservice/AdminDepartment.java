package com.gl.departmentservice;

public class AdminDepartment extends SuperDepartment {
	public AdminDepartment()
	{
		
	}
	
	public String DepartmentName()
	{
		return "Admin Department" ;
	}
	
	public String getTodaysWork()
	{
	 return "Complete your documents Submission" ;
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD  " ;
	}

}
