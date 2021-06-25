/* 1748022 김유진 */

public class Author extends Person { //Person class를 상속받는 Author class.
	//필드 (캡슐화)
	private String career; //저자 경력
	
	//생성자
	
	//매개변수 4개를 입력받은 경우
	public Author(String name, String birth, Gender gender, String career) {
		super(name,birth,gender); 
		// name, birth, gender 필드는 superclass에 매개변수로 전달하여 생성한다. 
		this.career = career;
		//그 후 입력받은 career값을 객체의 career 필드에 저장한다.  
	}
	
	//매개변수가 없는 경우
	public Author() {
		super(); //superclass의 매개변수가 없는 생성자를 호출하여 객체의 필드를 설정한 값으로 초기화한다. 
		this.career = " "; //그 후 경력 필드는 빈 값으로 초기화한다. 
	}
	
	//메소드
	
	//getter&setter
	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	//showInfo() 메서드 : 저자 정보를 출력하는 메소드
	@Override
	public void showInfo() {
		super.showInfo(); //상속받은 superclass의 showInfo();메소드를 이용하여 저자 정보를 출력한다. 
		System.out.println("경력 : " + career); // 그 후 끝에 경력에 대한 정보를 추가적으로 출력해준다. 
	}
		
	

}
