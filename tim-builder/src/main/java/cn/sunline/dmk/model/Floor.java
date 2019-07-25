package cn.sunline.dmk.model;

/**
 * 复合对象产品 属性：Floor
 * @author dingmk
 *
 */
public class Floor {

	private String size;
	private String lengh;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLengh() {
		return lengh;
	}
	public void setLengh(String lengh) {
		this.lengh = lengh;
	}
	
	public Floor(String size, String lengh) {
		super();
		this.size = size;
		this.lengh = lengh;
	}
	
	@Override
	public String toString() {
		return "Floor [size=" + size + ", lengh=" + lengh + "]";
	}
}
