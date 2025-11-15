/*
 * Elena Pérez Chagas
 * 
 * 12/10/2025
 */
package Ejercicio1;
import java.util.Scanner;	//ejercicio de condicionales, donde debemos usar el if else.
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Introduzca un número: ");
		num1 = entrada.nextInt();
		System.out.println("Introduzca otro número: ");
		num2 = entrada.nextInt();
		
		if (num1 > num2) { //Siempre poner el (valor) y luego {} para iniciar el if y cerrar el else
		System.out.println("El primer número es mayor que el segundo");	
	} else {
		if (num1 < num2) {
			System.out.println("El segundo número es mayor que el primero");
		} else { 
			if (num1 == num2) {
				System.out.println("Los dos números son iguales");
			}
		}
	
	}
		
  }
	
} 