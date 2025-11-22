package com.test.mavenproject1.p3;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeDto> emp=new ArrayList<>();
		emp.add(new EmployeeDto(1,"Aria"));
		emp.add(new EmployeeDto(2,"Nisarga"));
		emp.add(new EmployeeDto(3,"Neha"));
		emp.add(new EmployeeDto(4,"Trisha"));
		emp.add(new EmployeeDto(5,"Jyothsna"));
		System.out.println(emp);

	}

}
