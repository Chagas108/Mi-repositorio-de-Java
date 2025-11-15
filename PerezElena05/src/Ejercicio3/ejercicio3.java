/*
 * Elena Pérez Chagas
 * 
 * 12/10/2025
 */
package Ejercicio3;
import java.util.Scanner;
public class ejercicio3 { 

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int edad;
		String nombre, apellidos;
		System.out.println("Dime tu edad: ");
		edad = entrada.nextInt();
		
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
			
		} else {
			if (edad > 18){
				System.out.println("Digame su nombre y sus apellidos: ");
				nombre = entrada.nextLine();
				apellidos = entrada.nextLine();
				
				System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad);
				System.out.println("Ha sido admitido." + "\n¡Enhorabuena!");
			}
		}
		
	}

}
