package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		//Wrapper
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(i -> System.out.print(i+","));
		System.out.println();
		Stream<Integer> streama = Stream.of(new Integer[]{10,20,30,40,50});
		streama.forEach(i -> System.out.print(i+","));
		System.out.println();
		
		//From Collections
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream1 = list.stream();
		stream1.forEach(i -> System.out.print(i+","));
		System.out.println();
		Stream<Integer> stream1a = list.parallelStream();
		stream1a.forEach(i -> System.out.print(i+","));
		System.out.println();
		
		//Infinite Stream
		Stream<Integer> stream2 = Stream.generate(() -> { return 123;});
		stream2.limit(10).forEach(i -> System.out.print(i+","));
		System.out.println();
		Stream<Integer> stream2a = Stream.iterate(321, i -> i);
		stream2a.limit(10).forEach(i -> System.out.print(i+","));
		System.out.println();
		
		//Primitive
		LongStream stream3 = Arrays.stream(new long[]{6,7,8,9});
		stream3.forEach(i -> System.out.print(i+","));
		System.out.println();
		IntStream stream3a = "abc".chars();
		stream3a.forEach(System.out::print);
	}

}
