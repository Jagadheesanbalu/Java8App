package lamda;

public class MainClass {
	
	//Call Reference
	IAddable<Integer> addInteger = this::add;
	//IAddable<Integer> addInteger = UseInbuildFunction::add;
	
	  public static void main(String[] args) {
		String str1 = "Jag";
		String str2 = "Chill";
		// Lamda Expression
		IAddable<String> stringAdder = ( s1,  s2) -> s1 + s2;
		IAddable<Integer> integerAdder = ( s1,  s2) -> s1 + s2;
		// Call Lamda
		System.out.println("String Concat " + stringAdder.add(str1, str2));
		System.out.println("Add " + integerAdder.add(11, 22));
	    
		//Call Reference
		MainClass obj = new MainClass();
		System.out.println(obj.addInteger.add(6 ,9));
		
	  }
	  
	  public Integer add(Integer i, Integer j) {
		  return i + j;
	  }
	  
	  	
	  	
}
