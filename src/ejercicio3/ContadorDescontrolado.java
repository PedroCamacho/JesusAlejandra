package ejercicio3;

class ContadorDescontrolado extends Thread {

	public void run() {
		boolean isInfinito = true;
		int i = 1;
		while (isInfinito) {
			System.out.println(i);
			i++;
		}
	}
}