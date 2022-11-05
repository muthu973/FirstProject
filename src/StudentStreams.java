
public class StudentStreams {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int std;
	private String section;
	private long phnNo;
	public StudentStreams(int id, String name, int age,String gender, int std, String section, long phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender=gender;
		this.std = std;
		this.section = section;
		this.phnNo = phnNo;
	}
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
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}
	@Override
	public String toString() {
		return "StudentStreams [id=" + id + ", name=" + name + ", age=" + age + ", gender= "+gender+", std=" + std + ", section=" + section
				+ ", phnNo=" + phnNo + "]";
	}
	
	

}
