import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] salaDeCinema = new char[10][20]; // Cria a matriz com os assentos

        
        for (int i = 0; i < salaDeCinema.length; i++) { // Todos assentos são declarados inicialmente como livres
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                salaDeCinema[i][j] = 'L';
            }
        }

        byte opcao;
        do {
            System.out.println("---- Cinema CineDev ----");
            System.out.println("Exibir mapa de assentos - 1");
            System.out.println("Comprar ingressos - 2");
            System.out.println("Cancelar compra de ingressos - 3");
            System.out.println("Exibir relatório de ocupação - 4");
            System.out.println("Sair - 5");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextByte();

            switch (opcao) {
            case 1:
                // Exibição do mapa de assentos
                System.out.print("           "); // Espaço em branco para alinhar as colunas na saída
            
                // Percorre todas as colunas da primeira fileira e retorna o seu número
                for (int j = 0; j < salaDeCinema[0].length; j++) {
                   System.out.printf("%3d", j + 1); 
                }
                System.out.println();
                
                // Percorre todas as fileiras e retorna o número de fileiras
                for (int i = 0; i < salaDeCinema.length; i++) {
                   System.out.printf("Fileira %2d: ", i + 1); 
                   
                for (int j = 0; j < salaDeCinema[i].length; j++) { 
                   System.out.print("[" + salaDeCinema[i][j] + "]"); // Imprime os assentos
                }
                   System.out.println();
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
                
                break;
            
            case 5:
                // Encerra o programa
                System.out.println("Fechando a aplicação...");
                return; // Sai do método main, encerrando o programa
            
            default:
                // Opção inválida do menu
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0); // Loop continua até que opção 0 seja escolhida (não existe no menu)
        
        scanner.close();
    }
}