import java.util.Scanner;

public class capitulo {
    
    private String nome;
    private String texto;
    private Escolha[] escolhas;
    private Jogador personagem;
    private Scanner scanner;
    private int alteracaoStamina;
    
    public String getNome(){
        return nome;
       }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public Escolha[] getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }

    public Jogador getPersonagem(){
        return personagem;
    }

    public void setPersonagem(Jogador personagem){
        this.personagem = personagem;
    }

    public Scanner getScanner(){
        return scanner;
    }

    
    public int getAlteracaoStamina(){
        return alteracaoStamina;
    }
    

    public void setAlteracaoStamina(int alteracaoStamina){
        this.alteracaoStamina = alteracaoStamina;
    }





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
                System.out.println("Digite " + i + " - " + escolhas[i].getTexto());
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
        this.escolhas[escolha].getProximo().executar();
        }
    
}
}
