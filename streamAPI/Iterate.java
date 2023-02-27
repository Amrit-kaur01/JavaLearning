package streamAPI;

//stream.iterate() is used to create stream values on demand. It is infinite stream

import java.util.stream.*;
import java.util.*;

public class Iterate {
	public static void main(String[] args) {
		// print numbers from 1 to 10
		Stream.iterate(1, n -> n + 1) // Stream.iterate(initialValue, nextValue)
				.limit(10).forEach(x -> System.out.print(x + ", "));

		System.out.println();

		// stream of odd numbers
		Stream.iterate(1, n -> n + 2).limit(10).forEach(x -> System.out.print(x + ", "));

		System.out.println();

		// Fibonacci series
		List<Integer> fibSeries = Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10)
				.map(n -> n[0]).collect(Collectors.toList());
		System.out.println(fibSeries);

		// Sum all the fibonacci values
		int sum = Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10) // limit is
																										// short-circuiting
																										// intermediate
																										// operation
				.map(n -> n[0]) // Stream<Integer>
				.mapToInt(n -> n) // returns an IntStream
				.sum();

		System.out.println(sum);

	}
}

//Stream<Integer> is a stram of Integer objects
//IntStream is a stream of primitive int values

/*
 * an intermediate operation is short-circuiting if, when presented with
 * infinite input, it gives a finite stream as a result a terminal operation is
 * short-circuiting if, when presented with infinite input, it may terminate in
 * finite time
 */