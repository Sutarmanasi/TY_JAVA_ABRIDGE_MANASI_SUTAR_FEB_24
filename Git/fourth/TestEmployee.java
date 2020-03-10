package com.capgemini.assesments.fourth;

public class TestEmployee {

	public static void main(String[] args) {

		Employee[] emp = new Employee[2];

		Employee e1 = new Employee(101, "manasi", "m@gmail.com", 78659543201l, 30000);
		Employee e2 = new Employee(102, "amrutha", "a@gmail.com", 87975432109l, 40000);

		emp[0] = e1;
		emp[1] = e2;
		
		printEmployeeDetails(emp);
		Employee[] stu = getEmployee();
		printEmployeeDetails(emp);
	}
	
	static void printEmployeeDetails(Employee[] emp) {

		for (int i = 0; i < emp.length; i++) {
			System.out.println("Id = " + emp[i].eid);
			System.out.println("Name = " + emp[i].ename);
			System.out.println("Email = " + emp[i].email);
			System.out.println("Cotact No = " + emp[i].phoneno);
			System.out.println("Salary = " + emp[i].salary);

			System.out.println("*********************");
		}
	}
	
	static Employee[] getEmployee() {

		Employee[] employee = new Employee[2];

		Employee e1 = new Employee(101, "manasi", "m@gmail.com", 78659543201l, 30000);
		Employee e2 = new Employee(102, "amrutha", "a@gmail.com", 87975432109l, 40000);

		employee[0] = e1;
		employee[1] = e2;

		return employee;
	}
}
