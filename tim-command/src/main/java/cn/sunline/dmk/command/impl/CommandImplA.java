package cn.sunline.dmk.command.impl;

import cn.sunline.dmk.command.ICommand;
import cn.sunline.dmk.executor.Executor;

/**
 *  命令实现者
 */
public class CommandImplA/*实现命令接口*/ implements ICommand/*命令接口*/{
		
	private Executor executor;
			
	public CommandImplA(Executor executor/*传参：外部构造执行者*/){
		this.executor = executor;
	}
			
	public void Execute/*执行命令*/(){
		this.executor.executeTranA();
	}
}

