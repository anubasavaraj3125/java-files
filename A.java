public interface A {
	void a();
	void b();
	void c();
	void d();

}
abstract class B implements A 
{
	public void c() {System.out.println("I Am c");}
}
class C extends B {

	public void a() {System.out.println("I am A");}
	public void b() {System.out.println("I am B");}
	public void d() {System.out.println("I am D");}
}


class Testabstarct{
public static void main(String[] args) {
	A a=new C();
	a.a();
	a.b();
	a.c();
	a.e();
	
}

}
