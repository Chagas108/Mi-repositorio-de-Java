/*
 * Elena Pérez Chagas
 * 
 * 12/10/2025
 */
package Ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre, apellidos;
		double importe1, importe2, importe3, importe4;
		
		System.out.println("Nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Apellidos: ");
		apellidos = entrada.nextLine();
		System.out.println("Introduzca su primer importe gastado: ");
		importe1 = entrada.nextDouble();
		System.out.println("Introduzca su segundo importe gastado: ");
		importe2 = entrada.nextDouble();
		System.out.println("Introduzca su tercer importe gastado: ");
		importe3 = entrada.nextDouble();
		System.out.println("Por último, introduzca su cuarto importe gastado: ");
		importe4 = entrada.nextDouble();
		
		double importeTotal = importe1 + importe2 + importe3 + importe4; //suma de todos los importes para que se muestre en ficha el total.
		double importeMedio = importeTotal / 4; //
		
		
		System.out.println("----------------------------------------"); //Para separar un poco todo el texto. A parecía muy junto y era un poco feo a la vista.
		
		
		System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos);
		System.out.println("Su primer importe es: " + importe1 + "\nSu segundo importe: " + importe2 + "\nSu tercer importe: " + importe3 + "\nY por último su cuarto importe es: " + importe4);
		System.out.println("Importe medio: " + importeMedio);
		
		if (importeTotal <= 300) {
			System.out.println("Enhorabuena, tiene un descuento de 50€ en su próxima compra");
		} else {
			if (importeTotal > 300) {
				System.out.println("Lo sentimos, pero su compra no ha alcanzado los 300€ este mes. No dispone de descuento.");
			}
		}
	
	}

}
