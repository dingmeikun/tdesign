package cn.sunline.dmk.model;

import cn.sunline.dmk.template.Template;

public class Baoma extends Template{
		
		@Override
		public void start() {
			System.out.println("宝马启动");
		}
		@Override
		public void stop() {
			System.out.println("宝马停车");
		}
	}