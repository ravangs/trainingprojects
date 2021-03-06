import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtils {

	public static void main(String[] args) {
		//ex1();
		//ex2();
		ex34();
	}

	private static void ex34() {
		List<String> words = new ArrayList<String>(
				Arrays.asList("error", "this", "is", "an", "array", "which", "has", "words", "like", "xylophone"));
		List<Integer> newWords = transformedList(words, String::length);
		List<String> exclamationWords = transformedList(words, s -> s + "!");
		
		System.out.println(exclamationWords);
		System.out.println(newWords);
	}

	private static void ex2() {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> evenNums = allMatches(nums, i -> (i % 2) == 0);

		System.out.println(evenNums);
	}

	private static void ex1() {
		List<String> words = new ArrayList<String>(
				Arrays.asList("error", "this", "is", "an", "array", "which", "has", "words", "like", "xylophone"));
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		List<String> wordsWithA = allMatches(words, s -> s.contains("a"));
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);

		
		System.out.println(shortWords);
		System.out.println(wordsWithA);
		System.out.println(evenLengthWords);
	}

	public static <T, R> List<R> transformedList(List<T> tList, Function<T, R> function) {
		List<R> newList = new ArrayList<>();
		for (T entry : tList) {
			newList.add(function.apply(entry));
		}
		return newList;
	}

	public static <T> List<T> allMatches(List<T> stringList, Predicate<T> stringPredicate) {
		List<T> newList = new ArrayList<T>();
		Iterator<T> i = stringList.iterator();
		while (i.hasNext()) {
			T newElement = i.next();
			if (stringPredicate.test(newElement)) {
				newList.add(newElement);
			}
		}
		return newList;
	}

}
