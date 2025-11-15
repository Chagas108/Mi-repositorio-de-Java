/*
 * Aquí se sabe que hay que usar un for porque sabemos el número exacto que pide el ususario
 */
package Ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numero;
		int sumaPos = 0, sumaNeg = 0,contadorPos = 0, contadorNeg = 0, contadorCeros = 0;//Si no se inicializan, no funciona abajo
			
		// las letras equivalen al nivel del bucle. El primero es i, si hay otro es j, y si hay otro es k.
		for (int i = 0; i < 10; i++) { // esto equivale a: (inicialización; condición; actualización)
			//En este caso, no está contando del 1 al 10, sino que se piden 10 números, por lo que i=0
			System.out.println("Introduce un número: "); //ESTO VA DENTRO DEL FOR, IDIOTA
			numero = entrada.nextInt();
			
			if (numero > 0) {
				sumaPos += numero; // Así suma los números que va introduciendo el usuario
				contadorPos++;
			} else if (numero<0) { // De esta manera se acumula el valor que pide el usuario y se cuentta.
				sumaNeg += numero;
				contadorNeg++;
			} else {
				contadorCeros++;
			}
		}
		if (contadorPos > 0) { //Faltaba añadir el contador para poder hacer la media bien. No te olvides la próxima vez.
			double mediaPos = sumaPos / contadorPos;
			System.out.println("La media de los números positivos es: " + mediaPos); 
		} else {
			System.out.println("No se han introducido números positivos");
		} // Si no lo haces por separado, hace una cosa u otra, no las dos a la vez. No olvides esto tampoco -.-
		if (contadorNeg > 0) { //Al hacer lo mismo que el anterior, no hay quue cambiar el simbolo de <>
			double mediaNeg = sumaNeg / contadorNeg;
			System.out.println("La media de los números negativos es: " + mediaNeg);
		} else {
			System.out.println("No se han introducido números negativos");
		}
		
		System.out.println("La cantidad de ceros introducidos son: " + contadorCeros);
		
	}	
}