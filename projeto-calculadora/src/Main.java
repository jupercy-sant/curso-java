import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        operador = sc.next().charAt(0);

        System.out.println("Digite o segundo número:");
        num2 = sc.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro! Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        sc.close();
    }
}
