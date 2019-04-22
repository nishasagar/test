package criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	       @Id
		   private int id;
	       //@Column(name="fname")
		   private String firstName; 
	      // @Column(name="lname")
		   private String lastName;   
		   private int salary;  

		   public Employee() {}
		   
		   public Employee(String fname, String lname, int salary) {
		      this.firstName = fname;
		      this.lastName = lname;
		      this.salary = salary;
		   }
		   
		   public int getId() {
		      return id;
		   }
		   
		   public void setId( int id ) {
		      this.id = id;
		   }
		   
		   public String getFirstName() {
		      return firstName;
		   }
		   
		   public void setFirstName( String first_name ) {
		      this.firstName = first_name;
		   }
		   
		   public String getLastName() {
		      return lastName;
		   }
		   
		   public void setLastName( String last_name ) {
		      this.lastName = last_name;
		   }
		   
		   public int getSalary() {
		      return salary;
		   }
		   
		   public void setSalary( int salary ) {
		      this.salary = salary;
		   }
		   @Override
			public String toString() {
				return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
						+ "]";
			}
		}


