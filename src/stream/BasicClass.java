package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		
		// Sum of 100 odd natural numbers
		//Before Java8
		int sum=0;
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer x = itr.next();
			if(x>10) {
				sum += x;
			}
		}
		System.out.println("Sum of odd natural numbers:"+sum);
		
		//From Java8
		Stream<Integer> stream = list.stream();
		System.out.println(stream.filter(x -> x>10).mapToInt(i -> i).sum());
		
		//Sort
		Stream<String> stream1 = Stream.of("bdf","absf","123","dfsd");
		//List<String> li = stream1.sorted().collect(Collectors.toList());
		List<String> li = stream1.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(li);
		
		//Stream List to Stream
		Stream<List<String>> stream2 = Stream.of(
				Arrays.asList("abc"),Arrays.asList("bdf", "agg"),Arrays.asList("gdf","xcv"));
		Stream<String> flatStream = stream2.flatMap(strList -> strList.stream());
		flatStream.forEach(System.out::println);
		
		//Terminal Operations
		//Reduce
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
		Optional<Integer> oi = stream3.reduce((i,j) -> {return i*j;});
		if(oi.isPresent())
			System.out.println("Opt :"+oi.get());
		
		//Match
		Stream<Integer> stream4 = Stream.of(1,2,3,4,5);
		//System.out.println(stream4.anyMatch(i -> i==3));
		System.out.println(stream4.allMatch(i -> i==3));
		//System.out.println(stream4.noneMatch(i -> i==3));
	
		Stream<String> stream5 = Stream.of("Jega","Vega","Sega","Mega");
		Optional<String> fa = stream5.filter(i -> i.contains("e")).findAny();
		Stream<String> stream6 = Stream.of("Jega","Vega","Sega","Mega");
		Optional<String> ff = stream6.filter(i -> i.contains("e")).findFirst();
		if(fa.isPresent())
			System.out.println(fa.get());
		if(ff.isPresent())
			System.out.println(ff.get());
	}

}
