package ru.avalon.java.dev.j110.labs;

/**
 * @author Nikolai Shilenko
 *
 */
public class A {
	
	public static void main (String[] args) {
		A a = new A(A.a, A.a);
	}
	
	private static A a;
	
	public A() {
		System.out.println("A:A()");
	}
	
	public A(A arg) {
		this();
		System.out.println("A:A(A)");
	}
	
	protected A(A arg, A arg2) {
		this(arg);
		System.out.println("A:A(A, A)");
	}
	
	public void a() {
		
	}
	
	protected void a(A arg) {
		
	}
	
	private void a(A arg, A arg2) {
		
	}
}
