package cn.dmk.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

	public static List<String> split(String filename, char idx){
		List<String> ret = new ArrayList<>();
		String[] files = filename.split(String.valueOf(idx));
		for(String file : files){
			ret.add(file);
		}
		return ret;
	}
}
