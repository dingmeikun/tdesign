package cn.sunline.dmk.model;

/**
 * 复合对象：产品
 * @author dingmk
 *
 */
public class Product {
	
	private Window window;
	private Floor floor;
	
	public Window getWindow() {
		return window;
	}
	public void setWindow(Window window) {
		this.window = window;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "Product [window=" + window + ", floor=" + floor + "]";
	}
	
}