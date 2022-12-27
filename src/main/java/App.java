import java.util.ArrayList;
import java.util.Collection;

import hibernate.example.dao.DepartmentsDao;
import hibernate.example.model.Departments;
import hibernate.example.model.Employees;

public class App {

	public static void main(String args[]) {

		Employees emp1 = new Employees("Figiro","123","abc@gmail.com","Rtt, ddsll wewe");
		Employees emp2 = new Employees("Diphona","456","def@gmail.com","Rtt, ddsll wewe");
		Employees emp3 = new Employees("Laphuta","000000000000","abc@gmail.com","Rtt, ddsll wewe");
		Employees emp4 = new Employees("Raventa","000000000000","def@gmail.com","Rtt, ddsll wewe");
		
		ArrayList<Employees> list1=new ArrayList<Employees>();  
		ArrayList<Employees> list2=new ArrayList<Employees>();  
		
		list1.add(emp1);
		list1.add(emp2);
		list2.add(emp3);
		list2.add(emp4);
	
		Departments dept1 = new Departments("Operations","San Francisco","ACTIVE",list1);
		Departments dept2 = new Departments("Information Technology","San Francisco","ACTIVE",list2);
		
		DepartmentsDao deptdao = new DepartmentsDao();
		
		//shuffle employees with love		
		//dept1.setEmployees(list2);
		//dept2.setEmployees(list1);
		
		deptdao.SaveDepartment(dept1);
		deptdao.SaveDepartment(dept2);
			
		
		System.out.println("Main Class");
	}
}
