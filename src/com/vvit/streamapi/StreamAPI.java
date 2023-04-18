package com.vvit.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		//specify the source using list
		List<Integer> numbers= new ArrayList<Integer>();   //source
		numbers.add(81);
		numbers.add(10);
		numbers.add(21);
		numbers.add(18);
		System.out.println(numbers);
		//creating the stream by using method
		Stream<Integer> st =numbers.stream();
		Set<Integer> set = st.collect(Collectors.toSet());
		System.out.println("Set values are " + set);

		
		
	}

}
