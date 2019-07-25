package cn.sunline.dmk.model;

/**
 * 复合对象产品 属性：window
 * @author dingmk
 *
 */
public class Window {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Window(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Window [name=" + name + "]";
	}
}
