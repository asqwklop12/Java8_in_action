package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Predicate
@FunctionalInterface
interface Predicate<T> {
	boolean test(T t);
}

// Consumer
@FunctionalInterface
interface Consumer<T> {
	void accept(T t);
}

@FunctionalInterface
interface Function<T,R> {
	R apply(T t);
}


public class FunctionalInterFace {

	// Predicate
	public static <T> List <T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}
	
	// Consumer
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for (T i : list) {
			c.accept(i);
		}
	}
	
	//Functional
		public static <T, R> List<R> map(List<T> list,
										Function<T,R> f) {
			
			List<R> result = new ArrayList<>();
			for (T s : list) {
				result.add(f.apply(s));
			}
			return result;
		}
	
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("A","B","","C","","R","M");
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
		System.out.println(nonEmpty);
		
		forEach(
				Arrays.asList(1,2,3,4,5), 
				(Integer i) -> System.out.println(i));
		
		List<Integer> l = map (
				                 Arrays.asList("lambdas", "in", "action"),
				                 (String s) -> s.length()
				               );
		
		System.out.println(l);
	}
}
