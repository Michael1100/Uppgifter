import java.util.ArrayList;

public class NewUppgift1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int x = 10;
		
		
		for (int i = 0; i <= x; i++) {
			list.add(i);
		}
		
		int sum = 0;
		
		for (int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		
	}
}
