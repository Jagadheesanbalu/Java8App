package functionalinterface;

public class Billy implements Animal, Dog {

	@Override
	public String getName() {
		return Animal.super.getName();
	}
	
	public static void main(String[] args) {
		Billy b = new Billy();
		System.out.println(b.getName());
	}

}
