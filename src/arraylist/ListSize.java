package arraylist;

import java.util.ArrayList;
import java.util.Vector;

public class ListSize {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		Vector<Integer> vec = new Vector<Integer>();
		System.out.println("Size:"+li.size()+"|Capacity:"+vec.capacity());
	}
	

}
