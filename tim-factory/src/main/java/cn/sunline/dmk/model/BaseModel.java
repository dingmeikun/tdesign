package cn.sunline.dmk.model;

public class BaseModel {

	private int natureId;
	private int natureAge;
	private String natureType;
	private String description;
	private boolean natureAlive;
	
	public int getNatureId() {
		return natureId;
	}
	public void setNatureId(int natureId) {
		this.natureId = natureId;
	}
	public String getNatureType() {
		return natureType;
	}
	public void setNatureType(String natureType) {
		this.natureType = natureType;
	}
	public int getNatureAge() {
		return natureAge;
	}
	public void setNatureAge(int natureAge) {
		this.natureAge = natureAge;
	}
	public boolean isNatureAlive() {
		return natureAlive;
	}
	public void setNatureAlive(boolean natureAlive) {
		this.natureAlive = natureAlive;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
