package ejercicio3;

public class Main {
	public static void main(String[] args) {
		System.out.println("Comienzo del controlador Descontrolado");
		ContadorDescontrolado miHilo = new ContadorDescontrolado();
		miHilo.start();
		try {
			Thread.sleep(1000);
			miHilo.stop();
			System.out.println("Fin del contador descontrolado");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
