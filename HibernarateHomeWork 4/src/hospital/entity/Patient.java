package hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Patient Details")   
public class Patient {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_id;
	private String name;
	private String city;
	private int age;
	private String Deassice;

	public Patient() {

	}

	public Patient(int patient_id, String name, String city, int age, String deassice) {
		super();
		this.patient_id = patient_id;
		this.name = name;
		this.city = city;
		this.age = age;
		Deassice = deassice;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeassice() {
		return Deassice;
	}

	public void setDeassice(String deassice) {
		Deassice = deassice;
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", name=" + name + ", city=" + city + ", age=" + age
				+ ", Deassice=" + Deassice + "]";
	}

}
