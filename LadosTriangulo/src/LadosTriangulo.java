/*
* Crear un programa donde se introduzcan los tres lados de un
* triángulo y se determine si el triángulo es válido o no. 
* TEOREMA DE LA DESIGUALDAD DEL TRIANGULO
*/
import java.util.Scanner;
public class LadosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitamos el primer lado
		System.out.println ("Por favor introduce el lado a del triángulo:");
		Scanner ladoa = new Scanner (System.in);		
		float ladoingresadoa = ladoa.nextFloat();
				
		//Solicitamos el primer lado
		System.out.println ("Por favor introduce el lado b del triángulo:");
		Scanner ladob = new Scanner (System.in);	
		float ladoingresadob = ladob.nextFloat();
						
		//Solicitamos el primer lado
		System.out.println ("Por favor introduce el lado c del triángulo:");
		Scanner ladoc = new Scanner (System.in);		
		float ladoingresadoc = ladoc.nextFloat();
		
		
		if (ladoingresadoa + ladoingresadob > ladoingresadoc && ladoingresadoa +
				ladoingresadoc > ladoingresadob && ladoingresadob + 
				ladoingresadoc > ladoingresadoa) {
		System.out.println ("El lado a es: " + ladoingresadoa + " el lado b es: " + ladoingresadob + " y el lado c es: " + ladoingresadoc + " por lo que es un triángulo valido.");
		} else {
			System.out.println ("El lado a es: " + ladoingresadoa + " el lado b es: " + ladoingresadob + " y el lado c es: " + ladoingresadoc + " por lo que es un triángulo invalido.");
		}
	}
}
