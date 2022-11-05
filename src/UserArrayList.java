
public class UserArrayList {
	private int id;
	private String name;
	private String gender;
	private String mailId;
	private long phnNo;
		
	public UserArrayList(int id, String name, String gender, String mailId, long phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.mailId = mailId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}
	
	public String toString() {
		return "UserArrayList [id=" + id + ", name=" + name + ", gender=" + gender + ", mailId=" + mailId + ", phnNo="
				+ phnNo + "]";
	}
}
