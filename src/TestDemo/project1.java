package TestDemo;

public class project1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		project1 A = new project1();
		project1 B = new project1();
		project1 C = new project1();
		// Nullifying
		A = null;
		//Reassigning
		
		System.out.println(A);//1dbd16a6
		System.out.println(B);//7ad041f3
		System.out.println(C);//251a69d7
		System.out.println("main method Ended");
		
		

	}

}
