
public class PrivateEmployee implements Employee {
	private int id;
	private String name;
	private int salary;
	private int tax;
	private int exp;
	
	public PrivateEmployee(int id,String name,int salary,int tax,int exp) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		this.exp=exp;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setTax(int tax) {
		this.tax=tax;
	}
	public int getTax() {
		return this.tax;
	}
	public void setExp(int exp) {
		this.exp=exp;
	}
	public int getExp() {
		return this.exp;
	}
	
	public String toString() {
		return "Id="+id+", Name="+name+", Salary="+salary+", Experience="+exp;
	}
	
	public int findNetSalary(int salary) {
		return salary-(salary*tax/100);
	}
	public String findHierarchy(int exp) {
		if(exp>=2&&exp<5) {
			return "1 Star Employee";
		}else if(exp>=5&&exp<=10) {
			return "2 Star Employee";
		}else if(exp>=10){
			return "3 Star Employee";
		}else {
			return "NULL";
		}
	}

}
