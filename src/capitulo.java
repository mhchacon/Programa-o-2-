import java.util.Scanner;

public class capitulo {
    
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    String escolha3;
    Jogador personagem;
    int alteracaoStamina;
    Scanner escaneador;

    public capitulo(String nome, String texto, String escolha1, String escolha2, String escolha3, Jogador personagem, int alteracaoStamina, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.escolha3 = escolha3;
        this.personagem = personagem;
        this.alteracaoStamina = alteracaoStamina;
        this.escaneador = escaneador;
    }
    
    public void mostrar() {
        System.out.println("\n----- " + nome + " -----");
        System.out.println(texto);
        if (escolha1 != null) {
            System.out.println("Escolha 1: " + escolha1);
        }
        if (escolha2 != null) {
            System.out.println("Escolha 2: " + escolha2);
        }
        if (escolha3 != null) {
            System.out.println("Escolha 3: " + escolha3);
        }
    }
    
    public int escolher() {
        int escolha = 0;
        while (escolha != 1 && escolha != 2 && escolha != 3) {
            System.out.print("Digite 1,2 ou 3: ");
            escolha = escaneador.nextInt();
            escaneador.nextLine();
        }
        return escolha;
    }
    
}
