package SNPP;

import java.util.Scanner; //#2-Se importa scanner de la linea 8

public class Practica3 {
	public static void main(String[] args) {
		//Entrada estándar
		Scanner sc; //#1-Declaración de scanner  
		sc = new Scanner(System.in);
		float imc, estaturaMetros, pesoKg; //Declaración de varias variables en una linea
		System.out.println("Calculadora de IMC");
		System.out.println("Ingrese su peso en KG: ");
		pesoKg = sc.nextFloat(); //Espera que el usuario introduzca los valores
		System.out.println("Ingrese su estatura en metros: ");
		estaturaMetros =sc.nextFloat();
		//Operación aritmética
		imc = pesoKg / (estaturaMetros * estaturaMetros);
		System.out.println("Su indice de masa corporal es: " + imc);
	}
}
