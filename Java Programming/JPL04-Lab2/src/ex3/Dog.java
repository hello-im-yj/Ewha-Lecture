/* 1748022 ������
 * 
 * */
package ex3;

//getter-setter �� ���콺 �����ʹ�ư - source - generate Getter and Setters���� �ڵ� ���� ����

public class Dog {
	
	private int size;
	private String name;
	
	public String getName() {
		return name;
	}	

	public void setName(String name) {
		this.name = name;
	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >10) this.size = size;
	}
	
	public void bark() {
		System.out.println("��! ��! ��!");
	}

	public void run() {
		System.out.println(name + " is running" );
	}

}
