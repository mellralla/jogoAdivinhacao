import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); //aqui, será gerado um número aleatório
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Número digitado menor que o número gerado!");
            } else {
                System.out.println("Número digitado maior que o número gerado!");
            }
        }
        if (tentativas == 5){
            System.out.println("Você não conseguiu adivinhar o número gerado!");
            System.out.println("O número gerado era: " + numeroGerado);
        }
    }
}