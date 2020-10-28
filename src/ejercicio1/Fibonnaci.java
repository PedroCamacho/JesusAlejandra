package ejercicio1;
class Fibonacci extends Thread {
	int sucesion;

	public Fibonacci(int n) {
		sucesion = n;
	}

	public void run(int n) {
		int fibo1, fibo2, i;
		System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:");
		fibo1 = 1;
		fibo2 = 1;
		System.out.print(fibo1 + " ");
		for (i = 2; i <= n; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
	}

	public void start() {
		run(sucesion);
	}
}