package ejercicio1;
class Fibonnaci2 implements Runnable {
	Thread t;
	int sucesion;
	Fibonnaci2(int n) {
		sucesion = n;
		t = new Thread(this, "Nuevo Thread");
		t.start();
	}

	public void run() {
	        int fibo1,fibo2,i;
	        System.out.println("Los " + sucesion + " primeros términos de la serie de Fibonacci son:");                 
	        fibo1=1;
	        fibo2=1;
	        System.out.print(fibo1 + " ");
	        for(i=2;i<=sucesion;i++){
	            System.out.print(fibo2 + " ");
	            fibo2 = fibo1 + fibo2;
	            fibo1 = fibo2 - fibo1;
	        }
	        System.out.println();
	}
}