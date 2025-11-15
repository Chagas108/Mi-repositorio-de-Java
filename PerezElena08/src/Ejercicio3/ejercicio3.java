/*
 * 29/10
 * Elena Pérez Chagas
 * 
 * Ejercicio do-while
 * 
 * Al igual que el anterior, hay que mostrar al usuario los números del 100 al 1 con do-while
 */
package Ejercicio3;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int inicio, fin;
		
		System.out.println("Inicio: ");
		inicio = entrada.nextInt();
		System.out.println("Fin: ");
		fin = entrada.nextInt();
		
		int contador = fin;
		
		do {
			System.out.print(" " + contador);
			contador--;
		} while (contador >= inicio);

	}

}
