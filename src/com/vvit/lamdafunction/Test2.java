package com.vvit.lamdafunction;

public class Test2 {
	// create an object of list using ArrayList
    static List<String> places = new ArrayList();

    // preparing our data
    @SuppressWarnings("rawtypes")
	public static List getPlaces(){

        // add places and country to the list
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main( String[] args ) {

        @SuppressWarnings("unchecked")
		List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");
        
        // Filter places from Nepal
        ((Object) myPlaces.stream())
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }

}
