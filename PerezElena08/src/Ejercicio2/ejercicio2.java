/*
 * 29/10
 * Elena Pérez Chagas
 * 
 * Ejercicio do-while
 * 
 * Al igual que el anterior, hay que mostrar al usuario los números del 1 al 100 con do-while
 */
package Ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int inicio, fin;
		
		System.out.println("Inicio: ");
		inicio = entrada.nextInt();
		System.out.println("Fin: ");
		fin = entrada.nextInt();
		
		int contador = inicio;
		
		do {
			System.out.print(" " + contador);
			contador++; // para que el bucle avance. Si ponemos -- irá hacia atrás
		} while (contador <= fin);
			
		
	} //No te compliques tanto, el ejercicio es más sencillo de lo que crees
	
}	