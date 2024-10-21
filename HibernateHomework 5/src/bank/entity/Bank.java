package bank.entity;

public class Bank {

	private int   id;
	private String  customer_name;
	private String city;
	private double salary;
	
	public Bank() {
		
		
	}
	
	public Bank(int id, String customer_name, String city, double salary) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", customer_name=" + customer_name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
}
