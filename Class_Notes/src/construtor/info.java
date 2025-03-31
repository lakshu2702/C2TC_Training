package construtor;

public class info {

	public static void main(String[] args) {
		ConstructorProgram ob = new ConstructorProgram(2,"manu","bang");
		System.out.println(ob);
		boolean output = ((ob) instanceof ConstructorProgram);
		System.out.println(output);
	}

}