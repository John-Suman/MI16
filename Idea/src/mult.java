class A{
	protected int a=10;
	protected void disp() {
		System.out.println(a);
	}
}
class B extends A{
	int b=5;
	void display()
	{
		System.out.println(a);
	}

}
class C extends B{
	void dis()
	{
		System.out.println(a); 
		System.out.println(b); 
	}
}
public class mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.disp();
		C c=new C();
		c.disp();
		c.dis();
	}

}
