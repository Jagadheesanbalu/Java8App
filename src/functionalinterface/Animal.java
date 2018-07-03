package functionalinterface;

public interface Animal {
	default public String getName() {
		return "Animal";
	}
}
