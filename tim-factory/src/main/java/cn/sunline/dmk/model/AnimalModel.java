package cn.sunline.dmk.model;

public abstract class AnimalModel extends BaseModel{

	protected String name;
	public AnimalModel(){};
	public abstract void born();
	
	public void run(){
		System.out.println(name + " is running ~");
	}
	
	public void walke(){
		System.out.println(name + " is walking ~");
	}
	
	public void eat(){
		System.out.println(name + " is eatting ~");
	}
	
	public void setName(String name){
		this.name = name;
	}
}
