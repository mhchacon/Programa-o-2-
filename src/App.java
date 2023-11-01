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
                System.out.println("\nVocê corre para a pequena área levantando um braço pedindo cruzamento. Prontamente seu companheiro cruza, você salta no momento certo e cabeceia com precisão, marcando o GOL!!!!");
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

        System.out.println("------fim do primeiro capitulo------");
        
        Scanner scanner3 = new Scanner(System.in);

        Jogador jogador1 = new Jogador();

        System.out.println("para esse capitulo, digite o nome do seu jogador: ");
        jogador1.nome = scanner.next();

        System.out.println("é seu segundo jogo pelo " + time +" " + jogador1.nome + "!!, ");
        
        

        System.out.println("\nComeça o segundo jogo da temporada.");
        System.out.println("O técnico pede que você mantenha a posse de bola e evite correr desnecessariamente.\n");
        System.out.println("Digite 1 - Tocar a bola com calma, mantendo a posse e evitando corridas.");
        System.out.println("Digite 2 - Tentar fazer uma corrida veloz para superar a marcação.");
        
        int op2 = scanner3.nextInt();

        if (op2 == 1) {
            System.out.println("\nVocê segue a orientação do técnico, tocando a bola com calma e mantendo a posse.");
            jogador1.stamina -= 10; // Reduz a stamina ao tocar a bola
        } else if (op2 == 2) {
            System.out.println("\nVocê decide fazer uma corrida veloz para tentar superar a marcação.");
            jogador1.stamina -= 30; // Reduz mais stamina ao fazer uma corrida
        } else {
            System.out.println("Opção inválida. Escolha entre a opção 1 ou 2.");
        }
        System.out.println("\nO jogo está se desenrolando, e você está se esforçando para manter o ritmo.");
        System.out.println("O adversário está pressionando e a torcida está empolgada. O que você fará?\n");
        System.out.println("Digite 1 - Tentar um drible desconcertante para surpreender a defesa.");
        System.out.println("Digite 2 - Fazer um passe seguro para manter a posse de bola.");

        int op3 = scanner3.nextInt();

        if (op3 == 1) {
            System.out.println("\nVocê tenta um drible desconcertante, mas a defesa adversária se mantém firme e consegue desarmá-lo.");
            jogador1.stamina -= 20; // Reduz a stamina ao tentar um drible
        } else if (op3 == 2) {
            System.out.println("\nVocê faz um passe seguro para manter a posse de bola e controlar o jogo.");
            jogador1.stamina -= 5; // Reduz um pouco a stamina ao fazer um passe seguro
        } else {
            System.out.println("Opção inválida. Escolha entre a opção 1 ou 2.");
        }

        // Verifica a stamina novamente

        if (jogador1.stamina <= 0) {
            System.out.println("\nSua stamina acabou. Você se sente exausto e tem dificuldades para continuar.");
        } else {
            System.out.println("\nVocê tem " + jogador1.stamina + " de stamina restante.");
        }

        

        Jogador jogador2 = new Jogador();
        jogador2.nome = "David"; 
        jogador2.camnum = 10; 

        System.out.println("Você está jogando ao lado de " + jogador2.nome + " com a camisa número " + jogador2.camnum + ".\n");
        

        if (jogador1.stamina <= 0) {
            System.out.println("\nSua stamina acabou. Você se sente exausto e tem dificuldades para continuar.");
        } else {
            System.out.println("\nVocê tem o jogo com " + jogador1.stamina + " de stamina restante.");
            System.out.println("\nFaltando poucos minutos para o final do jogo,o " + jogador2.nome + " percebe que você esta livre e prontamente faz o passe, você tem uma última chance de marcar o gol da vitória!");
            System.out.println("Digite 1 - Chutar para o gol");
            System.out.println("Digite 2 - Passar a bola para um companheiro.");
            
            int op4 = scanner3.nextInt();

            if (op4 == 1) {
                System.out.println("\nVocê chuta para o gol!");
                int chanceDeGol = (int) (Math.random() * 100); 

                if (chanceDeGol < 70 ) { 
                    System.out.println("GOOOOOOL! Você marcou o gol da vitória!");
                } else {
                    System.out.println("Você chutou, mas a bola passou perto do gol. O jogo termina em empate.");
                }
            } else if (op4 == 2) {
                System.out.println("\nVocê passa a bola para um companheiro.");
                System.out.println("O companheiro tenta o chute, mas o goleiro adversário defende. O jogo termina em empate.");
            } else {
                System.out.println("Opção inválida. Escolha entre a opção 1 ou 2.");
            }
        }

        
        if (jogador1.stamina < 30) {
            System.out.println("\nAo final do jogo, o técnico expressa sua insatisfação com seu desempenho.");
            System.out.println("\"Você deveria ter poupado mais energia. Sua falta de disciplina custou ao time!\"");
        }
        System.out.println("------fim do segundo capitulo------");
        scanner3.close();   
    }


    
}
