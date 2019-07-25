package cn.sunline.dmk.entity;

import cn.sunline.dmk.model.AnimalModel;

public class Dragon extends AnimalModel{

	@Override
	public void born() {
		super.setName("Dragon");
		System.out.println(name + " is borned ~");
	}

}
