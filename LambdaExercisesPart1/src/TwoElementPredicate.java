@FunctionalInterface
public interface TwoElementPredicate<T> {
	
	public boolean isFirstBetter(T element1,T element2);
}