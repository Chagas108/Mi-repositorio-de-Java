/* 
 * 29/10
 * Elena Pérez Chagas
 * 
 * Uso del while.
 * Mostrar al usuario los números del 1 al 100
 * 
 */
package Ejercicio1;
import java.util.Scanner;
public class ejercicio1 { // Este ejercicio es igual al ejemplo que se hizo en clase con el while.

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int inicio, fin;
		/*Recuerda que para poder mostrar al usuario la cuenta del 1 al 100,
		 * hay que hacerle la petición para que escriba el inicio y final de la cuenta
		 */
		System.out.println("Inicio: ");  
		inicio = entrada.nextInt();  
		System.out.println("Fin: ");
		fin = entrada.nextInt();
		
		int contador = inicio; //Hay que iniciar un contador para que pueda
		
		while (contador <= fin) {
			System.out.print(" " + contador); // También recuerda que print muestra los números hacia la derecha, no hacia abajo
			contador = contador + 1;
		}
		
	
			
		
		}
		
		
		
		
		
	}


