/*
 * Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members. 
 */

class Member{
	String name;
	int age;
	String Number;
	String address;
	int salary;
	
	public void printSalary() {
		System.out.println(salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}



public class A_24_Class_Member {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Jainik";
		e.age = 24;
		e.Number = "9638527412";
		e.address = "A-855 tops technology";
		e.salary = 25000;
		e.specialization = "Coding";
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.Number);
		System.out.println(e.address);
		System.out.println(e.salary);
		System.out.println(e.specialization);
		
		Manager m = new Manager();
		m.department = "Accounts";
		System.out.println(m.department);
		
	}
}
