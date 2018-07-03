package functionalinterface;

public interface Dog {
	default public String getName() {
		return "Dog";
	}
}
