package hibernate.example.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="employees")
public class Employees {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid")
	private int empid;
	@Column(name="name")	
	private String name;
	@Column(name="contact")
	private String contact;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees( String name, String contact, String email, String address) {
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
