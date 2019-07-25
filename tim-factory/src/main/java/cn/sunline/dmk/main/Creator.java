package cn.sunline.dmk.main;

import cn.sunline.dmk.factory.AnimalFactory;
import cn.sunline.dmk.factory.PlantsFactory;

public class Creator {

	public static void main(String[] args) {
		try {
			CreationHouse house = new CreationHouse(new PlantsFactory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
