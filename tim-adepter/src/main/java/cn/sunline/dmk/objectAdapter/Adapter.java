package cn.sunline.dmk.objectAdapter;

public class Adapter implements Target{

	private Source source;
	
	public Adapter(Source source){
		this.source = source;
	}
	
	public void method1() {
		source.method1();
    }
	
    public void method2() {
        System.out.println("Target 的method2方法!");
    }

}
