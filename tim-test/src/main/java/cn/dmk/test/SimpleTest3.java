package cn.dmk.test;

public class SimpleTest3 {

	public static void main(String[] args) {
		String a = "1x";
		try{
			Integer.valueOf(a);
			System.out.println("-----------");
		}catch(Exception e){
			//e.printStackTrace();
			throw new RuntimeException("xxxxxxxxx");
		}
		
		System.out.println("============");
	}
}
