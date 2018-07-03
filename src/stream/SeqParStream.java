package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SeqParStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> result = new ArrayList<Integer>();
		Stream<Integer> stream =  list.parallelStream();
		stream.map(x -> {
			synchronized (result) {
				if(result.size()<10) {
					result.add(x);
				}
			}
			return x;
		}).forEach(z -> {});
		System.out.println("result:"+result);
	}

}
