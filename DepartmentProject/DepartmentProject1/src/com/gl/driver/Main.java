package com.gl.driver;


import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HrDepartment;
import com.gl.departmentservice.SuperDepartment;
import com.gl.departmentservice.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		SuperDepartment s = new SuperDepartment();
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome to "+ ad.DepartmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(s.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to "+ hr.DepartmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(s.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to "+ tech.DepartmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(s.isTodayAHoliday());
		

	}

}
