package cn.sunline.dmk.simple;

public class Singleton {

	private static Singleton instance;
	
	public Singleton(){};
	
	/**
	 *  懒汉模式：简单单例模式，线程不安全：当多个调用者同时调用，则会出现多个对象
	 *  
	 * @return
	 */
	public static Singleton getInstance(){
		if(null == instance){
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * 懒汉模式：线程安全，效率很低，并发模式下，被锁住资源，很浪费时间，需要等待，效率太低
	 * 
	 * @return
	 */
	public static synchronized Singleton getSafeInstance(){
		if(null == instance){
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * 饿汉模式：加载类时一次loading，直接访问
	 */
	private static Singleton instances = new Singleton();
	public static Singleton getSafe1Instance(){
		return instances;
	}
	
	/**
	 * 双重校验锁：两个线程同时进来拿实例，通过两层锁判断及等待，只会返回一个对象实例
	 * 
	 * @return
	 */
	public static Singleton getSyncInstance(){ // 判断是否为空，第一次为空，则锁住改需要实例化的对象，继续判断，再为空，则实例化对象
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
