package cn.sunline.dmk.model;

public class Service2 implements IService{

	@Override
	public String doSomething(String str) {
		return "This " + str + " is service2 impl!";
	}
}
