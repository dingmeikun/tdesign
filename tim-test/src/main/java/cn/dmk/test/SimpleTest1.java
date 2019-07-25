package cn.dmk.test;

import java.util.HashMap;
import java.util.Map;

public class SimpleTest1 {
	
	private static Map<String, String> map = new HashMap<>();
	
	static{
		map.put("a", "1");
		map.put("b", "2");
	}

	public static void main(String[] args) {
		String a = null;
		System.out.println(getString(a));
	}
	
	public static String getString(String a){
		if(map.containsKey(a)){
			return "a";
		}else{
			return "b";
		}
	}
}
