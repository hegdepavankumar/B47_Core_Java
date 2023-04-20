package com.vvit.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOpe {
	public static void main(String[] args) {
	LinkedList<Integer> lang = new LinkedList<Integer>();
	lang.add(8);
	lang.add(2);
	lang.add(1);
	lang.add(6);
	
	
	Iterator it = lang.iterator();
	Collections.reverse(lang);
	Collections.sort(lang);
	while(it.hasNext());
	System.out.println(it.next() + " ");
	
		
	}

}
