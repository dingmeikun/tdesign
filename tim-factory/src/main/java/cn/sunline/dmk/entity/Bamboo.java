package cn.sunline.dmk.entity;

import cn.sunline.dmk.model.PlantModel;

public class Bamboo extends PlantModel{

	@Override
	public void create() {
		super.setName("Bamboo");
		System.out.println(name + " is created ~");
	}

}
