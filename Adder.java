/**
   Purpose of this exercise: check your understanding of local variables, instance variables, parameters

   Read carefully the following code.
   - what does it print?
   - compile and run the code to check your answer

 */

public class Adder {
	private int a;
	private int b;

	public Adder(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int weirdAdd() {
		int a = 0;
		int b = 0;
		return a + b;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int weirdAdd(int a, int b) {
		return this.a + b;
	}



	public static void main(String[] argc) {
		Adder s = new Adder(40, 30);
		System.out.println(s.add());
		System.out.println(s.weirdAdd());
		System.out.println(s.add(3,2));
		System.out.println(s.weirdAdd(3,2));
	}
}