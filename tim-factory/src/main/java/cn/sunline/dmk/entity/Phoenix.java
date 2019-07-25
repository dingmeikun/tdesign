package cn.sunline.dmk.entity;

import cn.sunline.dmk.model.AnimalModel;

public class Phoenix extends AnimalModel{

	@Override
	public void born() {
		super.setName("Phoenix");
		System.out.println(name + " is borned ~");
	}
}
