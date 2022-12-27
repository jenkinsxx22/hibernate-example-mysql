package hibernate.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.example.model.Departments;
import hibernate.example.util.HIbernateUtil;

public class DepartmentsDao {

	public void SaveDepartment(Departments dept) {
		
		Transaction trn = null;
		
		try(Session ses = HIbernateUtil.getSessionFactory().openSession()){
			
			trn = ses.beginTransaction();
			ses.save(dept);
			trn.commit();
		}catch(Exception e) {
			if(trn!=null) {				
				trn.rollback();
			}
						
		}
		
	}
}
