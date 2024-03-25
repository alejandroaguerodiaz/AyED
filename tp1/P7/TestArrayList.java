package e7;
import java.util.Random;
import java.util.ArrayList;
public class TestArrayList {
	public static void main(String [] args) {
		Random random = new Random();
		ArrayList<Integer> lista = new ArrayList<>();
		int max = 10;
		for (int i = 0; i < max; i++) {
			lista.add(random.nextInt(100));
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
