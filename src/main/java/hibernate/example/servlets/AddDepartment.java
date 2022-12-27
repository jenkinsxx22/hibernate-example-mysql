package hibernate.example.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.example.dao.DepartmentsDao;
import hibernate.example.model.Departments;

/**
 * Servlet implementation class AddDepartment
 */
public class AddDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDepartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String DepartmentName = request.getParameter("deptname");
		String DepartmentLocation = request.getParameter("deptloc");
		String DepartmentStatus = request.getParameter("deptstatus");
		
		Departments dept = new Departments();
		DepartmentsDao deptdao = new DepartmentsDao();
		
		dept.setName(DepartmentName);
		dept.setLocation(DepartmentLocation);
		dept.setStatus(DepartmentStatus);
		
		deptdao.SaveDepartment(dept);		
		
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
