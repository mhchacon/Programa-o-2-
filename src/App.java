import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("É sua estreia no profissional do ");
        String time = scanner.next();

        System.out.println("\nÉ sua estreia no profissional do " + time + " com a camisa");

        int num = scanner.nextInt();

        System.out.println("\nÉ sua estreia no profissional do " + time + " com a camisa " + num + " no minuto 43 do segundo tempo, o jogo está empatado em 2x2.");
        System.out.println("No minuto 43 seu companheiro Carlos faz um passe enfiado te deixando na entrada da grande área. Prontamente o zagueiro do time adversário se aproxima, o que você deve fazer?\n");
        System.out.println("Digite 1 - Tentar driblar o zagueiro aplicando um elástico e em seguida correr para dentro da área.");
        System.out.println("Digite 2 - Dar um toque na bola para a direita tirando do zagueiro e chutar colocado fora de área.");
        System.out.println("Digite 3 - Passar a bola de volta para o companheiro.");

        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println("\nVocê consegue driblar o zagueiro e corre para a área. Ao olhar para direita percebe que um companheiro está entrando na área levantando o braço pedindo a bola, o que será seu próximo passo?\n");
            System.out.println("Digite 1 - Prontamente passar a bola para o companheiro");
            System.out.println("Digite 2 - Ignorar o companheiro e chutar para o gol");

            int op1 = scanner.nextInt();
            if (op1 == 1) {
                System.out.println("\nRapidamente você faz o passe para seu companheiro que logo se prepara para receber. Porém, o zagueiro adversário aparece interrompendo o passe e dando um chutão para seu lado de ataque.");
                System.out.println("Passam alguns minutos e o árbitro encerra o jogo terminado em 2x2.\n");
            } else if (op1 == 2) {
                System.out.println("\nVocê ignora o companheiro e chuta para o gol. Você enche o pé buscando tirar a bola do goleiro, a bola viaja rapidamente mas acaba indo por cima da trave.");
                System.out.println("É apenas tiro de meta para os adversários. Passam alguns minutos e o árbitro encerra o jogo terminado em 2x2.\n");
            } else {
                System.out.println("Opção inválida.");
            }
        } else if (op == 2) {
            System.out.println("\nVocê enche o pé chutando a bola colocada, porém calcula errado e a bola viaja alto pelo estádio.");
            System.out.println("É apenas tiro de meta para os adversários. Passam alguns minutos e o árbitro encerra o jogo terminado em 2x2.\n");

        } else if (op == 3) {
            System.out.println("\nVocê faz o passe para o companheiro que vem pela lateral esquerda.");
            System.out.println("Ao conseguir com sucesso realizar o passe o que será seu próximo passo?");
            System.out.println("1 - Correr para a pequena área e sinalizar para receber o cruzamento.");
            System.out.println("2 - Ficar fora da área para se livrar da marcação.");

            int op2 = scanner.nextInt();
            if (op2 == 1) {
                System.out.println("\nVocê corre para a pequena área levantando um braço pedindo cruzamento. Prontamente seu companheiro cruza, você salta no momento certo e cabeceia com precisão, marcando o gol.");
                System.out.println("Todos festejam e após alguns minutos o jogo acaba lhe consagrando herói.\n");
            } else if (op2 == 2) {
                System.out.println("\nVocê se livra da marcação e pede a bola fora da área, porém seu companheiro não consegue realizar o passe e o time adversário rouba a bola.");
                System.out.println("Passam alguns minutos e o árbitro encerra o jogo terminado em 2x2.\n");
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Opção inválida. Escolha entre a opção 1, 2 ou 3.");
        }

        
        Scanner scanner3 = new Scanner(System.in);

        Jogador jogador1 = new Jogador();

        System.out.println("passa esse capitulo, digite o nome do seu jogaor: ");
        jogador1.nome = scanner.nextLine();

        System.out.println("é seu segundo jogo pelo " + time +" " + jogador1.nome + "!!, ");
        
        scanner3.close();
        }

    
}
