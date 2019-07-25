package cn.sunline.dmk.command.impl;

import cn.sunline.dmk.command.ICommand;
import cn.sunline.dmk.executor.Executor;

public class CommandImplB implements ICommand{
	
	private Executor executor;
		
	public CommandImplB(Executor executor){
		this.executor = executor;
	}
		
	public void Execute(){
		this.executor.executeTranB();
	}
}