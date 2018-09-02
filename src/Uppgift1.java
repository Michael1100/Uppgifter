
public class Uppgift1 {

	public static int sum(int... numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum+= n;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
	}
}
