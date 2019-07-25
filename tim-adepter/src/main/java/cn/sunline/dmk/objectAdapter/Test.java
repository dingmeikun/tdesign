package cn.sunline.dmk.objectAdapter;

public class Test {
	
    public static void main(String[] args){
    	
        Source source=new Source();
        Target target=new Adapter(source);
        target.method1();
        target.method2();
    }
}