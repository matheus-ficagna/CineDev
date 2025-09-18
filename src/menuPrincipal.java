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
                   System.out.print("           "); // Espaço em branco para alinhar as colunas na saída
                   
            for (int j = 0; j < salaDeCinema[0].length; j++) { // Percorre todas as colunas da primeira fileira e retorna o seu número
                   System.out.printf("%3d", j + 1); 
            }
            System.out.println();

            for (int i = 0; i < salaDeCinema.length; i++) { // Percorre todas as fileiras e retorna o número de fileiras
                   System.out.printf("Fileira %2d: ", i + 1); 
                   
            for (int j = 0; j < salaDeCinema[i].length; j++) { 
                   System.out.print("[" + salaDeCinema[i][j] + "]"); // Imprime os assentos
            }
                   System.out.println();
            }
            break;

                    
            case 2:
                System.out.println("Selecione o assento desejado para compra:");
                
                
                break;
            
            case 3:
                
                break;
            
            case 4:
                
                break;
            
            case 5:
                
                break;
            
            default:
                
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
        
            scanner.close();
    }
}