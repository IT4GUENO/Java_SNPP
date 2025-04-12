package SNPP;

public class Practica4 {
	//Ecuación Cuadrática
	public static void main(String[] args) {
		int a = 1, b = -5, c = 6;
		double x1, x2;
		
		x1 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a);
		x2 = (-b - Math.sqrt(b*b-4*a*c)) / (2*a);
		
		System.out.println("El resultado del primer cuadrante es: " + x1);
		System.out.println("El resultado del segundo cuadrante es: " + x2);
	}
}
