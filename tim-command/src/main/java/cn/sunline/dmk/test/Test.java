package cn.sunline.dmk.test;

import cn.sunline.dmk.command.impl.CommandImplA;
import cn.sunline.dmk.command.impl.CommandImplB;
import cn.sunline.dmk.executor.Executor;
import cn.sunline.dmk.executor.Invoker;

/**
 *  测试调用
 */
public class Test{
			
	public static void main(String args[]){
		Executor executor = new Executor();
		Invoker invoker = new Invoker();
		
		invoker.setCommand(new CommandImplA(executor));
		invoker.runCommand();
		
		invoker.setCommand(new CommandImplB(executor));
		invoker.runCommand();
	}
}

