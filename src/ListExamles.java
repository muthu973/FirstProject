
public class ListExamles {
	private int id;
	private String studentName;
	private int age;
	private String gender;
	private long phnNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public ListExamles(int id, String studentName, int age, String gender, long phnNo) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
		this.phnNo = phnNo;
	}
	@Override
	public String toString() {
		return "ListExamles [id=" + id + ", studentName=" + studentName + ", age=" + age + ", gender=" + gender
				+ ", phnNo=" + phnNo + "]";
	}
	
	

}
