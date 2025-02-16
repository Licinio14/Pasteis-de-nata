package Jogo;

import Entidade.Heroi.CriarHerois.CriarTiposHerois;
import Entidade.Heroi.Personagem;
import Tools.Tools;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicializacao {
    public static Personagem Inicializacao() {
        Scanner in = new Scanner(System.in);
        String nome;
        int vida, forca, tipo, dificuldade,resposta;

        // nome para a personagem
        System.out.print(Tools.ConsoleColors.BLUE + "Nome para a personagem: " + Tools.ConsoleColors.RESET);
        nome = in.nextLine();

        System.out.println();

        //dificuldade do jogo
        do {
            System.out.println(Tools.ConsoleColors.BLUE + "Qual a dificuldade?\nFacil da-te 300 pontos para gastares na personagem, Dificil da-te 100 pontos.(Vida base de 1000 pontos)\n 1 ponto = 1 ponto de vida\n10 pontos = 1 ponto de força\n|1 - Facil|\t\t|2 - Dificil|" + Tools.ConsoleColors.RESET);
            try{
                in = new Scanner(System.in);
                dificuldade = in.nextInt();

                if (dificuldade == 1 || dificuldade == 2) {
                    break;
                }else {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                }
            }catch (InputMismatchException e){
                System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
            }

        }while (true);

        // pontos de vida/forca
        do {

            if (dificuldade == 1) {
                System.out.println(Tools.ConsoleColors.BLUE + "Quantos pontos de força queres? O resto sera convertido em vida!\nDisponiveis - 300\n10 pontos = 1 ponto de força" + Tools.ConsoleColors.RESET);
                try{
                    in = new Scanner(System.in);
                    resposta = in.nextInt();

                    if (resposta * 10 <= 300) {
                        forca = resposta;

                        vida = (300 - (resposta * 10));

                        System.out.println(Tools.ConsoleColors.GREEN + "Foram atribuidos " + vida + " pontos de vida e " + forca + " pontos de força" + Tools.ConsoleColors.RESET);

                        break;
                    }else {
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                    }
                }catch (InputMismatchException e){
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
                }
            }else {
                System.out.println(Tools.ConsoleColors.BLUE + "Quantos pontos de força queres? O resto sera convertido em vida!\nDisponiveis - 100\n10 pontos = 1 ponto de força" + Tools.ConsoleColors.RESET);
                try {
                    in = new Scanner(System.in);
                    resposta = in.nextInt();

                    if (resposta * 10 <= 100) {
                        forca = resposta;

                        vida = (100 - (resposta * 10));

                        System.out.println(Tools.ConsoleColors.GREEN + "Foram atribuidos " + vida + " pontos de vida e " + forca + " pontos de força" + Tools.ConsoleColors.RESET);

                        break;
                    } else {
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma opção valida!" + Tools.ConsoleColors.RESET);
                    }
                } catch (InputMismatchException e) {
                    System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
                }
            }

        }while (true);

        do {
            System.out.println(Tools.ConsoleColors.BLUE + "Qual é o personagem que deseja criar:\n|1 - Fugitivo de Caxias|\t|2 - Militar aposentado|\t|3 - Programador|\t|4 - Mostrar Diferenças|" + Tools.ConsoleColors.RESET);
            in = new Scanner(System.in);

            try{
                tipo = in.nextInt();

                switch (tipo) {
                    case 1:
                        return CriarTiposHerois.CriarFugitivo(nome,vida,forca);
                    case 2:
                        return CriarTiposHerois.CriarMilitar(nome,vida,forca);
                    case 3:
                        return CriarTiposHerois.CriarProgramador(nome,vida,forca);
                    case 4:
                        ExibirDiferencas();
                        break;
                    default:
                        System.out.println(Tools.ConsoleColors.PURPLE + "Insira uma escolha valida!" + Tools.ConsoleColors.RESET);
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println(Tools.ConsoleColors.PURPLE + "Insira apenas números!!!" + Tools.ConsoleColors.RESET);
            }

        }while (true);


    }

    private static void ExibirDiferencas() {
        Tools.Clear();
        Scanner in = new Scanner(System.in);

        System.out.println(Tools.ConsoleColors.BLUE);
        System.out.println("""
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣶⣤⣀⣀⣤⣶⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⣾⣷⣶⣶⣶⣦⣤⠀⢤⣤⣈⣉⠙⠛⠛⠋⣉⣁⣤⡤⠀⣤⣴⣶⣶⣶⣾⣷⠀
                ⠀⠈⠻⢿⣿⣿⣿⣿⣶⣤⣄⣉⣉⣉⣛⣛⣉⣉⣉⣠⣤⣶⣿⣿⣿⣿⡿⠟⠁⠀
                ⠀⠀⠀⠀⠀⠉⠙⠛⠛⠿⠿⠿⢿⣿⣿⣿⣿⡿⠿⠿⠿⠛⠛⠋⠉⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⢿⣷⠦⠄⢀⣠⡀⠠⣄⡀⠠⠴⣾⡿⠀⠀⠀⠀⠀⣀⡀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⢤⣤⣴⣾⣿⣿⣷⣤⣙⣿⣷⣦⣤⡤⠀⠴⠶⠟⠛⠉⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠺⣷⣄⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣙⣛⣻⣿⣿⣿⡿⠃⠐⠿⠿⣾⣿⣷⡄⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                O Fugitivo de Caxias
                Carrega consigo o peso de um passado turbulento. Fugitivo da famosa prisão de Caxias, aprendeu a sobreviver nas ruas, contando apenas com sua força bruta e astúcia.
                Com 70 de força base, é capaz de derrubar adversários com facilidade, mas sua vida nas sombras o deixou vulnerável, refletido em sua defesa reduzida (-10).
                Começa sua jornada com 150 bitcoins, fruto de golpes rápidos e fugas audaciosas. É a personificação da resistência, mas sua história é marcada por cicatrizes que nunca cicatrizam.
                """);

        System.out.println("\n\n");

        System.out.println("(Enter para continuar)");
        in.nextLine();

        System.out.println(Tools.ConsoleColors.GREEN);
        System.out.println("""
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡤⠖⠒⠒⢲⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠁⠀⢀⣤⠖⠋⠁⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⢀⡾⠃⠀⢐⣶⣤⣴⠟⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣶⡄⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⣿⠿⠿⠿⠶⣦⣴⠾⠁⠀⠀⣀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣼⣿⣿⣧⠀⢀⣀⣀⣤⣤⣦
                ⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⢀⣀⣤⡴⢒⠉⣿⣤⣤⣤⠶⠶⠒⠚⣶⣀⣀⣤⣴⡶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠛⠉⠉⠉⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣶⣶⣿⡿⠟⢻⣥⡤⢷⣿⣿⡏⠤⠤⠔⠒⠛⣉⣥⣾⢻⢻⠁⣿⠀⣿⣿⣿⣿⣿⣇⠀⠉⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣩⣿⣿⣦⡤⡤⠤⡖⠀⠉⠉⠀⢰⣶⣶⣿⣿⣿⡿⣿⢸⠀⠇⠛⠸⣿⠉⠀⠀⣹⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⣀⣴⣾⠋⠉⠁⠀⠀⢹⣤⣴⣿⣦⣤⣤⣤⣴⣾⣿⣿⣿⣿⡀⠸⣄⠀⠀⠠⣎⡏⠀⠀⢠⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⣀⡼⣿⣿⣿⣷⣶⣶⣿⣿⣿⡿⠋⠚⠋⢉⡡⠴⢺⣿⡛⠋⢹⢹⡔⢦⣿⣅⣀⣠⣿⣦⠀⠀⣼⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⢀⣼⣿⠀⠿⢻⣿⣿⣿⣿⣿⡟⠁⢀⡄⠀⣷⠀⠀⢒⣻⣿⣿⡄⠀⢏⢷⡀⣽⣿⣯⣁⣽⠛⣇⢠⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⣼⠋⠀⠀⠀⢸⣿⠟⠋⠉⣏⢻⡄⢸⣀⣀⣸⣦⣤⠬⠿⣉⣻⣷⡀⠘⢌⣷⠃⠈⠛⢏⠁⠀⢸⣾⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢀⡏⠀⠀⣠⠞⠉⠀⠀⠀⠀⠘⣆⢻⣿⡋⠉⠟⠙⠃⠀⠰⣿⢹⣿⡷⠖⠋⠁⠀⠀⠀⠘⠀⠇⢸⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢸⡇⢀⡼⠁⠀⠀⠀⠀⠀⠀⣀⣬⠿⣿⣆⠀⢀⠀⠀⠀⠀⣿⣿⣿⣿⣶⡆⠀⠀⠀⠀⠀⢀⣆⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⣼⠃⠀⠀⠀⠀⠀⠀⠀⣰⢿⡇⠀⠀⠘⣿⡆⠀⠓⠲⣶⣞⣯⣿⣿⣿⣿⣷⡤⠤⠒⠒⠋⠉⠁⢸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠘⣯⠀⠀⠀⠀⠀⠀⣠⣾⣥⣾⣷⠀⠀⠀⠈⢿⡟⠛⠉⠉⠀⠈⠉⢹⣿⣿⣿⣧⠀⠀⠀⠀⠀⢀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠙⠳⠦⢄⣀⣠⢾⣿⠀⠀⢸⡄⠀⠀⠀⠀⠈⢻⣆⠀⣀⣀⣀⣠⣼⣿⣇⣀⣬⣇⣀⠀⠀⠀⣸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⣀⣠⠴⠚⣛⣧⠤⠴⡇⠀⠀⠀⠀⠀⠀⠻⣆⠁⠀⠀⠀⣿⡿⠛⢷⣀⠀⠈⡇⠀⢠⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⢰⡏⠀⣀⡼⠿⢿⣄⠀⢱⠀⠀⠀⠀⠀⠀⠀⠙⣧⣴⣶⣭⠿⠇⠀⡠⣽⠠⠤⡇⢠⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠈⢻⡞⠁⠀⠀⠀⠹⣶⣿⣦⠤⠤⠶⣶⣤⣤⣤⣬⠙⣯⠙⠲⠤⣨⣆⡼⠀⢰⣥⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⢸⡇⣿⣆⢀⣠⠴⠛⢦⡀⠀⢀⣠⣾⣿⣿⣿⠿⣤⣿⠀⠀⢸⠦⠿⠷⢶⡟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠘⣿⡙⠿⣿⣏⢀⣀⣸⣿⣏⣡⣄⡿⢿⣄⠀⠀⠟⠈⣳⣤⠾⠶⡶⣶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠘⢷⣀⠈⢻⣀⣀⡙⣻⣿⣤⡀⠀⠀⡿⠀⠀⠀⣾⡏⠁⣠⡼⠃⠀⣳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠋⠀⣴⠋⢹⠙⠃⠀⠀⣷⠖⠛⠁⠈⣿⠞⠁⠀⠀⢺⡤⣈⠓⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠈⡆⠀⠀⠀⢻⡄⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠶⠤⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                
                O Militar Aposentado
                Serviu por décadas nas forças armadas, mas o tempo e as batalhas lentamente cobraram seu preço.
                Aposentado, ainda carrega consigo a disciplina e a armadura que o protegeu em tantos combates, garantindo 20 de defesa.
                No entanto, sua idade avançada o torna lento, e seus inimigos sempre atacam primeiro.
                Com 50 de força base, não é mais o guerreiro implacável de outrora, mas sua experiência é inigualável.
                Começa com apenas 80 bitcoins, fruto de uma vida dedicada ao serviço, não ao lucro. É a resistência personificada, mas sua lentidão é um lembrete de que até os mais fortes têm seus limites.
                """);

        System.out.println("\n\n");

        System.out.println("(Enter para continuar)");
        in.nextLine();

        System.out.println(Tools.ConsoleColors.CYAN);
        System.out.println("""
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣻⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡽⣯⣻⣻⡽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣻⣻
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡿⣿⣿⣿⣿⣿⣿⡿⣻⣻⣻⣻⣻⣻⡽⣯⣟⢷⠍⠟⠉⠛⢿⢿⣻⣻⢿⣿⣿⣯⣻⡽⣯⣻⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⢯
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣻⣻⣻⡟⡅⠀⠀⠀⠠⠀⠀⠆⡹⣻⣻⡽⣯⣻⡽⣯⣻⡽⣻⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣻⣻
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⡟⡛⡜⡜⣎⢦⢶⣖⡴⡀⠠⣿⣿⣿⣟⣟⣟⣟⣟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣻⣻⣻
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣻⢆⢭⢎⢎⢞⡝⣝⡽⡽⡣⢂⣟⢯⢯⢯⣿⣻⣻⡽⣻⡽⣻⣻⣿⣿⣿⣿⣿⣿⣿⡿⣟⣿⣿⣿⣿⣻
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣟⢧⡒⡔⢆⢯⢎⠚⡜⡇⣼⣿⣿⣯⣻⣻⣻⣻⢯⣿⣿⣻⣻⣻⣻⢿⣿⣿⣿⣿⡿⣻⣻⣻⣟⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢹⢧⢣⢣⠡⡋⡯⣫⢯⡹⣹⣿⣿⣿⣿⣯⣻⣻⣻⣿⣿⣻⣻⣻⣿⣟⣟⢿⣿⣿⣿⣿⣻⢿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠧⢣⢢⢌⣍⡹⡽⣹⣽⣿⣿⣿⣿⣿⡽⣯⣻⢯⣻⢯⣻⣻⣿⣿⣿⣿⣻⣻⣻⣻⢿⢿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡽⣍⢎⢎⢝⢏⢏⣝⢿⣿⣿⣿⣿⣿⣿⣻⡽⣯⣻⣻⣿⣿⣟⢿⣿⢿⣻⣻⣿⣿⢿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣟⣟⣟⡜⡜⡜⡝⡭⣫⢫⠂⢫⣿⣿⣿⣟⢯⣻⣻⣻⡽⣻⣿⣿⣿⣟⣿⣿⣿⣻⣟⣟⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⢿⡿⣿⢿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⡿⡽⡻⡿⣇⢣⢣⠱⡱⡱⣽⣿⠀⠀⠀⠀⠐⢉⠍⡛⢿⢯⣻⣻⣿⣿⡿⣿⣿⣿⣿⣟⣟⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⡿⣿⣿⣟⢿⣻⣻⡿⣏⢋⠀⠀⠀⣹⣻⡇⢣⠱⣥⣻⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣻⣿⣿⣿⣟⣟⣟⡽⣻⣿⡿⡿⣿⣿⣿
                ⣿⣿⣿⣿⣿⢿⣿⣿⣿⢿⣻⣿⢿⣿⣿⢿⣻⣻⣻⡃⠀⠀⠀⠀⠀⠀⠠⠠⡣⢢⠱⡉⠙⠛⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣻⡽⣻⣿⢯⣻⣿⣿⢯⣻⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⢿⣻⣻⣿⣟⣟⣟⣿⣿⣿⣿⣿⡿⣟⣟⠄⠀⠀⠀⠀⠀⠀⠀⢀⢆⡑⠡⠉⠋⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣻⢯⣻⡽⣻⣻⡿⣯⢿⣿⣿⣿⣿⣿
                ⣿⣻⣟⣟⣿⣿⣿⣿⣟⣟⣟⣟⣿⣿⣿⣿⣟⣟⡽⡄⠀⠀⠀⠀⠀⠀⠀⢀⠁⣯⠚⠹⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣻⢯⢯⣻⣿⣿⣻⣻⣻⣿⣿⣿⣿⣿
                ⣿⣟⢿⣿⣿⣿⣿⣿⣻⣿⡿⣻⣻⣿⣿⣿⢿⣻⢯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⣟⠖⡖⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⢿⣻⣿⣻⣿⣿⣿⣿⣿⣻⢯⣻⣻⣻
                ⣿⣻⣻⣿⣿⣿⣿⣻⣽⣿⣿⣟⣟⢿⣿⣿⡿⣻⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⢦⢢⣠⣀⠀⠀⠀⠀⠩⡛⡝⡜⡖⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣻⣻⣻⣿⣿⡿⣻⣿⣿⣻⣻⣿⣿⡿⣿⣻⣻⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⡜⠈⠁⠀⠀⠀⠀⠀⠌⣌⢎⡜⡜⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣻⣿⣿⡿⣟⢿⣿⣿⣿
                ⣟⣿⣿⣿⡽⡽⡽⣻⣹⡽⣿⣿⣿⣻⣻⣻⣻⡽⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢢⠣⠒⠀⠀⠀⠀⠀⠀⠎⢎⢎⢎⢎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣟⡽⣿⣿⣻⣻⣻⢿⣿⣿
                ⣿⣿⢿⣿⣯⣫⣏⢯⣫⣿⣿⣿⣿⣟⣟⣟⣟⡽⡽⠀⡀⠀⠀⠀⠀⢀⢀⠀⠰⡰⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡝⡽⡽⣿⣿⣿⣻⡝⡽
                ⣯⣯⣯⣯⢯⣫⢫⣻⡿⣻⣿⣿⣿⣿⣿⣻⡽⡽⣭⠂⠀⡰⡱⠡⠢⢂⠆⠀⢠⠰⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢯⢫⣫⡿⣻⣿⣿⣿⣻⡹
                ⡿⡿⣻⣻⣻⢭⣚⢧⢫⣻⣿⣿⡿⡽⡽⡽⡽⣹⣝⢇⠄⠀⠀⠄⠄⠄⡐⠀⠄⡐⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡝⣝⡽⣹⢽⢯⡻⣻⣟⢯⢫⣚⣟⣟⣟⣟⣟⣟⡝
                ⣯⣻⡽⣯⣻⡜⡵⡽⣎⢭⣻⡝⡽⣽⡽⣝⣝⣝⡝⣗⢭⢎⠀⠀⠂⠂⠀⠀⠀⡐⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣹⣝⣝⡝⣝⡽⡽⡹⣚⠵⡭⢯⢯⢯⣻⡽⡽⣣
                ⣟⣟⡽⣯⢯⢎⢎⢯⣏⡗⡝⣝⡽⣻⢯⣫⢫⢫⣫⣻⢯⡳⡱⡱⡱⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡝⡝⡝⣝⡝⡝⡭⣫⢫⢭⣚⣝⣝⣝⡽⣹⣹⢧
                ⢏⠯⢫⢫⢫⢪⢎⢯⢏⠳⡹⡹⣻⡿⡯⣫⢫⡹⡹⡽⡽⡹⡸⡜⡄⠀⠀⢀⢂⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡭⡭⣫⡹⡹⡭⣫⢫⢫⣚⡜⡝⡝⣝⣝⢽⡹⡭
                O Programador
                Um gênio da tecnologia, um mestre dos códigos e algoritmos. Sua mente afiada lhe concede 60 de força base, refletindo sua capacidade de resolver problemas de forma criativa e eficiente.
                No entanto, sua vida sedentária em frente às telas o deixou com 0 de defesa, vulnerável a ataques diretos.
                Começa com 120 bitcoins, acumulados através de hacks e projetos freelancers. É a mente por trás das estratégias, mas sua falta de preparo físico é sua maior fraqueza.
                Não luta com os punhos, mas com a inteligência, e seu valor está na capacidade de pensar fora da caixa.
                """);

        System.out.println("(Enter para continuar)");
        in.nextLine();
    }
}
