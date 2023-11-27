import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Jogador jogador1 = new Jogador();
        System.out.println("seu nome é: ");
        jogador1.nome = scanner.next();
        System.out.print("É sua estreia no profissional do ");
        jogador1.time = scanner.next();
        
        capitulo cap1 = new capitulo(
                "Introdução",
                jogador1.nome + " está se preparando para sua estreia pelo " + jogador1.time + 
            ". Você sente a pressão da torcida e a expectativa da equipe, pois é seu primeiro clássico contra seu principal rival."+
             "O jogo começa e você está determinado a fazer a diferença. No primeiro tempo, o adversário está pressionando,"+
             " mas a defesa está aguentando firme. No segundo tempo, em uma jogada rápida, "+
             "a bola chega até você no meio-campo. Você vê uma oportunidade de lançar um contra-ataque e se destacar.",
                jogador1,
                10,
                scanner
        );
        
        capitulo esc1 = new capitulo(
                    "Final 1",
                    "Você chuta forte em direção ao gol, a bola desvia no goleiro e sai para escanteio."+
                    "O time ganha um escanteio, mas não consegue converter em gol. A partida termina empatada",
                    jogador1,
                    20,
                    scanner
            );

        capitulo esc2 = new capitulo(
                "Final 2",
                "O goleiro rebate o chute e a bola sobra próxima a você. Você mira com precisão e chuta colocado no canto do gol. A bola passa raspando na trave e entra! Você marca um gol decisivo, colocando seu time à frente no placar. A torcida vai à loucura e você se sente como um verdadeiro herói!",
                jogador1,
                15,
                scanner
        );

        capitulo esc3 = new capitulo(
                "Final 3",
                " O jogo termina em empate.",
                jogador1,
                15,
                scanner
        );

            
        cap1.escolhas =  new Escolha[]{new Escolha("Você parte para cima do marcador com habilidade, fazendo alguns dribles desconcertantes. Chegando próximo à área, você percebe que tem um bom ângulo para o chute", esc1), 
        new Escolha("\"Você opta por fazer um passe longo para o atacante. A jogada é rápida e o atacante fica cara a cara com o goleiro adversário. porem erra\"", esc2), 
        new Escolha("Passar a bola para o companheiro, O companheiro tenta o chute, mas o goleiro adversário defende. O jogo termina em empate.", esc3)};
        

        cap1.executar();
        scanner.close();
    }

    
}




    
        

