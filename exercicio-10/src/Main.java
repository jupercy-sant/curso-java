import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        int duracao;
        
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("O jogo durou " + duracao + " hora(s).");
        
        sc.close();
    }
}