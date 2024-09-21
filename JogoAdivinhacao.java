import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random geradorAleatorio = new Random();
        int numero = geradorAleatorio.nextInt(101);


        int tentativasMaximas = 7;
        int tentativasUsadas = 0;


        System.out.println("Bem-vindo ao Jogo da Adivinhação!!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Você tem " + tentativasMaximas + " tentativas.");

        do {
            System.out.print("Digite o seu palpite: ");
            int palpite = lerTeclado.nextInt();
            tentativasUsadas++;

            if (palpite == numero) {
                System.out.println("Parabéns!! Você acertou o número em " + tentativasUsadas + " tentativas.");
                break;
            } else if (palpite < numero) {
                System.out.println("O número sorteado é maior que " + palpite + ". Você tem mais " + (tentativasMaximas - tentativasUsadas) + " tentativas restantes.");
            } else {
                System.out.println("O número sorteado é menor que " + palpite + ". Você tem mais " + (tentativasMaximas - tentativasUsadas) + " tentativas restantes.");
            }
        

           if (tentativasUsadas >= tentativasMaximas) {
            System.out.println("Que pena! Você esgotou suas tentativas. O número era " + numero + ".");
            break;

            }
        } while (tentativasUsadas < tentativasMaximas);

        lerTeclado.close();

    }

}
