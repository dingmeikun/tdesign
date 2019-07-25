package cn.sunline.dmk.dynamic.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，只能代理接口，不能代理抽象类，代理类都需要实现InvocationHandler，同时实现invoke方法！
 * 注意：
 * 		1.当调用被代理的接口的所有方法时，会调用这里的invoke()方法
 * 		2.这个invoke()方法的返回值，就是被代理接口的一个实现类
 * 
 * 另外特别注意：当前类DynamicProxy并不是代理类，仅仅是创建代理对象实例的一个中间环节。我们可以说他是调用处理器的实例对象
 * 			里边的Object并不是“代理类的实例对象”，而是去创建“代理类的实例对象”的一个中间参数，代理类创建需要使用Proxy
 *	也就是说：代理类/代理类实例对象/代理类对象实例 = 是由Proxy.newProxyInstance(Thread.CurrentThread().getClassLoader(), new Class[]{IService.class}, new InvocationHandlerimpl());
 * 		   IService proxy = Proxy.newProxyInstace(Thread.CurrentThread().getClassLoader(), new Class[]{IServer.class}, new InvocationHandlerimpl());
 * 
 * @author dingmk
 *
 */
public class DynamicProxy implements InvocationHandler{

	/** 被代理对象的真实对象实例 */ // 注意了，这里对象和对象实例是不一样的！！！对象可能只是申明，而实例则是通过了实例化newInstance()
	private Object object;
	
	/** 默认构造函数，传递被代理对象实际的实现类对象 */
	public DynamicProxy(Object obj){
		this.object = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO
		method.invoke(object, args);
		// TODO
		return null;
	}

}
