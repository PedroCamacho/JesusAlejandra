package ejercicio3;

public class ContadorDescontrolado extends Thread {
	public void run() {
		boolean isInfinity = true;
		int i = 0;
		while (isInfinity) {
			System.out.println(i);
			i++;
		}
	}
}
