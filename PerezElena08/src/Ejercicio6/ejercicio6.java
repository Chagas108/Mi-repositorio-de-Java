/*
 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un 
 * número negativo.
 * 
 * Aquí no iría un while solo. Seería más conveniente un do-while.
 * Mientras se pide el númerero va haciendo el cuadrado del mismo.
 * 
 */
package Ejercicio6;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Introduce un número (0 Para terminar): ");
			numero = entrada.nextInt();
			
			if (numero!=0) { // Si el número no es cero, se sigue calculando, por eso hay un if aquí
				//int cuadrado = numero * numero; //-->  se puede hacer de esta manera, pero es más conveniente hacerlo como abajo.
				int cuadrado = Math.powExact(numero, 2); // de esta manera pone el número al cuadrado.
				System.out.println("El cuadrado es: " + cuadrado);
			}
		} while (numero!=0); 
		
	}
}
