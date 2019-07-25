package cn.dmk.test;

import java.io.IOException;

import cn.dmk.util.FileUtils;

public class SimpleTest {

	public static void main(String[] args) {
		String path = "C:\\Users\\Administrator\\Desktop\\bb\\etc\\.version";
		String aa = "11";
		String bb = "22";
		String cc = "33";
		StringBuffer sb = new StringBuffer();
		sb.append("aa=" + aa + "\r\nbb=" + bb + "\r\ncc=" + cc);
		
		try {
			FileUtils.writeToFile(path, sb.toString(), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
