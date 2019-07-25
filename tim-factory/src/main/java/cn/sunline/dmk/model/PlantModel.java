package cn.sunline.dmk.model;

public abstract class PlantModel extends BaseModel{

	protected String name;
	public PlantModel(){};
	public abstract void create();
	
	public void growUp(){
		System.out.println(name + " is growup ~");
	}
	
	public void blossom(){
		System.out.println(name + "is blossom ~");
	}
	
	public void setName(String name){
		this.name = name;
		System.out.println("---------" + name);
	}
}
