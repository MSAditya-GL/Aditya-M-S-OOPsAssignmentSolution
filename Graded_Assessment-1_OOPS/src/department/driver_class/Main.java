package department.driver_class;

import department.child.AdminDepartment;

import department.child.HrDepartment;

import department.child.TechDepartment;

public class Main {
	public static void main(String[] args) {
		
		// Object class instantiation for Admin Department
		AdminDepartment obj1 = new AdminDepartment();
		
		// Object class calling the following methods to the Output
		System.out.println("Welcome to " + obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());

		System.out.println();

		// Object class instantiation for HR Department
		HrDepartment obj2 = new HrDepartment();
		
		// Object class calling the following methods to the Output
		System.out.println("Welcome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());

		System.out.println();

		// Object class instantiation for Technical Department
		TechDepartment obj3 = new TechDepartment();
		
		// Object class calling the following methods to the Output
		System.out.println("Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());

	}

}
