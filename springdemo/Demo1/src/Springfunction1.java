import java.util.List;

public class Springfunction1 {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,9,13,4,6,2,4,12,15);
		
odd(numbers);
	}
	private static void odd(List<Integer> numbers) {
		(numbers.stream()).filter(number ->numbers.get(0)%2==0).forEach(System.out::println);
	}

}
