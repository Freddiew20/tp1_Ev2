package tp1_ev2;

public class Arrays4Maven {

	public static void main(String[] args) {

		int[] array = { 3, 4, 2, 6, 1, 9 };
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					int aux;
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}

			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			System.out.print("Ahora si es un proyecto Maven");
		}
	}

}
