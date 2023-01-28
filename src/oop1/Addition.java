package oop1;

public class Addition {
	
	//instance variable
	private int x;
	private int y;
	
	//Poly (many) morphism
	//1. Method overloading
	
	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}

	//return type method name ()
	void add () {
		int sum = x+y; //local variable
		System.out.println(sum);
	}//end add
	
	public int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}//end add
	
	protected double add(double a, double b, double c) {
		double sum = a+b+c;
		return sum;
	}//end add

	public static void main(String[] args) {
		
		 Addition a1 = new Addition();
		 a1.x=10;
		 a1.y=20;
		 a1.add();
		 System.out.println(a1.add(200, 200, 200));
		 System.out.println(a1.add(200.3, 200.7, 200.7));
		 
		 Addition a2 = new Addition ();
		 a2.x=100;
		 a2.y=200;
		 a2.add();

	}//end main

}//end class
