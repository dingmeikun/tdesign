package cn.dmk.test;

import java.io.File;
import java.util.List;

import cn.dmk.util.StringUtil;

public class SimpleTest2 {

	public static void main(String[] args) {
		String file1 = "/aa.txt";
		String file2 = "/bb/aa.txt";
		String file3 = "/bb/cc/aa.txt";
		String file4 = "aa.txt";
		
		String fileName = file3.replace('\\', File.separatorChar).replace('/', File.separatorChar);
		List<String> list = getList(fileName);
		
		System.out.println("list:" + list + " -> " + list.size() + " :" + list.toString());
	}
	/**
	 * 
	 * file1 null
	 * file2 [, bb, aa.txt] -> [\bb]
	 * file3 [, bb, cc, aa.txt] -> [\bb, cc]
	 * file4 null
	 * @param fileName
	 * @return
	 */
	public static List<String> getList1(String fileName){
		List<String> ret = null;
		if(fileName.startsWith(String.valueOf(File.separatorChar))){
			if(fileName.substring(1).contains(String.valueOf(File.separatorChar))){
				int idx = fileName.lastIndexOf(File.separatorChar);
				String tempFileName = fileName.substring(1, idx);
				ret = StringUtil.split(tempFileName, File.separatorChar);
			}
		}
		return ret;
	}
	
	/**
	 * file1 null
	 * file2 [\bb]
	 * file3 [\bb, cc]
	 * file4 null
	 * @param fileName
	 * @return
	 */
	public static List<String> getList(String fileName){
		List<String> ret = null;
		boolean abs = false;
		int idx = fileName.indexOf(File.separatorChar);
		if (idx != -1) {
			if (idx == 0) {
				fileName = fileName.substring(idx + 1);
				abs = true;
			}

			idx = fileName.lastIndexOf(File.separatorChar);
			if (idx != -1) {
				fileName = fileName.substring(0, idx);

				ret = StringUtil.split(fileName, File.separatorChar);
				ret.set(0, abs ? File.separatorChar + (String) ret.get(0) : (String) ret.get(0));
			}
		}
		return ret;
	}
}
