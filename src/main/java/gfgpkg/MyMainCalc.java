package gfgpkg;

public class MyMainCalc {

	public static void main(String[] args) {
		
		MyCalc obCalc	= new MyCalc();
		System.out.println(obCalc.sum(20, 10));
		System.out.println(obCalc.sub(20, 10));
		System.out.println(obCalc.mul(20, 10));
		System.out.println(obCalc.div(20, 10));	
		obCalc.display();
	}
}