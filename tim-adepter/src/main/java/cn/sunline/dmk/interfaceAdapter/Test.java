package cn.sunline.dmk.interfaceAdapter;

public class Test {
	
    public static void main(String[] args){
    	
    	TargetImpl1 ss=new TargetImpl1();
    	TargetImpl2 sm=new TargetImpl2();
        ss.method1();
        ss.method2();
        sm.method1();
        sm.method2();
    }
}