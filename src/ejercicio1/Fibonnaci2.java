package ejercicio1;
public class Fibonnaci2 implements Runnable {
	Thread hilo;
	int serie;

	public Fibonnaci2(int n) {
		serie = n;
		hilo = new Thread(this, "Nuevo Thread");
		hilo.start();
	}

	public void run() {
		int num1 = 1, num2 = 1, suma = 1;
		System.out.println(num1);
		for (int i = 1; i < serie; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
	}
}