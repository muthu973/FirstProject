
public class StudentStreamMethods {
	private int id;
	private String name;
	private int age;
	private String gender;
	private long phnNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}
	public StudentStreamMethods(int id, String name, int age, String gender, long phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phnNo = phnNo;
	}
	@Override
	public String toString() {
		return "StudentStreamMethods [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phnNo="
				+ phnNo + "]"+ "\n";
	}
	
	
	

}
