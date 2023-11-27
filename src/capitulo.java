import java.util.Scanner;

public class capitulo {
    
    String nome;
    String texto;
    Escolha[] escolhas;
    Jogador personagem;
    Scanner scanner;
    int alteracaoStamina;
    

    public capitulo(String nome, String texto, Jogador personagem, int alteracaoStamina,Scanner scanner ) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.scanner = scanner;
        this.alteracaoStamina = alteracaoStamina;
    }
    
    public void mostrar() {
        System.out.println("\n----- " + nome + " -----");
        System.out.println(texto);
        if (escolhas != null) {
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println("Digite " + i + " - " + escolhas[i].texto);
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
    public void executar(){
        this.mostrar();
        if (escolhas != null) {
        int escolha = this.escolher();
        this.escolhas[escolha].proximo.executar();
        }
    }

}
