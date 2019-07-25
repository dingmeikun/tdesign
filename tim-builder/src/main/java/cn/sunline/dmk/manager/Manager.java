package cn.sunline.dmk.manager;

import cn.sunline.dmk.build.Builder;

/**
 *  命令集合：类似命令模板，需要集中提前【预】做的事情
 * @author dingmk
 *
 */
public class Manager{
	
	private static Builder sbuilder;
		
	public static Builder Build(Builder builder){
		
		sbuilder = builder;
		
		// 按顺序执行
		// 1 创建window
		sbuilder.makeWindow();
			
		// 2 创建floor
		sbuilder.makeFloor();
		
		return sbuilder;
	}
}