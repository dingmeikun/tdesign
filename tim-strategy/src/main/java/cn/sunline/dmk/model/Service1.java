package cn.sunline.dmk.model;

public class Service1 implements IService{

	@Override
	public String doSomething(String str) {
		return "This " + str + " service1 impl!";
	}

}
