package cn.sunline.dmk.dynamic.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import cn.sunline.dmk.dynamic.agent.DynamicProxy;
import cn.sunline.dmk.dynamic.agent.Human;
import cn.sunline.dmk.dynamic.agent.IUser;

/**
 * 注意了，这里还是那句话：我们代理的是接口，将被调用的是接口的所有方法，在调用时，会动态的将方法名传递到内存，然后去执行这个方法的
 * @author dingmk
 *
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		IUser user = new Human();
		InvocationHandler h = new DynamicProxy(user);
		IUser proxy = (IUser) Proxy.newProxyInstance(IUser.class.getClassLoader(), new Class[]{IUser.class}, h);
		proxy.run("man");
	}
}