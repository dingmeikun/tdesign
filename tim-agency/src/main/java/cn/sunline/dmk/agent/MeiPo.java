package cn.sunline.dmk.agent;

public class MeiPo implements FamilyStatus{
	
	private FamilyStatus familyStatus;
	
	public MeiPo(){
		this.familyStatus = new LiangShanBo();
	}
	
	public MeiPo(FamilyStatus familyStatus){
		this.familyStatus = familyStatus;
	}

	@Override
	public void marryStatus() {
		this.familyStatus.marryStatus();
	}

}
