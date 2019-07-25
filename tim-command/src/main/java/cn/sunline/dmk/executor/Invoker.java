package cn.sunline.dmk.executor;

import cn.sunline.dmk.command.ICommand;

/**
 * 命令调用者
 * @author Administrator
 *
 */
public class Invoker{
	
	private ICommand iCommand;
	
	/** 关键：需要设置命令，然后根据命令，执行后续事宜！！ */
	public void setCommand(ICommand iCommand){
		this.iCommand = iCommand;
	}
		
	public void runCommand(){
		this.iCommand.Execute();
	}
}