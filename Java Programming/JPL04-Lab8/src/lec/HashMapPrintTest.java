package lec;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrintTest {
	
	public static void main(String args[]) {
		
		//Map <String,Object> map = new HashMap<String,Object>();
		
		HashMap<String,String> loginData = new HashMap<String,String> ();
		
		loginData.put("89123", "��¿�");
		loginData.put("04123","������");
		loginData.put("13323", "������");
		
		for (Map.Entry<String, String> entry : loginData.entrySet() ) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key�� "+key+ "value�� "+ value);
		}
		
		int i=0;
		for (String key : loginData.keySet()) {
			System.out.println(i++ + key);
		}
		
		//i=0;
		for (String value : loginData.values()) {
			System.out.println(i++ + value);
		}


	}

}
