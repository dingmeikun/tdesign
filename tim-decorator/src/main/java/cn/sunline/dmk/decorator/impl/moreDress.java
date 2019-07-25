package cn.sunline.dmk.decorator.impl;

import cn.sunline.dmk.decorator.Beauty;

/**
 * 装饰对象，持有被装饰对象实例
 * @author dingmk
 *
 */
public class moreDress implements Beauty{
	
	private Beauty beauty;
		
	public moreDress(Beauty beauty){
		this.beauty = beauty;
	}
		
	public void beautiful(){
		System.out.println("我先去逛了大商场"); // more 功能
	
		this.beauty.beautiful();
		
		System.out.println("再买了一个漂亮的包包！"); // more 功能
	}
}