package cn.sunline.dmk.template;

public abstract class Template{
		
		// 启动
		protected abstract void start();
		
		// final修饰，子类不能修改他的执行顺序
		final public void run(){
			this.start();
			
			this.stop();
		}
		
		// stop
		protected abstract void stop();
	}