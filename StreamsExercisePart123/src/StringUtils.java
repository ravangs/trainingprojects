import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StringUtils {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>(
				Arrays.asList("this", "is", "a", "test", "of", "sorting", "lists", "made", "from", "array"));
		// ex1(words);
		// ex2(words);
		// ex3(words);
		// ex4(words);
		// ex21(words);
		// ex22(words);
		// ex23(words);

		ex3123();
	}

	private static void ex3123() {
		double[] largeDoubleArray = new Random().doubles(10000).toArray();
		double sequentialSum = DoubleStream.of(largeDoubleArray).map(Math::sqrt).sum();
		double parallelSum = DoubleStream.of(largeDoubleArray).parallel().map(Math::sqrt).sum();
		System.out.println(sequentialSum);
		System.out.println(parallelSum);
		if (sequentialSum == parallelSum) {
			System.out.println("equal");
		}
	}

	private static void ex23(List<String> words) {
		String commaConcatenatedString = words.stream().reduce((s1, s2) -> s1 + "," + s2).orElse(null);
		System.out.println(commaConcatenatedString);
	}

	private static void ex22(List<String> words) {
		String upperCaseConcatenatedString = words.stream().map(String::toUpperCase).reduce(String::concat)
				.orElse(null);
		System.out.println(upperCaseConcatenatedString);
	}

	private static void ex21(List<String> words) {
		String upperCaseConcatenatedString = words.stream().reduce(String::concat).orElse(null).toUpperCase();
		System.out.println(upperCaseConcatenatedString);
	}

	private static void ex4(List<String> words) {
		List<String> longWords = words.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
		List<String> evenLengthWords = words.stream().filter(s -> (s.length() % 4) == 0).collect(Collectors.toList());
		System.out.println(longWords);
		System.out.println(evenLengthWords);
	}

	private static void ex3(List<String> words) {
		List<String> excitingWords = words.stream().map(s -> s + "!").collect(Collectors.toList());
		List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(excitingWords);
		System.out.println(upperCaseWords);

	}

	private static void ex2(List<String> words) {
		words.stream().forEach(System.out::println);

	}

	private static void ex1(List<String> words) {
		words.stream().forEach(s -> System.out.println("  " + s));
	}
}
