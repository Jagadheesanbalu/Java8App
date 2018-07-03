package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStream {

	public static void main(String[] args) {
		//Stream to Collections
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		List<Integer> list = stream.collect(Collectors.toList());
		System.out.println(list);
		stream = Stream.of(1,2,3,4,5);
		Map<Integer,Integer> map = stream.collect(Collectors.toMap(i -> i, i -> i + 10));
		System.out.println(map);
		
		//Stream to Array
		stream = Stream.of(1,2,3,4,5);
		Integer[] arr = stream.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
	}

}
