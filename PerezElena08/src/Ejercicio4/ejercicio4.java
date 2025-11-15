/*
 * 29/10
 * Elena Pérez Chagas
 * 
 * Ejercicio while
 * 
 * Vamos a solicitar al usuario un valor positivo, lo sumaremos y contaremos.
 */
package Ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca un número positivo (0 para terminar): ");
		numero = entrada.nextInt();
		
		int contador = 0; //de esta manera no contará el 0 a la hora de terminar el bucle 
		int suma = 0;
		
		
		while (numero != 0) { 
			if (numero < 0) { //de esta manera, si el usuario escribe un número negativo, el programa le avisará
				System.out.println("Solo números POSITIVOS.");
			} else {
				suma = numero + suma;
				contador++;	//contador = contador + 1
				
			}
			 System.out.println("Otro: "); //poniendo esto después del if, aparecerá el mensaje de los numeros positivos desde el principio.
				numero = entrada.nextInt();//También contará solo a partir del 0, osea que no contará los números negativos ni el 0
			} 
				
		System.out.println("La suma de todos los números es: " + suma);
		System.out.println("La cantidad de veces que ha escrito un número han sido: " + contador);
		
		if (contador > 0) { //se abre otro if para asegurar que hace la media de los números positivos
			double media = suma / contador; //double por si el resultado son decimales, obviamente
			System.out.println("La media de los números positivos es: " + media);
		} else { //Mientras que aquí se asegura que si no se han introducido números positivos no hace media alguna.
			System.out.println("No se han introducido números positivos, por lo que no se puede hacer la media.");
		}
	}	
}