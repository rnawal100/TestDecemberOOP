package oop1;

public class Substraction extends Addition {
	
	//OOP
	//1. Inheritance
	//2. Polymorphism - a.overloading b.overriding
	//3. Encapsulation
	//4. Abstraction
	
	void sub(int a, int b) {
		int s = a-b;
		System.out.println(s);
	}//end sub
	
	public int add(int a, int b, int c) {
		int sum = a+b+c+5;
		return sum;
	}// end add (overriding)
	
	//inheritance - establish a parent and child relationship b/w two class.

	public static void main(String[] args) {
		
		Substraction s1 = new Substraction();
		s1.sub(100, 50);
		
		//100+100+100-75
		int sum = s1.add(100, 100, 100);
		s1.sub(sum, 75);

	}//end main
}//end class
