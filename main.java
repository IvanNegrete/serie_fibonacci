/*
 * * Iván Negrete
 * 
 */
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		long numAct = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la posición de la serie que le interesa obtener: ");
		int posicionSolicitada = leer.nextInt();
		leer.close();
		for(int i = 0; i < posicionSolicitada; i ++) {
			numAct = serie(i);
		}
		System.out.println("El último numero de la serie es: " + numAct);
	}
	
	public static long serie(int n) {
		switch(n) {
		case 0:
			return 0;
		
		case 1:
			return 1;
			
		default:
			return serie(n-1) + serie(n-2);
		}
	}
	
}