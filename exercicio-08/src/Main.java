import java.util.Scanner;
import java.util.Locale;

class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        
        sc.close();
    }
}