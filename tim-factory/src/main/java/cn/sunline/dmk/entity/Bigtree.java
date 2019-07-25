package cn.sunline.dmk.entity;

import cn.sunline.dmk.model.PlantModel;

public class Bigtree extends PlantModel{

	@Override
	public void create() {
		super.setName("big tree");
		System.out.println(name + " is created ~");
	}
}
