import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double raioQuadrado = Math.pow(raio, 2.0);
		double saida = pi * (raioQuadrado);
		
		System.out.printf("A = %.4f%n", saida);
		
		sc.close();
		
	}

}
