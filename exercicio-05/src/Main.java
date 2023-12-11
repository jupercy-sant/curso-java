import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, numeroDePecas1, numeroDePecas2;
		double valor1, valor2, total1, total2;
		
		peca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total1 = numeroDePecas1 * valor1;
		total2 = numeroDePecas2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (total1 + total2));
		
		sc.close();
	}
}
