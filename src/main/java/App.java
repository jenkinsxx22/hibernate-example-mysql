import java.util.ArrayList;
import java.util.Collection;

import hibernate.example.dao.DepartmentsDao;
import hibernate.example.model.Departments;
import hibernate.example.model.Employees;

public class App {

	public static void main(String args[]) {
		
		Employees emp1 = new Employees("Figiro","123","abc@gmail.com","Rtt, ddsll wewe");
		Employees emp2 = new Employees("Diphona","456","def@gmail.com","Rtt, ddsll wewe");
		
	//	Collection<Employees> empcollection=new Collection<>;
		ArrayList<Employees> list1=new ArrayList<Employees>();  
		
		list1.add(emp1);
		list1.add(emp2);
	
		Departments dept = new Departments("Operations","San Francisco","ACTIVE",list1);
		
		DepartmentsDao deptdao = new DepartmentsDao();
		
		deptdao.SaveDepartment(dept);
		
		System.out.println("Department has been saved.");
	
		
	}
}
