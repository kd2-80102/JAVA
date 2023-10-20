package mysol_12_q4;


@FunctionalInterface
interface Check<T> {
    boolean compare(T x, T y);
}

public class Main {
	
	static <T> int countIf(T[] arr, T key, Check<T> c) {
        int count = 0;
        for (T element : arr) {
            if (c.compare(element, key)) {
                count++;
            }
        }
        return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {44, 77, 99, 22, 55, 66};
        Integer key = 50;

        int cnt = countIf(arr, key, (x, y) -> x > y);
        System.out.println("Count = " + cnt);
		
		

	}

}
