package cn.sunline.dmk.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.sunline.dmk.factory.AbstractFactory;
import cn.sunline.dmk.model.AnimalModel;
import cn.sunline.dmk.model.PlantModel;

public class CreationHouse {
	
	AbstractFactory abstractFactory;
	
	public CreationHouse(AbstractFactory abstractFactory) throws IOException {
		setFactory(abstractFactory);
	}

	private void setFactory(AbstractFactory abstractFactory) throws IOException {
		AnimalModel animal = null;
		PlantModel plant = null;
		
		this.abstractFactory = abstractFactory;
		while(true){
			String speciesType = getSpeciesType();
			String species = getSpecies();
			if(speciesType.equals("plant")){
				plant = abstractFactory.creatSpecies(species);
				if(plant != null){
					plant.create(); // 该方法一定要调，不然不能给父类传name值
					plant.growUp();
					plant.blossom();
				}
			}else if(speciesType.equals("animal")){
				animal = abstractFactory.creatSpecies(species);
				if(animal != null){
					animal.born();
					animal.eat();
					animal.walke();
					animal.run();
				}
			}
		}
	}

	private String getSpecies() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please input detail species:");
		String species = bufferedReader.readLine();
		return species;
	}

	private String getSpeciesType() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please input the species type:");
		String type = bufferedReader.readLine();
		return type;
	}
}
