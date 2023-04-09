package chap9.practice;

public class Collections {
	public static<T> boolean addAll(Collecton<? super T> c, T.. elements) {
		boolean result = false;
		for(T element : elements)
			result |= c.add(element);
		return result;
	}
}
