/*
* Crear un programa donde se introduzcan los tres lados de un
* tri�ngulo y se determine si el tri�ngulo es v�lido o no. 
* TEOREMA DE LA DESIGUALDAD DEL TRIANGULO
*/
import java.util.Scanner;
public class LadosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitamos el primer lado
		System.out.println ("Por favor introduce el lado a del tri�ngulo:");
		Scanner ladoa = new Scanner (System.in);		
		float ladoingresadoa = ladoa.nextFloat();
				
		//Solicitamos el primer lado
		System.out.println ("Por favor introduce el lado b del tri�ngulo:");
		Scanner ladob = new Scanner (System.in);	
		float ladoingresadob = ladob.nextFloat();
						
		//Solicitamos el primer lado
		System.out.println ("Por favor introduce el lado c del tri�ngulo:");
		Scanner ladoc = new Scanner (System.in);		
		float ladoingresadoc = ladoc.nextFloat();
		
		
		if (ladoingresadoa + ladoingresadob > ladoingresadoc && ladoingresadoa +
				ladoingresadoc > ladoingresadob && ladoingresadob + 
				ladoingresadoc > ladoingresadoa) {
		System.out.println ("El lado a es: " + ladoingresadoa + " el lado b es: " + ladoingresadob + " y el lado c es: " + ladoingresadoc + " por lo que es un tri�ngulo valido.");
		} else {
			System.out.println ("El lado a es: " + ladoingresadoa + " el lado b es: " + ladoingresadob + " y el lado c es: " + ladoingresadoc + " por lo que es un tri�ngulo invalido.");
		}
	}
}
