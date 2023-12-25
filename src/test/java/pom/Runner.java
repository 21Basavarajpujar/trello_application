package pom;

public class Runner {
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.display(45);
		mol.display(12, "java");
		mol.display(45.65);
		mol.display();
		mol.display("java Eclipse", 123);
	}
}
