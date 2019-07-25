package cn.sunline.dmk.factory;

public abstract interface AbstractFactory {

	public <T> T creatSpecies(String species);
}
