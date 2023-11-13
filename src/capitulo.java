import java.util.Scanner;

public class capitulo {
    
    String nome;
    String texto;
    String[] escolhas;
    Jogador personagem;
    int alteracaoStamina;
    Scanner escaneador;
    Scanner scanner;

    public capitulo(String nome, String texto, String[] escolhas, Jogador personagem, int alteracaoStamina, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoStamina = alteracaoStamina;
        this.escaneador = escaneador;
        this.scanner =  escaneador;
    }
    
    public void mostrar() {
        System.out.println("\n----- " + nome + " -----");
        System.out.println(texto);
        if (escolhas != null) {
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println("Digite " + i + " - " + escolhas[i]);
            }
        }
    }
    
    public int escolher() {
        int opcao = -1;
        if (escolhas != null) {
            do {
                System.out.print("Escolha uma opção: ");
                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido.");
                }

            } while (opcao < 0 || opcao >= escolhas.length);
        }
        return opcao;
    }
    
}
