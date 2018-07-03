package lamda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class UseInbuildFunction {

	String name;
	
	public UseInbuildFunction(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		//
		Stream<Integer> stream2 = Stream.iterate(1, n -> n + 1);
		stream2.limit(50).forEach(s-> System.out.print(s + ","));
		
		//2.Function
		Function<String, Integer> fn = (str) -> Integer.valueOf(str);
		Integer i = fn.apply("34");
		System.out.println("Function:"+i);
		
		ToIntFunction<String> tifn = str -> Integer.valueOf(str);
		int in = tifn.applyAsInt("44");
		System.out.println("String to Int:"+in);
		
		IntFunction<String> ifn = x -> String.valueOf(x);
		String res = ifn.apply(32);
		System.out.println("Int to String:"+res);
		
		//Unary Operator
		UnaryOperator<String> uo = (str) -> "$" + str + "$";
		System.out.println("UnaryOperator:"+uo.apply("Jaggy"));
		
		//BiFunction
		BiFunction<String, String, Integer> bf = (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
		Integer ii = bf.apply("11", "22");
		System.out.println("BiFunction:"+ii);
		
		//Binary Operator
		BinaryOperator<String> bo = (str1,str2) -> str1 + str2;
		System.out.println("BinaryOperator:"+bo.apply("Hello", "Jaggy"));
		
		//Constructor Reference
		Function<String, UseInbuildFunction> confn = name -> new UseInbuildFunction(name);
		UseInbuildFunction obj = confn.apply("India");
		System.out.println("Refer Class field via Constructor Refernce:"+obj.name);
		
		//1.Predicate
		Predicate<String> pr = (str) -> str.isEmpty();
		boolean boo = pr.test("Welcomee");
		System.out.println("Predicate:"+boo);
		
		//3.Consumer
		Consumer<String> cn = str -> System.out.println("Hello "+str);
		cn.accept("Test User");
		
		//4.Supplier
		Supplier<Integer> sp = () -> 10;
		System.out.println("Supplier :"+sp.get());
	}
	
	  public static Integer add(Integer i, Integer j) {
		  return i + j;
	  }

}
