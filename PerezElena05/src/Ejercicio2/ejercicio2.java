/*
 * Elena Pérez Chagas
 * 
 * 12/10/2025
 */
package Ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int edad;
		double nota;
		
		System.out.println("Dime tu nombre: ");
		nombre = entrada.next();
		System.out.println("Dime tu edad: ");
		edad = entrada.nextInt();
		System.out.println("Dime tu nota académica: ");
		nota = entrada.nextDouble();
		
		if (edad >= 18 && nota >= 7) { //para poder añadir los dos valores es necesario poner && como se dijo en clase
			System.out.println(nombre + ", usted ha sido admitid@ en el curso, cumple las condiciones requeridas.");
		} else {
			if (edad < 18 || nota < 7) { //Mientras que aquí se debe usar ||
				System.out.println(nombre + ", lo sentimos, no ha sido admitid@ en el curso ya que no cumple con los requisitos mínimos.");
			}
		}
		
	} //Como se ve en el resultado, utilizando en && y luego || si pones un resultado erroneo y uno correcto, responde como debe.

}
