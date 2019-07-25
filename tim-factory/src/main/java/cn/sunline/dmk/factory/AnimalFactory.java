package cn.sunline.dmk.factory;

import cn.sunline.dmk.entity.Dragon;
import cn.sunline.dmk.entity.Phoenix;
import cn.sunline.dmk.model.AnimalModel;

public class AnimalFactory implements AbstractFactory{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T creatSpecies(String species) {
		AnimalModel animal = null;
		if(species.equals("dragon")){
			animal = new Dragon();
		}else if(species.equals("phoenix")){
			animal = new Phoenix();
		}
		return (T) animal;
	}

}
