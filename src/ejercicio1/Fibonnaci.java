package ejercicio1;

class Fibonnacci extends Thread {
	int serie;

	public Fibonnacci(int n) {
		serie = n;
	}

	public void run(int numero) {
		int num1 = 1, num2 = 1, suma = 1;
		System.out.println(num1);
		for (int i = 1; i < numero; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
	}

	public void start() {
		run(serie);
	}
}
