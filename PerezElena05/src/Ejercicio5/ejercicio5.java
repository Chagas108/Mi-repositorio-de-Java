/*
 * Elena Pérez Chagas
 * 
 * 12/10/2025
 */
package Ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre, apellidos, ciclo;
		int notaAcademica;
		
		System.out.println("Nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Apellidos: ");
		apellidos = entrada.nextLine();
		System.out.println("¿Qué ciclo formativo cursas?: ");
		ciclo = entrada.nextLine();
		System.out.println("¿Cuál es tu nota académica?: ");
		notaAcademica = entrada.nextInt();
		
		System.out.println("----------------------------------------");
		
		System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos);
		System.out.println("Ciclo formativo: " + ciclo);
		
		if (notaAcademica < 5) {	//Fijate bien en los símbolos <> o ==.
			System.out.println("Nota académica: " + notaAcademica + " (Insuficiente)"); 
		} else if (notaAcademica == 5){
			System.out.println("Nota académica: " + notaAcademica + " (Aprobado)");
		} else if (notaAcademica <= 7) {
			System.out.println("Nota académica: " + notaAcademica + " (Bien)");
		} else if (notaAcademica <= 8) {
			System.out.println("Nota académica: " + notaAcademica + " (Notable)");
		} else if (notaAcademica ==9) {
			System.out.println("Nota académica: " + notaAcademica + " (Sobresaliente)");
		} else if (notaAcademica == 10) {
			System.out.println("Nota académica: " + notaAcademica + " (Matrícula de Honor) \n¡ENHORABUENA!"); //Este apartado pertenece al ejercicio 6.
		} else if (notaAcademica > 10){ //Aquí, al poner un número mayor que 10 nos saldrá el mensaje de abajo. 
			System.out.println("La nota académica indicada es incorrecta");
		} 

	} 

}
