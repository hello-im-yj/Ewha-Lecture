/* 1748022 ������ */

public class Author extends Person { //Person class�� ��ӹ޴� Author class.
	//�ʵ� (ĸ��ȭ)
	private String career; //���� ���
	
	//������
	
	//�Ű����� 4���� �Է¹��� ���
	public Author(String name, String birth, Gender gender, String career) {
		super(name,birth,gender); 
		// name, birth, gender �ʵ�� superclass�� �Ű������� �����Ͽ� �����Ѵ�. 
		this.career = career;
		//�� �� �Է¹��� career���� ��ü�� career �ʵ忡 �����Ѵ�.  
	}
	
	//�Ű������� ���� ���
	public Author() {
		super(); //superclass�� �Ű������� ���� �����ڸ� ȣ���Ͽ� ��ü�� �ʵ带 ������ ������ �ʱ�ȭ�Ѵ�. 
		this.career = " "; //�� �� ��� �ʵ�� �� ������ �ʱ�ȭ�Ѵ�. 
	}
	
	//�޼ҵ�
	
	//getter&setter
	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	//showInfo() �޼��� : ���� ������ ����ϴ� �޼ҵ�
	@Override
	public void showInfo() {
		super.showInfo(); //��ӹ��� superclass�� showInfo();�޼ҵ带 �̿��Ͽ� ���� ������ ����Ѵ�. 
		System.out.println("��� : " + career); // �� �� ���� ��¿� ���� ������ �߰������� ������ش�. 
	}
		
	

}
