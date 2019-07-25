package cn.sunline.dmk.test;

import cn.sunline.dmk.decorator.Beauty;
import cn.sunline.dmk.decorator.impl.hotDress;
import cn.sunline.dmk.decorator.impl.moreDress;

/**
 *  测试调用
 */
public class Test{
			
	public static void main(String args[]){
		Beauty hotbeauty = new hotDress();
		Beauty moreBeauty = new moreDress(hotbeauty);
		moreBeauty.beautiful();
	}
}

