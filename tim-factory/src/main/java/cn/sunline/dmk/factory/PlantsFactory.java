package cn.sunline.dmk.factory;

import cn.sunline.dmk.entity.Bamboo;
import cn.sunline.dmk.entity.Bigtree;
import cn.sunline.dmk.model.PlantModel;

public class PlantsFactory implements AbstractFactory{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T creatSpecies(String species) {
		PlantModel plants = null;
		if(species.equals("bamboo")){
			plants = new Bamboo();
		}else if(species.equals("bigtree")){
			plants = new Bigtree();
		}
		return (T) plants;
	}

}
