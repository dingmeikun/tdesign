package cn.sunline.dmk.test;

import cn.sunline.dmk.build.InterProduct;
import cn.sunline.dmk.manager.Manager;
import cn.sunline.dmk.model.Product;

/**
 *  调用者
 * @author dingmk
 *
 */
public class Invoker{
		
	public static void main(String args[]){
//		Builder builder = new InterProduct(); // 空构造方法，非静态变量不加载，使用加载
//		Manager.Build(builder); // 真正去创建产品属性，并构建产品对象实例
//		Product Product = builder.build(); // 获得产品
		
		Product product = Manager.Build(new InterProduct()).build();
		System.out.println(product.toString());
	}
}