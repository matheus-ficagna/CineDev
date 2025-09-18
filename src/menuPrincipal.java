import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Cria uma matriz 10x20 para representar a sala de cinema
        // 10 fileiras e 20 assentos por fileira
        char[][] salaDeCinema = new char[10][20]; 

        // Inicializa todos os assentos como livres ('L')
        // Percorre todas as fileiras da matriz
        for (int i = 0; i < salaDeCinema.length; i++) {
            // Percorre todos os assentos de cada fileira
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                salaDeCinema[i][j] = 'L'; // Define cada assento como livre
            }
        }

        byte opcao;
        do {
            // Menu principal do sistema
            System.out.println("---- Cinema CineDev ----");
            System.out.println("Exibir mapa de assentos - 1");
            System.out.println("Comprar ingressos - 2");
            System.out.println("Cancelar compra de ingressos - 3");
            System.out.println("Exibir relatório de ocupação - 4");
            System.out.println("Sair - 5");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextByte(); // Lê a opção do usuário

            switch (opcao) {
            case 1:
                // Exibe o mapa visual da sala de cinema
                System.out.print("           "); // Imprime 11 espaços para alinhar os números das colunas
                
                // Imprime os números das colunas (1 a 20)
                // Percorre todas as colunas da primeira fileira
                for (int j = 0; j < salaDeCinema[0].length; j++) {
                    System.out.printf("%3d", j + 1); // Formata cada número de coluna com 3 dígitos
                }
                System.out.println(); // Pula linha após imprimir os números das colunas

                // Imprime cada fileira com seus assentos
                // Percorre todas as fileiras da sala
                for (int i = 0; i < salaDeCinema.length; i++) {
                    System.out.printf("Fileira %2d: ", i + 1); // Imprime o número da fileira formatado
                    
                    // Imprime todos os assentos da fileira atual
                    // Percorre cada assento da fileira atual
                    for (int j = 0; j < salaDeCinema[i].length; j++) {
                        System.out.print("[" + salaDeCinema[i][j] + "]"); // Mostra o assento entre colchetes
                    }
                    System.out.println(); // Pula linha após imprimir todos os assentos da fileira
                }
                break;

            case 2:
                // Processo de compra de ingressos
                System.out.println("Selecione a fileira do assento que deseja comprar (1-" + salaDeCinema.length + "):");
                int fileira = scanner.nextInt() - 1; // Converte para índice do array (0-based)

                System.out.println("Selecione o número do assento (1-" + salaDeCinema[0].length + "):");
                int assento = scanner.nextInt() - 1; // Converte para índice do array (0-based)
                
                // Verifica se os índices estão dentro dos limites válidos
                if (fileira >= 0 && fileira < salaDeCinema.length && 
                    assento >= 0 && assento < salaDeCinema[0].length) {
        
                    // Verifica se o assento está disponível
                    if (salaDeCinema[fileira][assento] == 'L') {
                        salaDeCinema[fileira][assento] = 'X'; // Marca o assento como ocupado
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Este assento já está ocupado!");
                    }
                } else {
                    System.out.println("Fileira ou assento inválido!");
                }
                break;
            
            case 3:
                // Processo de cancelamento de compra
                System.out.println("Qual a fileira do seu assento? (1-" + salaDeCinema.length + "):");
                fileira = scanner.nextInt() - 1; // Converte para índice da matriz

                System.out.println("Qual o número do assento (1-" + salaDeCinema[0].length + "):");
                assento = scanner.nextInt() - 1; // Converte para índice da matriz
                
                // Verifica se os índices estão dentro dos limites válidos
                if (fileira >= 0 && fileira < salaDeCinema.length && 
                    assento >= 0 && assento < salaDeCinema[0].length) {
        
                    // Verifica se o assento estava realmente ocupado
                    if (salaDeCinema[fileira][assento] == 'X') {
                        salaDeCinema[fileira][assento] = 'L'; // Libera o assento
                        System.out.println("Sua compra foi cancelada.");
                    } else {
                        System.out.println("Este assento ainda não foi comprado!");
                    }
                } else {
                    System.out.println("Fileira ou assento inválido!");
                }
                break;
            
            case 4:
                // Relatório de ocupação da sala
                int totalDeAssentos = salaDeCinema.length * salaDeCinema[0].length; // Calcula o total de assentos (fileiras × colunas)
                int assentosOcupados = 0; // Contador para assentos ocupados
                int assentosLivres = 0; // Contador para assentos livres
                double percentualOcupacao = 0; // Variável para armazenar o percentual de ocupação
                
                // Percorre toda a matriz para contar os assentos ocupados
                // Loop através de todas as fileiras
                for(int i = 0; i < salaDeCinema.length; i++) {
                    // Loop através de todos os assentos de cada fileira
                    for(int j = 0; j < salaDeCinema[i].length; j++) {
                        // Verifica se o assento está ocupado
                        if(salaDeCinema[i][j] == 'X') {
                            assentosOcupados++; // Incrementa o contador de assentos ocupados
                        }
                    }
                }
                
                assentosLivres = totalDeAssentos - assentosOcupados; // Calcula assentos livres (total - ocupados)
                // Calcula percentual de ocupação (com cast para double para evitar divisão inteira)
                percentualOcupacao = (assentosOcupados / (double) totalDeAssentos) * 100;
                
                // Exibe o relatório formatado
                System.out.printf("Total de assentos na sala: %d\n", totalDeAssentos);
                System.out.printf("Assentos ocupados: %d\n", assentosOcupados);
                System.out.printf("Assentos livres: %d\n", assentosLivres);
                System.out.printf("Percentual de assentos ocupados: %.2f%%\n", percentualOcupacao);
                break;
            
            case 5:
                // Encerra o programa
                System.out.println("Encerrando o programa... Obrigado por usar o CineDev!");
                return; // Sai do método main, encerrando o programa
            
            default:
                // Opção inválida do menu
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0); // Loop continua até que opção 0 seja escolhida (não existe no menu)
        
        scanner.close(); // Fecha o scanner para liberar recursos
    }
}