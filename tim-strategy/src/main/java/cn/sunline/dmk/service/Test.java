package cn.sunline.dmk.service;

import cn.sunline.dmk.model.Service1;

public class Test {

	public static void main(String[] args) {
		Service1 ser1 = new Service1();
		ServiceLogic log = new ServiceLogic(ser1);
		System.out.println(log.doSome("ser1"));
	}
}
