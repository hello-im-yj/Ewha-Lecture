/* 1748022 ������
 * (�ǽ�1) ��ȭ��ȣ��
 * */


package pm1;

public class Phone {
	
	private String name;
	private String PhoneNum;
	
	public Phone() {
		//this.name = "anonymous";
		//this.PhoneNum = "000";
		this("anonymous","000");
	}
	
	public Phone(String name, String phoneNum) {
		this.name = name;
		this.PhoneNum = phoneNum;
	}
	
	public boolean isYourName(String name) {
		if (name.equals(this.name)) return true;
		else return false;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}
		
	

}
