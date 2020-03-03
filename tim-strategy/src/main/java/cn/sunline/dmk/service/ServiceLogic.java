package cn.sunline.dmk.service;

import cn.sunline.dmk.model.IService;

public class ServiceLogic {

	private IService service;
	
	public ServiceLogic(IService service) {
		this.service = service;
	}
	
	public String doSome(String str) {
		return this.service.doSomething(str);
	}
}
