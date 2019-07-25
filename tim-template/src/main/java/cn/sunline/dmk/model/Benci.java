package cn.sunline.dmk.model;

import cn.sunline.dmk.template.Template;

public class Benci extends Template{
		
		@Override
		public void start() {
			System.out.println("奔驰启动");
		}
		@Override
		public void stop() {
			System.out.println("奔驰停车");
		}
	}