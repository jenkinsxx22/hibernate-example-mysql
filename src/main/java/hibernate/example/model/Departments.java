package hibernate.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="departments")

public class Departments {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int Id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="status")
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="deptid")  
	private Collection<Employees> employees;

	
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departments(String name, String location, String status, Collection<Employees> employees) {
		this.name = name;
		this.location = location;
		this.status = status;
		this.employees = employees;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(Collection<Employees> employees) {
		this.employees = employees;
	}

	


}
